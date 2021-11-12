package com.dadiyw.ce16.mapper;

import com.dadiyw.ce16.model.ReportMarketSummary;
import com.dadiyw.ce16.model.ReportMarketSummaryExample;
import java.util.List;

public interface ReportMarketSummaryMapper {
    int insert(ReportMarketSummary record);

    int insertSelective(ReportMarketSummary record);

    List<ReportMarketSummary> selectByExample(ReportMarketSummaryExample example);
}