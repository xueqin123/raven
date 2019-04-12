package com.tim.group.restful.validator;

import com.tim.common.result.ResultCode;
import com.tim.group.restful.bean.model.GroupMemberModel;
import com.tim.group.restful.bean.model.GroupModel;
import com.tim.group.restful.mapper.GroupMemberMapper;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

/**
 * @author: bbpatience
 * @date: 2019/4/2
 * @description: UserValidator
 **/
@Component
public class MemberNotInValidator implements Validator {

    @Autowired
    private GroupMemberMapper memberMapper;

    private List<GroupMemberModel> models;

    @Override
    public boolean isValid(String groupId, List<String> members) {
        Example example = new Example(GroupMemberModel.class);
        example.createCriteria()
            .andNotEqualTo("status", 2)
            .andEqualTo("groupId", groupId)
            .andIn("memberUid", members);
        models = memberMapper.selectByExample(example);
        return models.size() == members.size();
    }

    @Override
    public ResultCode errorCode() {
        return ResultCode.GROUP_ERROR_MEMBER_NOT_IN;
    }
}
