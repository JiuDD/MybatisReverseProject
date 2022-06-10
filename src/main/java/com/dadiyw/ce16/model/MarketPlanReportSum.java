package com.dadiyw.ce16.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

/**
 * Database Table Remarks:
 *   数据库此表没有注释
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table DM_CE18_MARKET_PLAN_REPORT_SUM
 */


@ApiModel(value="数据库此表没有注释")
@Data
@ToString
public class MarketPlanReportSum implements Serializable {
    @ApiModelProperty(value = "商户id")
    private Date DATA_DATE;

    @ApiModelProperty(value = "商户id")
    private String MID_CODE;

    @ApiModelProperty(value = "计划id")
    private String PLAN_CODE;

    @ApiModelProperty(value = "计划人群")
    private String PLAN_GROUP;

    @ApiModelProperty(value = "访问总人数")
    private Long UV_PLAN;

    @ApiModelProperty(value = "订单总金额")
    private BigDecimal OA_PAY_PLAN;

    @ApiModelProperty(value = "订单总数量")
    private Long OQ_PAY_PLAN;

    @ApiModelProperty(value = "付款总人数")
    private Long NC_PAY_PLAN;

    @ApiModelProperty(value = "访问支付转化率")
    private BigDecimal NC_VI_PAY_CO;

    private static final long serialVersionUID = 1L;

    public Date getDATA_DATE() {
        return DATA_DATE;
    }

    public void setDATA_DATE(Date DATA_DATE) {
        this.DATA_DATE = DATA_DATE;
    }

    public String getMID_CODE() {
        return MID_CODE;
    }

    public void setMID_CODE(String MID_CODE) {
        this.MID_CODE = MID_CODE == null ? null : MID_CODE.trim();
    }

    public String getPLAN_CODE() {
        return PLAN_CODE;
    }

    public void setPLAN_CODE(String PLAN_CODE) {
        this.PLAN_CODE = PLAN_CODE == null ? null : PLAN_CODE.trim();
    }

    public String getPLAN_GROUP() {
        return PLAN_GROUP;
    }

    public void setPLAN_GROUP(String PLAN_GROUP) {
        this.PLAN_GROUP = PLAN_GROUP == null ? null : PLAN_GROUP.trim();
    }

    public Long getUV_PLAN() {
        return UV_PLAN;
    }

    public void setUV_PLAN(Long UV_PLAN) {
        this.UV_PLAN = UV_PLAN;
    }

    public BigDecimal getOA_PAY_PLAN() {
        return OA_PAY_PLAN;
    }

    public void setOA_PAY_PLAN(BigDecimal OA_PAY_PLAN) {
        this.OA_PAY_PLAN = OA_PAY_PLAN;
    }

    public Long getOQ_PAY_PLAN() {
        return OQ_PAY_PLAN;
    }

    public void setOQ_PAY_PLAN(Long OQ_PAY_PLAN) {
        this.OQ_PAY_PLAN = OQ_PAY_PLAN;
    }

    public Long getNC_PAY_PLAN() {
        return NC_PAY_PLAN;
    }

    public void setNC_PAY_PLAN(Long NC_PAY_PLAN) {
        this.NC_PAY_PLAN = NC_PAY_PLAN;
    }

    public BigDecimal getNC_VI_PAY_CO() {
        return NC_VI_PAY_CO;
    }

    public void setNC_VI_PAY_CO(BigDecimal NC_VI_PAY_CO) {
        this.NC_VI_PAY_CO = NC_VI_PAY_CO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", DATA_DATE=").append(DATA_DATE);
        sb.append(", MID_CODE=").append(MID_CODE);
        sb.append(", PLAN_CODE=").append(PLAN_CODE);
        sb.append(", PLAN_GROUP=").append(PLAN_GROUP);
        sb.append(", UV_PLAN=").append(UV_PLAN);
        sb.append(", OA_PAY_PLAN=").append(OA_PAY_PLAN);
        sb.append(", OQ_PAY_PLAN=").append(OQ_PAY_PLAN);
        sb.append(", NC_PAY_PLAN=").append(NC_PAY_PLAN);
        sb.append(", NC_VI_PAY_CO=").append(NC_VI_PAY_CO);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}