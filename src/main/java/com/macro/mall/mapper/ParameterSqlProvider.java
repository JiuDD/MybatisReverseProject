package com.macro.mall.mapper;

import com.macro.mall.model.Parameter;
import io.swagger.annotations.ApiModelProperty;
import org.apache.ibatis.jdbc.SQL;

public class ParameterSqlProvider {
    public String insertSelective(Parameter record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_parameter");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUnitId() != null) {
            sql.VALUES("unit_id", "#{unitId,jdbcType=INTEGER}");
        }
        
        if (record.getParameterCode() != null) {
            sql.VALUES("parameter_code", "#{parameterCode,jdbcType=VARCHAR}");
        }
        
        if (record.getParameterName() != null) {
            sql.VALUES("parameter_name", "#{parameterName,jdbcType=VARCHAR}");
        }
        
        if (record.getParameterDesc() != null) {
            sql.VALUES("parameter_desc", "#{parameterDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getDataType() != null) {
            sql.VALUES("data_type", "#{dataType,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Parameter record) {
        SQL sql = new SQL();
        sql.UPDATE("t_parameter");
        
        if (record.getUnitId() != null) {
            sql.SET("unit_id = #{unitId,jdbcType=INTEGER}");
        }
        
        if (record.getParameterCode() != null) {
            sql.SET("parameter_code = #{parameterCode,jdbcType=VARCHAR}");
        }
        
        if (record.getParameterName() != null) {
            sql.SET("parameter_name = #{parameterName,jdbcType=VARCHAR}");
        }
        
        if (record.getParameterDesc() != null) {
            sql.SET("parameter_desc = #{parameterDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getDataType() != null) {
            sql.SET("data_type = #{dataType,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}