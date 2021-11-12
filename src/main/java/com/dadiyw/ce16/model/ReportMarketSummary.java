package com.dadiyw.ce16.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * Database Table Remarks:
 *   数据库此表没有注释
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table DM_CE16_REPORT_MARKET_SUMMARY
 */


@ApiModel(value="数据库此表没有注释")
@Data
public class ReportMarketSummary implements Serializable {
    @ApiModelProperty(value = "数据日期")
    private Date DATA_DATE;

    @ApiModelProperty(value = "商户ID")
    private String MID_CODE;

    @ApiModelProperty(value = "机构ID")
    private String SHOP_CODE;

    @ApiModelProperty(value = "总支付金额")
    private BigDecimal oa_pay;

    @ApiModelProperty(value = "营销支付金额")
    private BigDecimal oa_mkpay;

    @ApiModelProperty(value = "营销支付金额占比 营销支付金额/总支付金额")
    private BigDecimal oa_mkpay_sh;

    @ApiModelProperty(value = "营销优惠金额")
    private BigDecimal da_mkpay;

    @ApiModelProperty(value = "支付ROI 营销支付金额/营销优惠金额")
    private BigDecimal roi_mkpay;

    @ApiModelProperty(value = "营销支付人数")
    private Long nc_mkpay;

    @ApiModelProperty(value = "营销客单价 营销支付金额/营销支付人数")
    private BigDecimal atv_mkpay;

    @ApiModelProperty(value = "活动总数量")
    private Long act_nu_mkty;

    @ApiModelProperty(value = "优惠券数量")
    private Long act_nu_mkty_1;

    @ApiModelProperty(value = "优惠券占比")
    private BigDecimal act_nu_mkty_sh_1;

    @ApiModelProperty(value = "多人拼团数量")
    private Long act_nu_mkty_2;

    @ApiModelProperty(value = "多人拼团占比")
    private BigDecimal act_nu_mkty_sh_2;

    @ApiModelProperty(value = "秒杀数量")
    private Long act_nu_mkty_3;

    @ApiModelProperty(value = "秒杀占比")
    private BigDecimal act_nu_mkty_sh_3;

    @ApiModelProperty(value = "满减送数量")
    private Long act_nu_mkty_4;

    @ApiModelProperty(value = "满减送占比")
    private BigDecimal act_nu_mkty_sh_4;

    @ApiModelProperty(value = "限时折扣数量")
    private Long act_nu_mkty_5;

    @ApiModelProperty(value = "限时折扣占比")
    private BigDecimal act_nu_mkty_sh_5;

    @ApiModelProperty(value = "非营销支付金额 总支付金额-营销支付金额")
    private BigDecimal oa_unmkpay;

    @ApiModelProperty(value = "老成交客户")
    private Long old_nc_mkpay;

    @ApiModelProperty(value = "新成交客户")
    private Long new_nc_mkpay;

    @ApiModelProperty(value = "营销支付件数")
    private Long sv_mkpay;

    @ApiModelProperty(value = "营销支付订单数")
    private Long oq_mkpay;

    @ApiModelProperty(value = "连带率 营销支付件数/营销支付订单数")
    private BigDecimal apr_mkpay;

    @ApiModelProperty(value = "营销下单人数")
    private Long nc_mkpl;

    @ApiModelProperty(value = "下单支付转化率 支付人数/下单人数")
    private BigDecimal nc_mkpl_pay_co;

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

    public String getSHOP_CODE() {
        return SHOP_CODE;
    }

    public void setSHOP_CODE(String SHOP_CODE) {
        this.SHOP_CODE = SHOP_CODE == null ? null : SHOP_CODE.trim();
    }

    public BigDecimal getOa_pay() {
        return oa_pay;
    }

    public void setOa_pay(BigDecimal oa_pay) {
        this.oa_pay = oa_pay;
    }

    public BigDecimal getOa_mkpay() {
        return oa_mkpay;
    }

    public void setOa_mkpay(BigDecimal oa_mkpay) {
        this.oa_mkpay = oa_mkpay;
    }

