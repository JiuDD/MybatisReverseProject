package cn.ce.cesupport.sma.dao;

import cn.ce.cesupport.sma.entity.EmployeeIntentClueWhiteList;
import cn.ce.cesupport.sma.entity.EmployeeIntentClueWhiteListExample;
import java.util.List;

public interface EmployeeIntentClueWhiteListMapper {
    int deleteByPrimaryKey(String id);

    int insert(EmployeeIntentClueWhiteList record);

    int insertSelective(EmployeeIntentClueWhiteList record);

    List<EmployeeIntentClueWhiteList> selectByExample(EmployeeIntentClueWhiteListExample example);

    EmployeeIntentClueWhiteList selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EmployeeIntentClueWhiteList record);

    int updateByPrimaryKey(EmployeeIntentClueWhiteList record);
}