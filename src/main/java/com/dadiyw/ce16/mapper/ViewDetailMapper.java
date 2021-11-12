package com.dadiyw.ce16.mapper;

import com.dadiyw.ce16.model.ViewDetail;
import com.dadiyw.ce16.model.ViewDetailExample;
import java.util.List;

public interface ViewDetailMapper {
    int insert(ViewDetail record);

    int insertSelective(ViewDetail record);

    List<ViewDetail> selectByExample(ViewDetailExample example);
}