    public BigDecimal getOa_mkpay_sh() {
        return oa_mkpay_sh;
    }

    public void setOa_mkpay_sh(BigDecimal oa_mkpay_sh) {
        this.oa_mkpay_sh = oa_mkpay_sh;
    }

    public BigDecimal getDa_mkpay() {
        return da_mkpay;
    }

    public void setDa_mkpay(BigDecimal da_mkpay) {
        this.da_mkpay = da_mkpay;
    }

    public BigDecimal getRoi_mkpay() {
        return roi_mkpay;
    }

    public void setRoi_mkpay(BigDecimal roi_mkpay) {
        this.roi_mkpay = roi_mkpay;
    }

    public Long getNc_mkpay() {
        return nc_mkpay;
    }

    public void setNc_mkpay(Long nc_mkpay) {
        this.nc_mkpay = nc_mkpay;
    }

    public BigDecimal getAtv_mkpay() {
        return atv_mkpay;
    }

    public void setAtv_mkpay(BigDecimal atv_mkpay) {
        this.atv_mkpay = atv_mkpay;
    }

    public Long getAct_nu_mkty() {
        return act_nu_mkty;
    }

    public void setAct_nu_mkty(Long act_nu_mkty) {
        this.act_nu_mkty = act_nu_mkty;
    }

    public Long getAct_nu_mkty_1() {
        return act_nu_mkty_1;
    }

    public void setAct_nu_mkty_1(Long act_nu_mkty_1) {
        this.act_nu_mkty_1 = act_nu_mkty_1;
    }

    public BigDecimal getAct_nu_mkty_sh_1() {
        return act_nu_mkty_sh_1;
    }

    public void setAct_nu_mkty_sh_1(BigDecimal act_nu_mkty_sh_1) {
        this.act_nu_mkty_sh_1 = act_nu_mkty_sh_1;
    }

    public Long getAct_nu_mkty_2() {
        return act_nu_mkty_2;
    }

    public void setAct_nu_mkty_2(Long act_nu_mkty_2) {
        this.act_nu_mkty_2 = act_nu_mkty_2;
    }

    public BigDecimal getAct_nu_mkty_sh_2() {
        return act_nu_mkty_sh_2;
    }

    public void setAct_nu_mkty_sh_2(BigDecimal act_nu_mkty_sh_2) {
        this.act_nu_mkty_sh_2 = act_nu_mkty_sh_2;
    }

    public Long getAct_nu_mkty_3() {
        return act_nu_mkty_3;
    }

    public void setAct_nu_mkty_3(Long act_nu_mkty_3) {
        this.act_nu_mkty_3 = act_nu_mkty_3;
    }

    public BigDecimal getAct_nu_mkty_sh_3() {
        return act_nu_mkty_sh_3;
    }

    public void setAct_nu_mkty_sh_3(BigDecimal act_nu_mkty_sh_3) {
        this.act_nu_mkty_sh_3 = act_nu_mkty_sh_3;
    }

    public Long getAct_nu_mkty_4() {
        return act_nu_mkty_4;
    }

    public void setAct_nu_mkty_4(Long act_nu_mkty_4) {
        this.act_nu_mkty_4 = act_nu_mkty_4;
    }

    public BigDecimal getAct_nu_mkty_sh_4() {
        return act_nu_mkty_sh_4;
    }

    public void setAct_nu_mkty_sh_4(BigDecimal act_nu_mkty_sh_4) {
        this.act_nu_mkty_sh_4 = act_nu_mkty_sh_4;
    }

    public Long getAct_nu_mkty_5() {
        return act_nu_mkty_5;
    }

    public void setAct_nu_mkty_5(Long act_nu_mkty_5) {
        this.act_nu_mkty_5 = act_nu_mkty_5;
    }

    public BigDecimal getAct_nu_mkty_sh_5() {
        return act_nu_mkty_sh_5;
    }

    public void setAct_nu_mkty_sh_5(BigDecimal act_nu_mkty_sh_5) {
        this.act_nu_mkty_sh_5 = act_nu_mkty_sh_5;
    }

