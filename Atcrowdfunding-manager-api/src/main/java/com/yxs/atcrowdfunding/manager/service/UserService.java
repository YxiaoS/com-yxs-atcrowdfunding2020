package com.yxs.atcrowdfunding.manager.service;

import com.yxs.atcrowdfunding.bean.User;

import java.util.Map;

public interface UserService {

    User queryBylogin(Map<String, Object> paramMap);
}
