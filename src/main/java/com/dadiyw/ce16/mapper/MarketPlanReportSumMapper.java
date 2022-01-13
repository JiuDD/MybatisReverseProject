package com.dadiyw.ce16.mapper;

import com.dadiyw.ce16.model.MarketPlanReportSum;
import com.dadiyw.ce16.model.MarketPlanReportSumExample;
import java.util.List;

public interface MarketPlanReportSumMapper {
    int insert(MarketPlanReportSum record);

    int insertSelective(MarketPlanReportSum record);

    List<MarketPlanReportSum> selectByExample(MarketPlanReportSumExample example);
}