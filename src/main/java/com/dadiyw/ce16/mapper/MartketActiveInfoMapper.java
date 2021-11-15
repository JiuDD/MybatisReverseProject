package com.dadiyw.ce16.mapper;

import com.dadiyw.ce16.model.MartketActiveInfo;
import com.dadiyw.ce16.model.MartketActiveInfoExample;
import java.util.List;

public interface MartketActiveInfoMapper {
    int insert(MartketActiveInfo record);

    int insertSelective(MartketActiveInfo record);

    List<MartketActiveInfo> selectByExample(MartketActiveInfoExample example);
}