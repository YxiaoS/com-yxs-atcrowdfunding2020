package com.yxs.atcrowdfunding.manager.dao;

import com.yxs.atcrowdfunding.bean.Role;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    Role selectByPrimaryKey(Integer id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}