package com.dadiyw.dsl.dao;

import com.dadiyw.dsl.model.Dsl;

public interface DslMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dsl record);

    int insertSelective(Dsl record);

    Dsl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dsl record);

    int updateByPrimaryKey(Dsl record);
}