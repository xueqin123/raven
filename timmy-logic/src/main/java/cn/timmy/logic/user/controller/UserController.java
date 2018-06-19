package cn.timmy.logic.user.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import cn.timmy.logic.common.Result;
import cn.timmy.logic.security.SecurityUtils;
import cn.timmy.logic.user.bean.LoginInputParam;
import cn.timmy.logic.user.bean.RegisterParam;
import cn.timmy.logic.user.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author zxx
 * Description 用户接口
 * Date Created on 2018/6/12
 */
@RestController
@RequestMapping(value = "/user", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public class UserController {

    private static final Logger logger = LogManager.getLogger(
        UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(@RequestBody RegisterParam param) {
        logger.info("name:{} register username:{}", param.getName(), param.getUsername());
        return userService.register(param);
    }

    @PostMapping("/login")
    public Result login(HttpServletRequest request, HttpServletResponse response,
        @RequestBody LoginInputParam param) {
        logger.info("username:{} login", param.getUsername());
        return userService.login(request, response, param);
    }

    @PostMapping("/logout")
    public Result logout(HttpServletRequest request, HttpServletResponse response) {
        logger.info("uid:{} logout", SecurityUtils.getUid());
        return userService.logout(request, response);
    }

}