package cn.timmy.logic.user.service.impl;

import cn.timmy.common.utils.DateTimeUtils;
import cn.timmy.logic.common.Result;
import cn.timmy.logic.common.ResultCode;
import cn.timmy.logic.user.bean.LoginInputParam;
import cn.timmy.logic.user.bean.RegisterParam;
import cn.timmy.logic.user.bean.UserModel;
import cn.timmy.logic.user.mapper.UserMapper;
import cn.timmy.logic.user.service.UserService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LogManager.getLogger(
        UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public Result register(RegisterParam param) {
        Example example = new Example(UserModel.class);
        example.createCriteria().andEqualTo("username", param.getUsername());
        List<UserModel> models = userMapper.selectByExample(example);
        if (!models.isEmpty()) {
            return Result.failure(ResultCode.ERROR);
        }
        String salt = BCrypt.gensalt();
        String password = BCrypt.hashpw(param.getPassword(), salt);
        UserModel model = new UserModel();
        model.setUsername(param.getUsername());
        model.setPassword(password);
        model.setCreate_dt(DateTimeUtils.currentUTC());
        model.setName(param.getName());
        userMapper.insertSelective(model);
        return Result.success();
    }

    @Override
    public Result login(HttpServletRequest request, HttpServletResponse response,
        LoginInputParam param) {
        Authentication token = new UsernamePasswordAuthenticationToken(param.getUsername(),
            param.getPassword());
        token = authenticationManager.authenticate(token);
        SecurityContextHolder.getContext().setAuthentication(token);
        return Result.success();
    }

    @Override
    public UserModel getUserByUsername(String username) {
        Example example = new Example(UserModel.class);
        example.createCriteria().andEqualTo("username", username);
        return userMapper.selectOneByExample(example);
    }

    @Override
    public Result logout(HttpServletRequest request, HttpServletResponse response) {
        SecurityContextHolder.clearContext();
        return Result.success();
    }
}