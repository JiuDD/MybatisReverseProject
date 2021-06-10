package com.macro.mall.mapper;

import com.macro.mall.model.Parameter;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ParameterMapper {
    @Delete({
        "delete from t_parameter",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into t_parameter (id, unit_id, ",
        "parameter_code, parameter_name, ",
        "parameter_desc, data_type)",
        "values (#{id,jdbcType=INTEGER}, #{unitId,jdbcType=INTEGER}, ",
        "#{parameterCode,jdbcType=VARCHAR}, #{parameterName,jdbcType=VARCHAR}, ",
        "#{parameterDesc,jdbcType=VARCHAR}, #{dataType,jdbcType=VARCHAR})"
    })
    int insert(Parameter record);

    @InsertProvider(type=ParameterSqlProvider.class, method="insertSelective")
    int insertSelective(Parameter record);

    @Select({
        "select",
        "id, unit_id, parameter_code, parameter_name, parameter_desc, data_type",
        "from t_parameter",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="unit_id", property="unitId", jdbcType=JdbcType.INTEGER),
        @Result(column="parameter_code", property="parameterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="parameter_name", property="parameterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="parameter_desc", property="parameterDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_type", property="dataType", jdbcType=JdbcType.VARCHAR)
    })
    Parameter selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ParameterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Parameter record);

    @Update({
        "update t_parameter",
        "set unit_id = #{unitId,jdbcType=INTEGER},",
          "parameter_code = #{parameterCode,jdbcType=VARCHAR},",
          "parameter_name = #{parameterName,jdbcType=VARCHAR},",
          "parameter_desc = #{parameterDesc,jdbcType=VARCHAR},",
          "data_type = #{dataType,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Parameter record);
}