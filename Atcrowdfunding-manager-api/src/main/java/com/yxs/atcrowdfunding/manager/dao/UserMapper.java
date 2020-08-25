package com.yxs.atcrowdfunding.manager.dao;

import com.yxs.atcrowdfunding.bean.User;
import java.util.List;
import java.util.Map;

public interface UserMapper {

    User queryBylogin(Map<String, Object> paramMap) ;

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

	User queryUserlogin(Map<String, Object> paramMap);
}