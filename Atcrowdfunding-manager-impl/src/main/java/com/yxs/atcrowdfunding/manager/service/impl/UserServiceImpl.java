package com.yxs.atcrowdfunding.manager.service.impl;

import com.yxs.atcrowdfunding.bean.User;
import com.yxs.atcrowdfunding.exception.LoginFailException;
import com.yxs.atcrowdfunding.manager.dao.UserMapper;
import com.yxs.atcrowdfunding.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryBylogin(Map<String, Object> paramMap) {

        User user = userMapper.queryBylogin(paramMap);

        if (user==null){
            throw new LoginFailException("用户账号或密码不正确");
        }
        return user;
    }
}