    public BigDecimal getOa_unmkpay() {
        return oa_unmkpay;
    }

    public void setOa_unmkpay(BigDecimal oa_unmkpay) {
        this.oa_unmkpay = oa_unmkpay;
    }

    public Long getOld_nc_mkpay() {
        return old_nc_mkpay;
    }

    public void setOld_nc_mkpay(Long old_nc_mkpay) {
        this.old_nc_mkpay = old_nc_mkpay;
    }

    public Long getNew_nc_mkpay() {
        return new_nc_mkpay;
    }

    public void setNew_nc_mkpay(Long new_nc_mkpay) {
        this.new_nc_mkpay = new_nc_mkpay;
    }

    public Long getSv_mkpay() {
        return sv_mkpay;
    }

    public void setSv_mkpay(Long sv_mkpay) {
        this.sv_mkpay = sv_mkpay;
    }

    public Long getOq_mkpay() {
        return oq_mkpay;
    }

    public void setOq_mkpay(Long oq_mkpay) {
        this.oq_mkpay = oq_mkpay;
    }

    public BigDecimal getApr_mkpay() {
        return apr_mkpay;
    }

    public void setApr_mkpay(BigDecimal apr_mkpay) {
        this.apr_mkpay = apr_mkpay;
    }

    public Long getNc_mkpl() {
        return nc_mkpl;
    }

    public void setNc_mkpl(Long nc_mkpl) {
        this.nc_mkpl = nc_mkpl;
    }

    public BigDecimal getNc_mkpl_pay_co() {
        return nc_mkpl_pay_co;
    }

    public void setNc_mkpl_pay_co(BigDecimal nc_mkpl_pay_co) {
        this.nc_mkpl_pay_co = nc_mkpl_pay_co;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", DATA_DATE=").append(DATA_DATE);
        sb.append(", MID_CODE=").append(MID_CODE);
        sb.append(", SHOP_CODE=").append(SHOP_CODE);
        sb.append(", oa_pay=").append(oa_pay);
        sb.append(", oa_mkpay=").append(oa_mkpay);
        sb.append(", oa_mkpay_sh=").append(oa_mkpay_sh);
        sb.append(", da_mkpay=").append(da_mkpay);
        sb.append(", roi_mkpay=").append(roi_mkpay);
        sb.append(", nc_mkpay=").append(nc_mkpay);
        sb.append(", atv_mkpay=").append(atv_mkpay);
        sb.append(", act_nu_mkty=").append(act_nu_mkty);
        sb.append(", act_nu_mkty_1=").append(act_nu_mkty_1);
        sb.append(", act_nu_mkty_sh_1=").append(act_nu_mkty_sh_1);
        sb.append(", act_nu_mkty_2=").append(act_nu_mkty_2);
        sb.append(", act_nu_mkty_sh_2=").append(act_nu_mkty_sh_2);
        sb.append(", act_nu_mkty_3=").append(act_nu_mkty_3);
        sb.append(", act_nu_mkty_sh_3=").append(act_nu_mkty_sh_3);
        sb.append(", act_nu_mkty_4=").append(act_nu_mkty_4);
        sb.append(", act_nu_mkty_sh_4=").append(act_nu_mkty_sh_4);
        sb.append(", act_nu_mkty_5=").append(act_nu_mkty_5);
        sb.append(", act_nu_mkty_sh_5=").append(act_nu_mkty_sh_5);
        sb.append(", oa_unmkpay=").append(oa_unmkpay);
        sb.append(", old_nc_mkpay=").append(old_nc_mkpay);
        sb.append(", new_nc_mkpay=").append(new_nc_mkpay);
        sb.append(", sv_mkpay=").append(sv_mkpay);
        sb.append(", oq_mkpay=").append(oq_mkpay);
        sb.append(", apr_mkpay=").append(apr_mkpay);
        sb.append(", nc_mkpl=").append(nc_mkpl);
        sb.append(", nc_mkpl_pay_co=").append(nc_mkpl_pay_co);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}