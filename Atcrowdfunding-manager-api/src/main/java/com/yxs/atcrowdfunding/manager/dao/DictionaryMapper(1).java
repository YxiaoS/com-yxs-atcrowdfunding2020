package com.yxs.atcrowdfunding.manager.dao;

import com.yxs.atcrowdfunding.bean.Dictionary;
import java.util.List;

interface DictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dictionary record);

    Dictionary selectByPrimaryKey(Integer id);

    List<Dictionary> selectAll();

    int updateByPrimaryKey(Dictionary record);
}