package com.dadiyw.be01;

import com.dadiyw.be01.ReportSeoEqid;
import com.dadiyw.be01.ReportSeoEqidExample;
import java.util.List;

public interface ReportSeoEqidMapper {
    int insert(ReportSeoEqid record);

    int insertSelective(ReportSeoEqid record);

    List<ReportSeoEqid> selectByExample(ReportSeoEqidExample example);
}