package com.dadiyw.sop;

import com.dadiyw.sop.entity.excel.OrderDetailReportModel;
import com.dadiyw.sop.entity.excel.OrderDetailReportModelExample;
import java.util.List;

public interface OrderDetailReportModelMapper {
    int insert(OrderDetailReportModel record);

    int insertSelective(OrderDetailReportModel record);

    List<OrderDetailReportModel> selectByExample(OrderDetailReportModelExample example);
}