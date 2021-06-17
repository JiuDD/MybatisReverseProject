package com.macro.mall.mapper;

import com.macro.mall.model.ViewDetail;

public interface ViewDetailMapper {
    int insert(ViewDetail record);

    int insertSelective(ViewDetail record);
}