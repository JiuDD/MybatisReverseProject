package com.dadiyw.sop.entity.excel;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class OrderDetailReportModel implements Serializable {

    private Date DATA_DATE;

    private String ORDER_CODE;

    private String GOODS_CODE;

    private String GOODS_NAME;

    private String PRODUCT_CODE;

    private String PRODUCT_NAME;

    private Long PORDUCT_NUM;

    private Long EXCEED_NUMBER;

    private Integer YEAR;

    private Integer MONTH;

    private static final long serialVersionUID = 1L;
}