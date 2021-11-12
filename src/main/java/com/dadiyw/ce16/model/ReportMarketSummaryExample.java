package com.dadiyw.ce16.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportMarketSummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportMarketSummaryExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDATA_DATEIsNull() {
            addCriterion("DATA_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDATA_DATEIsNotNull() {
            addCriterion("DATA_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDATA_DATEEqualTo(Date value) {
            addCriterionForJDBCDate("DATA_DATE =", value, "DATA_DATE");
            return (Criteria) this;
        }

        public Criteria andDATA_DATENotEqualTo(Date value) {
            addCriterionForJDBCDate("DATA_DATE <>", value, "DATA_DATE");
            return (Criteria) this;
        }

        public Criteria andDATA_DATEGreaterThan(Date value) {
            addCriterionForJDBCDate("DATA_DATE >", value, "DATA_DATE");
            return (Criteria) this;
        }

        public Criteria andDATA_DATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATA_DATE >=", value, "DATA_DATE");
            return (Criteria) this;
        }

        public Criteria andDATA_DATELessThan(Date value) {
            addCriterionForJDBCDate("DATA_DATE <", value, "DATA_DATE");
            return (Criteria) this;
        }

        public Criteria andDATA_DATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATA_DATE <=", value, "DATA_DATE");
            return (Criteria) this;
        }

        public Criteria andDATA_DATEIn(List<Date> values) {
            addCriterionForJDBCDate("DATA_DATE in", values, "DATA_DATE");
            return (Criteria) this;
        }

        public Criteria andDATA_DATENotIn(List<Date> values) {
            addCriterionForJDBCDate("DATA_DATE not in", values, "DATA_DATE");
            return (Criteria) this;
        }

        public Criteria andDATA_DATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATA_DATE between", value1, value2, "DATA_DATE");
            return (Criteria) this;
        }

        public Criteria andDATA_DATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATA_DATE not between", value1, value2, "DATA_DATE");
            return (Criteria) this;
        }

        public Criteria andMID_CODEIsNull() {
            addCriterion("MID_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMID_CODEIsNotNull() {
            addCriterion("MID_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMID_CODEEqualTo(String value) {
            addCriterion("MID_CODE =", value, "MID_CODE");
            return (Criteria) this;
        }

        public Criteria andMID_CODENotEqualTo(String value) {
            addCriterion("MID_CODE <>", value, "MID_CODE");
            return (Criteria) this;
        }

        public Criteria andMID_CODEGreaterThan(String value) {
            addCriterion("MID_CODE >", value, "MID_CODE");
            return (Criteria) this;
        }

        public Criteria andMID_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("MID_CODE >=", value, "MID_CODE");
            return (Criteria) this;
        }

        public Criteria andMID_CODELessThan(String value) {
            addCriterion("MID_CODE <", value, "MID_CODE");
            return (Criteria) this;
        }

        public Criteria andMID_CODELessThanOrEqualTo(String value) {
            addCriterion("MID_CODE <=", value, "MID_CODE");
            return (Criteria) this;
        }

        public Criteria andMID_CODELike(String value) {
            addCriterion("MID_CODE like", value, "MID_CODE");
            return (Criteria) this;
        }

        public Criteria andMID_CODENotLike(String value) {
            addCriterion("MID_CODE not like", value, "MID_CODE");
            return (Criteria) this;
        }

        public Criteria andMID_CODEIn(List<String> values) {
            addCriterion("MID_CODE in", values, "MID_CODE");
            return (Criteria) this;
        }

        public Criteria andMID_CODENotIn(List<String> values) {
            addCriterion("MID_CODE not in", values, "MID_CODE");
            return (Criteria) this;
        }

        public Criteria andMID_CODEBetween(String value1, String value2) {
            addCriterion("MID_CODE between", value1, value2, "MID_CODE");
            return (Criteria) this;
        }

        public Criteria andMID_CODENotBetween(String value1, String value2) {
            addCriterion("MID_CODE not between", value1, value2, "MID_CODE");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODEIsNull() {
            addCriterion("SHOP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODEIsNotNull() {
            addCriterion("SHOP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODEEqualTo(String value) {
            addCriterion("SHOP_CODE =", value, "SHOP_CODE");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODENotEqualTo(String value) {
            addCriterion("SHOP_CODE <>", value, "SHOP_CODE");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODEGreaterThan(String value) {
            addCriterion("SHOP_CODE >", value, "SHOP_CODE");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_CODE >=", value, "SHOP_CODE");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODELessThan(String value) {
            addCriterion("SHOP_CODE <", value, "SHOP_CODE");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODELessThanOrEqualTo(String value) {
            addCriterion("SHOP_CODE <=", value, "SHOP_CODE");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODELike(String value) {
            addCriterion("SHOP_CODE like", value, "SHOP_CODE");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODENotLike(String value) {
            addCriterion("SHOP_CODE not like", value, "SHOP_CODE");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODEIn(List<String> values) {
            addCriterion("SHOP_CODE in", values, "SHOP_CODE");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODENotIn(List<String> values) {
            addCriterion("SHOP_CODE not in", values, "SHOP_CODE");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODEBetween(String value1, String value2) {
            addCriterion("SHOP_CODE between", value1, value2, "SHOP_CODE");
            return (Criteria) this;
        }

        public Criteria andSHOP_CODENotBetween(String value1, String value2) {
            addCriterion("SHOP_CODE not between", value1, value2, "SHOP_CODE");
            return (Criteria) this;
        }

        public Criteria andOa_payIsNull() {
            addCriterion("oa_pay is null");
            return (Criteria) this;
        }

        public Criteria andOa_payIsNotNull() {
            addCriterion("oa_pay is not null");
            return (Criteria) this;
        }

        public Criteria andOa_payEqualTo(BigDecimal value) {
            addCriterion("oa_pay =", value, "oa_pay");
            return (Criteria) this;
        }

        public Criteria andOa_payNotEqualTo(BigDecimal value) {
            addCriterion("oa_pay <>", value, "oa_pay");
            return (Criteria) this;
        }

        public Criteria andOa_payGreaterThan(BigDecimal value) {
            addCriterion("oa_pay >", value, "oa_pay");
            return (Criteria) this;
        }

        public Criteria andOa_payGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("oa_pay >=", value, "oa_pay");
            return (Criteria) this;
        }

        public Criteria andOa_payLessThan(BigDecimal value) {
            addCriterion("oa_pay <", value, "oa_pay");
            return (Criteria) this;
        }

        public Criteria andOa_payLessThanOrEqualTo(BigDecimal value) {
            addCriterion("oa_pay <=", value, "oa_pay");
            return (Criteria) this;
        }

        public Criteria andOa_payIn(List<BigDecimal> values) {
            addCriterion("oa_pay in", values, "oa_pay");
            return (Criteria) this;
        }

        public Criteria andOa_payNotIn(List<BigDecimal> values) {
            addCriterion("oa_pay not in", values, "oa_pay");
            return (Criteria) this;
        }

        public Criteria andOa_payBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oa_pay between", value1, value2, "oa_pay");
            return (Criteria) this;
        }

        public Criteria andOa_payNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oa_pay not between", value1, value2, "oa_pay");
            return (Criteria) this;
        }

        public Criteria andOa_mkpayIsNull() {
            addCriterion("oa_mkpay is null");
            return (Criteria) this;
        }

        public Criteria andOa_mkpayIsNotNull() {
            addCriterion("oa_mkpay is not null");
            return (Criteria) this;
        }

        public Criteria andOa_mkpayEqualTo(BigDecimal value) {
            addCriterion("oa_mkpay =", value, "oa_mkpay");
            return (Criteria) this;
        }

        public Criteria andOa_mkpayNotEqualTo(BigDecimal value) {
            addCriterion("oa_mkpay <>", value, "oa_mkpay");
            return (Criteria) this;
        }

        public Criteria andOa_mkpayGreaterThan(BigDecimal value) {
            addCriterion("oa_mkpay >", value, "oa_mkpay");
            return (Criteria) this;
        }

        public Criteria andOa_mkpayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("oa_mkpay >=", value, "oa_mkpay");
            return (Criteria) this;
        }

        public Criteria andOa_mkpayLessThan(BigDecimal value) {
            addCriterion("oa_mkpay <", value, "oa_mkpay");
            return (Criteria) this;
        }

        public Criteria andOa_mkpayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("oa_mkpay <=", value, "oa_mkpay");
            return (Criteria) this;
        }

        public Criteria andOa_mkpayIn(List<BigDecimal> values) {
            addCriterion("oa_mkpay in", values, "oa_mkpay");
            return (Criteria) this;
        }

        public Criteria andOa_mkpayNotIn(List<BigDecimal> values) {
            addCriterion("oa_mkpay not in", values, "oa_mkpay");
            return (Criteria) this;
        }

        public Criteria andOa_mkpayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oa_mkpay between", value1, value2, "oa_mkpay");
            return (Criteria) this;
        }

        public Criteria andOa_mkpayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oa_mkpay not between", value1, value2, "oa_mkpay");
            return (Criteria) this;
        }

        public Criteria andOa_mkpay_shIsNull() {
            addCriterion("oa_mkpay_sh is null");
            return (Criteria) this;
        }

        public Criteria andOa_mkpay_shIsNotNull() {
            addCriterion("oa_mkpay_sh is not null");
            return (Criteria) this;
        }

        public Criteria andOa_mkpay_shEqualTo(BigDecimal value) {
            addCriterion("oa_mkpay_sh =", value, "oa_mkpay_sh");
            return (Criteria) this;
        }

        public Criteria andOa_mkpay_shNotEqualTo(BigDecimal value) {
            addCriterion("oa_mkpay_sh <>", value, "oa_mkpay_sh");
            return (Criteria) this;
        }

        public Criteria andOa_mkpay_shGreaterThan(BigDecimal value) {
            addCriterion("oa_mkpay_sh >", value, "oa_mkpay_sh");
            return (Criteria) this;
        }

        public Criteria andOa_mkpay_shGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("oa_mkpay_sh >=", value, "oa_mkpay_sh");
            return (Criteria) this;
        }

        public Criteria andOa_mkpay_shLessThan(BigDecimal value) {
            addCriterion("oa_mkpay_sh <", value, "oa_mkpay_sh");
            return (Criteria) this;
        }

        public Criteria andOa_mkpay_shLessThanOrEqualTo(BigDecimal value) {
            addCriterion("oa_mkpay_sh <=", value, "oa_mkpay_sh");
            return (Criteria) this;
        }

        public Criteria andOa_mkpay_shIn(List<BigDecimal> values) {
            addCriterion("oa_mkpay_sh in", values, "oa_mkpay_sh");
            return (Criteria) this;
        }

        public Criteria andOa_mkpay_shNotIn(List<BigDecimal> values) {
            addCriterion("oa_mkpay_sh not in", values, "oa_mkpay_sh");
            return (Criteria) this;
        }

        public Criteria andOa_mkpay_shBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oa_mkpay_sh between", value1, value2, "oa_mkpay_sh");
            return (Criteria) this;
        }

        public Criteria andOa_mkpay_shNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oa_mkpay_sh not between", value1, value2, "oa_mkpay_sh");
            return (Criteria) this;
        }

        public Criteria andDa_mkpayIsNull() {
            addCriterion("da_mkpay is null");
            return (Criteria) this;
        }

        public Criteria andDa_mkpayIsNotNull() {
            addCriterion("da_mkpay is not null");
            return (Criteria) this;
        }

        public Criteria andDa_mkpayEqualTo(BigDecimal value) {
            addCriterion("da_mkpay =", value, "da_mkpay");
            return (Criteria) this;
        }

        public Criteria andDa_mkpayNotEqualTo(BigDecimal value) {
            addCriterion("da_mkpay <>", value, "da_mkpay");
            return (Criteria) this;
        }

        public Criteria andDa_mkpayGreaterThan(BigDecimal value) {
            addCriterion("da_mkpay >", value, "da_mkpay");
            return (Criteria) this;
        }

        public Criteria andDa_mkpayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("da_mkpay >=", value, "da_mkpay");
            return (Criteria) this;
        }

        public Criteria andDa_mkpayLessThan(BigDecimal value) {
            addCriterion("da_mkpay <", value, "da_mkpay");
            return (Criteria) this;
        }

        public Criteria andDa_mkpayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("da_mkpay <=", value, "da_mkpay");
            return (Criteria) this;
        }

        public Criteria andDa_mkpayIn(List<BigDecimal> values) {
            addCriterion("da_mkpay in", values, "da_mkpay");
            return (Criteria) this;
        }

        public Criteria andDa_mkpayNotIn(List<BigDecimal> values) {
            addCriterion("da_mkpay not in", values, "da_mkpay");
            return (Criteria) this;
        }

        public Criteria andDa_mkpayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("da_mkpay between", value1, value2, "da_mkpay");
            return (Criteria) this;
        }

        public Criteria andDa_mkpayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("da_mkpay not between", value1, value2, "da_mkpay");
            return (Criteria) this;
        }

        public Criteria andRoi_mkpayIsNull() {
            addCriterion("roi_mkpay is null");
            return (Criteria) this;
        }

        public Criteria andRoi_mkpayIsNotNull() {
            addCriterion("roi_mkpay is not null");
            return (Criteria) this;
        }

        public Criteria andRoi_mkpayEqualTo(BigDecimal value) {
            addCriterion("roi_mkpay =", value, "roi_mkpay");
            return (Criteria) this;
        }

        public Criteria andRoi_mkpayNotEqualTo(BigDecimal value) {
            addCriterion("roi_mkpay <>", value, "roi_mkpay");
            return (Criteria) this;
        }

        public Criteria andRoi_mkpayGreaterThan(BigDecimal value) {
            addCriterion("roi_mkpay >", value, "roi_mkpay");
            return (Criteria) this;
        }

        public Criteria andRoi_mkpayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("roi_mkpay >=", value, "roi_mkpay");
            return (Criteria) this;
        }

        public Criteria andRoi_mkpayLessThan(BigDecimal value) {
            addCriterion("roi_mkpay <", value, "roi_mkpay");
            return (Criteria) this;
        }

        public Criteria andRoi_mkpayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("roi_mkpay <=", value, "roi_mkpay");
            return (Criteria) this;
        }

        public Criteria andRoi_mkpayIn(List<BigDecimal> values) {
            addCriterion("roi_mkpay in", values, "roi_mkpay");
            return (Criteria) this;
        }

        public Criteria andRoi_mkpayNotIn(List<BigDecimal> values) {
            addCriterion("roi_mkpay not in", values, "roi_mkpay");
            return (Criteria) this;
        }

        public Criteria andRoi_mkpayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("roi_mkpay between", value1, value2, "roi_mkpay");
            return (Criteria) this;
        }

        public Criteria andRoi_mkpayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("roi_mkpay not between", value1, value2, "roi_mkpay");
            return (Criteria) this;
        }

        public Criteria andNc_mkpayIsNull() {
            addCriterion("nc_mkpay is null");
            return (Criteria) this;
        }

        public Criteria andNc_mkpayIsNotNull() {
            addCriterion("nc_mkpay is not null");
            return (Criteria) this;
        }

        public Criteria andNc_mkpayEqualTo(Long value) {
            addCriterion("nc_mkpay =", value, "nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNc_mkpayNotEqualTo(Long value) {
            addCriterion("nc_mkpay <>", value, "nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNc_mkpayGreaterThan(Long value) {
            addCriterion("nc_mkpay >", value, "nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNc_mkpayGreaterThanOrEqualTo(Long value) {
            addCriterion("nc_mkpay >=", value, "nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNc_mkpayLessThan(Long value) {
            addCriterion("nc_mkpay <", value, "nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNc_mkpayLessThanOrEqualTo(Long value) {
            addCriterion("nc_mkpay <=", value, "nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNc_mkpayIn(List<Long> values) {
            addCriterion("nc_mkpay in", values, "nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNc_mkpayNotIn(List<Long> values) {
            addCriterion("nc_mkpay not in", values, "nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNc_mkpayBetween(Long value1, Long value2) {
            addCriterion("nc_mkpay between", value1, value2, "nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNc_mkpayNotBetween(Long value1, Long value2) {
            addCriterion("nc_mkpay not between", value1, value2, "nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andAtv_mkpayIsNull() {
            addCriterion("atv_mkpay is null");
            return (Criteria) this;
        }

        public Criteria andAtv_mkpayIsNotNull() {
            addCriterion("atv_mkpay is not null");
            return (Criteria) this;
        }

        public Criteria andAtv_mkpayEqualTo(BigDecimal value) {
            addCriterion("atv_mkpay =", value, "atv_mkpay");
            return (Criteria) this;
        }

        public Criteria andAtv_mkpayNotEqualTo(BigDecimal value) {
            addCriterion("atv_mkpay <>", value, "atv_mkpay");
            return (Criteria) this;
        }

        public Criteria andAtv_mkpayGreaterThan(BigDecimal value) {
            addCriterion("atv_mkpay >", value, "atv_mkpay");
            return (Criteria) this;
        }

        public Criteria andAtv_mkpayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("atv_mkpay >=", value, "atv_mkpay");
            return (Criteria) this;
        }

        public Criteria andAtv_mkpayLessThan(BigDecimal value) {
            addCriterion("atv_mkpay <", value, "atv_mkpay");
            return (Criteria) this;
        }

        public Criteria andAtv_mkpayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("atv_mkpay <=", value, "atv_mkpay");
            return (Criteria) this;
        }

        public Criteria andAtv_mkpayIn(List<BigDecimal> values) {
            addCriterion("atv_mkpay in", values, "atv_mkpay");
            return (Criteria) this;
        }

        public Criteria andAtv_mkpayNotIn(List<BigDecimal> values) {
            addCriterion("atv_mkpay not in", values, "atv_mkpay");
            return (Criteria) this;
        }

        public Criteria andAtv_mkpayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("atv_mkpay between", value1, value2, "atv_mkpay");
            return (Criteria) this;
        }

        public Criteria andAtv_mkpayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("atv_mkpay not between", value1, value2, "atv_mkpay");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mktyIsNull() {
            addCriterion("act_nu_mkty is null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mktyIsNotNull() {
            addCriterion("act_nu_mkty is not null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mktyEqualTo(Long value) {
            addCriterion("act_nu_mkty =", value, "act_nu_mkty");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mktyNotEqualTo(Long value) {
            addCriterion("act_nu_mkty <>", value, "act_nu_mkty");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mktyGreaterThan(Long value) {
            addCriterion("act_nu_mkty >", value, "act_nu_mkty");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mktyGreaterThanOrEqualTo(Long value) {
            addCriterion("act_nu_mkty >=", value, "act_nu_mkty");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mktyLessThan(Long value) {
            addCriterion("act_nu_mkty <", value, "act_nu_mkty");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mktyLessThanOrEqualTo(Long value) {
            addCriterion("act_nu_mkty <=", value, "act_nu_mkty");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mktyIn(List<Long> values) {
            addCriterion("act_nu_mkty in", values, "act_nu_mkty");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mktyNotIn(List<Long> values) {
            addCriterion("act_nu_mkty not in", values, "act_nu_mkty");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mktyBetween(Long value1, Long value2) {
            addCriterion("act_nu_mkty between", value1, value2, "act_nu_mkty");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mktyNotBetween(Long value1, Long value2) {
            addCriterion("act_nu_mkty not between", value1, value2, "act_nu_mkty");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_1IsNull() {
            addCriterion("act_nu_mkty_1 is null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_1IsNotNull() {
            addCriterion("act_nu_mkty_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_1EqualTo(Long value) {
            addCriterion("act_nu_mkty_1 =", value, "act_nu_mkty_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_1NotEqualTo(Long value) {
            addCriterion("act_nu_mkty_1 <>", value, "act_nu_mkty_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_1GreaterThan(Long value) {
            addCriterion("act_nu_mkty_1 >", value, "act_nu_mkty_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_1GreaterThanOrEqualTo(Long value) {
            addCriterion("act_nu_mkty_1 >=", value, "act_nu_mkty_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_1LessThan(Long value) {
            addCriterion("act_nu_mkty_1 <", value, "act_nu_mkty_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_1LessThanOrEqualTo(Long value) {
            addCriterion("act_nu_mkty_1 <=", value, "act_nu_mkty_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_1In(List<Long> values) {
            addCriterion("act_nu_mkty_1 in", values, "act_nu_mkty_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_1NotIn(List<Long> values) {
            addCriterion("act_nu_mkty_1 not in", values, "act_nu_mkty_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_1Between(Long value1, Long value2) {
            addCriterion("act_nu_mkty_1 between", value1, value2, "act_nu_mkty_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_1NotBetween(Long value1, Long value2) {
            addCriterion("act_nu_mkty_1 not between", value1, value2, "act_nu_mkty_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_1IsNull() {
            addCriterion("act_nu_mkty_sh_1 is null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_1IsNotNull() {
            addCriterion("act_nu_mkty_sh_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_1EqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_1 =", value, "act_nu_mkty_sh_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_1NotEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_1 <>", value, "act_nu_mkty_sh_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_1GreaterThan(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_1 >", value, "act_nu_mkty_sh_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_1 >=", value, "act_nu_mkty_sh_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_1LessThan(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_1 <", value, "act_nu_mkty_sh_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_1 <=", value, "act_nu_mkty_sh_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_1In(List<BigDecimal> values) {
            addCriterion("act_nu_mkty_sh_1 in", values, "act_nu_mkty_sh_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_1NotIn(List<BigDecimal> values) {
            addCriterion("act_nu_mkty_sh_1 not in", values, "act_nu_mkty_sh_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_nu_mkty_sh_1 between", value1, value2, "act_nu_mkty_sh_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_nu_mkty_sh_1 not between", value1, value2, "act_nu_mkty_sh_1");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_2IsNull() {
            addCriterion("act_nu_mkty_2 is null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_2IsNotNull() {
            addCriterion("act_nu_mkty_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_2EqualTo(Long value) {
            addCriterion("act_nu_mkty_2 =", value, "act_nu_mkty_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_2NotEqualTo(Long value) {
            addCriterion("act_nu_mkty_2 <>", value, "act_nu_mkty_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_2GreaterThan(Long value) {
            addCriterion("act_nu_mkty_2 >", value, "act_nu_mkty_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_2GreaterThanOrEqualTo(Long value) {
            addCriterion("act_nu_mkty_2 >=", value, "act_nu_mkty_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_2LessThan(Long value) {
            addCriterion("act_nu_mkty_2 <", value, "act_nu_mkty_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_2LessThanOrEqualTo(Long value) {
            addCriterion("act_nu_mkty_2 <=", value, "act_nu_mkty_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_2In(List<Long> values) {
            addCriterion("act_nu_mkty_2 in", values, "act_nu_mkty_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_2NotIn(List<Long> values) {
            addCriterion("act_nu_mkty_2 not in", values, "act_nu_mkty_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_2Between(Long value1, Long value2) {
            addCriterion("act_nu_mkty_2 between", value1, value2, "act_nu_mkty_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_2NotBetween(Long value1, Long value2) {
            addCriterion("act_nu_mkty_2 not between", value1, value2, "act_nu_mkty_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_2IsNull() {
            addCriterion("act_nu_mkty_sh_2 is null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_2IsNotNull() {
            addCriterion("act_nu_mkty_sh_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_2EqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_2 =", value, "act_nu_mkty_sh_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_2NotEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_2 <>", value, "act_nu_mkty_sh_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_2GreaterThan(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_2 >", value, "act_nu_mkty_sh_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_2 >=", value, "act_nu_mkty_sh_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_2LessThan(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_2 <", value, "act_nu_mkty_sh_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_2 <=", value, "act_nu_mkty_sh_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_2In(List<BigDecimal> values) {
            addCriterion("act_nu_mkty_sh_2 in", values, "act_nu_mkty_sh_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_2NotIn(List<BigDecimal> values) {
            addCriterion("act_nu_mkty_sh_2 not in", values, "act_nu_mkty_sh_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_nu_mkty_sh_2 between", value1, value2, "act_nu_mkty_sh_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_nu_mkty_sh_2 not between", value1, value2, "act_nu_mkty_sh_2");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_3IsNull() {
            addCriterion("act_nu_mkty_3 is null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_3IsNotNull() {
            addCriterion("act_nu_mkty_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_3EqualTo(Long value) {
            addCriterion("act_nu_mkty_3 =", value, "act_nu_mkty_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_3NotEqualTo(Long value) {
            addCriterion("act_nu_mkty_3 <>", value, "act_nu_mkty_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_3GreaterThan(Long value) {
            addCriterion("act_nu_mkty_3 >", value, "act_nu_mkty_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_3GreaterThanOrEqualTo(Long value) {
            addCriterion("act_nu_mkty_3 >=", value, "act_nu_mkty_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_3LessThan(Long value) {
            addCriterion("act_nu_mkty_3 <", value, "act_nu_mkty_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_3LessThanOrEqualTo(Long value) {
            addCriterion("act_nu_mkty_3 <=", value, "act_nu_mkty_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_3In(List<Long> values) {
            addCriterion("act_nu_mkty_3 in", values, "act_nu_mkty_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_3NotIn(List<Long> values) {
            addCriterion("act_nu_mkty_3 not in", values, "act_nu_mkty_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_3Between(Long value1, Long value2) {
            addCriterion("act_nu_mkty_3 between", value1, value2, "act_nu_mkty_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_3NotBetween(Long value1, Long value2) {
            addCriterion("act_nu_mkty_3 not between", value1, value2, "act_nu_mkty_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_3IsNull() {
            addCriterion("act_nu_mkty_sh_3 is null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_3IsNotNull() {
            addCriterion("act_nu_mkty_sh_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_3EqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_3 =", value, "act_nu_mkty_sh_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_3NotEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_3 <>", value, "act_nu_mkty_sh_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_3GreaterThan(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_3 >", value, "act_nu_mkty_sh_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_3 >=", value, "act_nu_mkty_sh_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_3LessThan(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_3 <", value, "act_nu_mkty_sh_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_3 <=", value, "act_nu_mkty_sh_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_3In(List<BigDecimal> values) {
            addCriterion("act_nu_mkty_sh_3 in", values, "act_nu_mkty_sh_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_3NotIn(List<BigDecimal> values) {
            addCriterion("act_nu_mkty_sh_3 not in", values, "act_nu_mkty_sh_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_nu_mkty_sh_3 between", value1, value2, "act_nu_mkty_sh_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_nu_mkty_sh_3 not between", value1, value2, "act_nu_mkty_sh_3");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_4IsNull() {
            addCriterion("act_nu_mkty_4 is null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_4IsNotNull() {
            addCriterion("act_nu_mkty_4 is not null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_4EqualTo(Long value) {
            addCriterion("act_nu_mkty_4 =", value, "act_nu_mkty_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_4NotEqualTo(Long value) {
            addCriterion("act_nu_mkty_4 <>", value, "act_nu_mkty_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_4GreaterThan(Long value) {
            addCriterion("act_nu_mkty_4 >", value, "act_nu_mkty_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_4GreaterThanOrEqualTo(Long value) {
            addCriterion("act_nu_mkty_4 >=", value, "act_nu_mkty_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_4LessThan(Long value) {
            addCriterion("act_nu_mkty_4 <", value, "act_nu_mkty_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_4LessThanOrEqualTo(Long value) {
            addCriterion("act_nu_mkty_4 <=", value, "act_nu_mkty_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_4In(List<Long> values) {
            addCriterion("act_nu_mkty_4 in", values, "act_nu_mkty_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_4NotIn(List<Long> values) {
            addCriterion("act_nu_mkty_4 not in", values, "act_nu_mkty_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_4Between(Long value1, Long value2) {
            addCriterion("act_nu_mkty_4 between", value1, value2, "act_nu_mkty_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_4NotBetween(Long value1, Long value2) {
            addCriterion("act_nu_mkty_4 not between", value1, value2, "act_nu_mkty_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_4IsNull() {
            addCriterion("act_nu_mkty_sh_4 is null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_4IsNotNull() {
            addCriterion("act_nu_mkty_sh_4 is not null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_4EqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_4 =", value, "act_nu_mkty_sh_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_4NotEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_4 <>", value, "act_nu_mkty_sh_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_4GreaterThan(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_4 >", value, "act_nu_mkty_sh_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_4 >=", value, "act_nu_mkty_sh_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_4LessThan(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_4 <", value, "act_nu_mkty_sh_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_4 <=", value, "act_nu_mkty_sh_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_4In(List<BigDecimal> values) {
            addCriterion("act_nu_mkty_sh_4 in", values, "act_nu_mkty_sh_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_4NotIn(List<BigDecimal> values) {
            addCriterion("act_nu_mkty_sh_4 not in", values, "act_nu_mkty_sh_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_nu_mkty_sh_4 between", value1, value2, "act_nu_mkty_sh_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_nu_mkty_sh_4 not between", value1, value2, "act_nu_mkty_sh_4");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_5IsNull() {
            addCriterion("act_nu_mkty_5 is null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_5IsNotNull() {
            addCriterion("act_nu_mkty_5 is not null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_5EqualTo(Long value) {
            addCriterion("act_nu_mkty_5 =", value, "act_nu_mkty_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_5NotEqualTo(Long value) {
            addCriterion("act_nu_mkty_5 <>", value, "act_nu_mkty_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_5GreaterThan(Long value) {
            addCriterion("act_nu_mkty_5 >", value, "act_nu_mkty_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_5GreaterThanOrEqualTo(Long value) {
            addCriterion("act_nu_mkty_5 >=", value, "act_nu_mkty_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_5LessThan(Long value) {
            addCriterion("act_nu_mkty_5 <", value, "act_nu_mkty_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_5LessThanOrEqualTo(Long value) {
            addCriterion("act_nu_mkty_5 <=", value, "act_nu_mkty_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_5In(List<Long> values) {
            addCriterion("act_nu_mkty_5 in", values, "act_nu_mkty_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_5NotIn(List<Long> values) {
            addCriterion("act_nu_mkty_5 not in", values, "act_nu_mkty_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_5Between(Long value1, Long value2) {
            addCriterion("act_nu_mkty_5 between", value1, value2, "act_nu_mkty_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_5NotBetween(Long value1, Long value2) {
            addCriterion("act_nu_mkty_5 not between", value1, value2, "act_nu_mkty_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_5IsNull() {
            addCriterion("act_nu_mkty_sh_5 is null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_5IsNotNull() {
            addCriterion("act_nu_mkty_sh_5 is not null");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_5EqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_5 =", value, "act_nu_mkty_sh_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_5NotEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_5 <>", value, "act_nu_mkty_sh_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_5GreaterThan(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_5 >", value, "act_nu_mkty_sh_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_5 >=", value, "act_nu_mkty_sh_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_5LessThan(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_5 <", value, "act_nu_mkty_sh_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("act_nu_mkty_sh_5 <=", value, "act_nu_mkty_sh_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_5In(List<BigDecimal> values) {
            addCriterion("act_nu_mkty_sh_5 in", values, "act_nu_mkty_sh_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_5NotIn(List<BigDecimal> values) {
            addCriterion("act_nu_mkty_sh_5 not in", values, "act_nu_mkty_sh_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_nu_mkty_sh_5 between", value1, value2, "act_nu_mkty_sh_5");
            return (Criteria) this;
        }

        public Criteria andAct_nu_mkty_sh_5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_nu_mkty_sh_5 not between", value1, value2, "act_nu_mkty_sh_5");
            return (Criteria) this;
        }

        public Criteria andOa_unmkpayIsNull() {
            addCriterion("oa_unmkpay is null");
            return (Criteria) this;
        }

        public Criteria andOa_unmkpayIsNotNull() {
            addCriterion("oa_unmkpay is not null");
            return (Criteria) this;
        }

        public Criteria andOa_unmkpayEqualTo(BigDecimal value) {
            addCriterion("oa_unmkpay =", value, "oa_unmkpay");
            return (Criteria) this;
        }

        public Criteria andOa_unmkpayNotEqualTo(BigDecimal value) {
            addCriterion("oa_unmkpay <>", value, "oa_unmkpay");
            return (Criteria) this;
        }

        public Criteria andOa_unmkpayGreaterThan(BigDecimal value) {
            addCriterion("oa_unmkpay >", value, "oa_unmkpay");
            return (Criteria) this;
        }

        public Criteria andOa_unmkpayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("oa_unmkpay >=", value, "oa_unmkpay");
            return (Criteria) this;
        }

        public Criteria andOa_unmkpayLessThan(BigDecimal value) {
            addCriterion("oa_unmkpay <", value, "oa_unmkpay");
            return (Criteria) this;
        }

        public Criteria andOa_unmkpayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("oa_unmkpay <=", value, "oa_unmkpay");
            return (Criteria) this;
        }

        public Criteria andOa_unmkpayIn(List<BigDecimal> values) {
            addCriterion("oa_unmkpay in", values, "oa_unmkpay");
            return (Criteria) this;
        }

        public Criteria andOa_unmkpayNotIn(List<BigDecimal> values) {
            addCriterion("oa_unmkpay not in", values, "oa_unmkpay");
            return (Criteria) this;
        }

        public Criteria andOa_unmkpayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oa_unmkpay between", value1, value2, "oa_unmkpay");
            return (Criteria) this;
        }

        public Criteria andOa_unmkpayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oa_unmkpay not between", value1, value2, "oa_unmkpay");
            return (Criteria) this;
        }

        public Criteria andOld_nc_mkpayIsNull() {
            addCriterion("old_nc_mkpay is null");
            return (Criteria) this;
        }

        public Criteria andOld_nc_mkpayIsNotNull() {
            addCriterion("old_nc_mkpay is not null");
            return (Criteria) this;
        }

        public Criteria andOld_nc_mkpayEqualTo(Long value) {
            addCriterion("old_nc_mkpay =", value, "old_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andOld_nc_mkpayNotEqualTo(Long value) {
            addCriterion("old_nc_mkpay <>", value, "old_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andOld_nc_mkpayGreaterThan(Long value) {
            addCriterion("old_nc_mkpay >", value, "old_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andOld_nc_mkpayGreaterThanOrEqualTo(Long value) {
            addCriterion("old_nc_mkpay >=", value, "old_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andOld_nc_mkpayLessThan(Long value) {
            addCriterion("old_nc_mkpay <", value, "old_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andOld_nc_mkpayLessThanOrEqualTo(Long value) {
            addCriterion("old_nc_mkpay <=", value, "old_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andOld_nc_mkpayIn(List<Long> values) {
            addCriterion("old_nc_mkpay in", values, "old_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andOld_nc_mkpayNotIn(List<Long> values) {
            addCriterion("old_nc_mkpay not in", values, "old_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andOld_nc_mkpayBetween(Long value1, Long value2) {
            addCriterion("old_nc_mkpay between", value1, value2, "old_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andOld_nc_mkpayNotBetween(Long value1, Long value2) {
            addCriterion("old_nc_mkpay not between", value1, value2, "old_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNew_nc_mkpayIsNull() {
            addCriterion("new_nc_mkpay is null");
            return (Criteria) this;
        }

        public Criteria andNew_nc_mkpayIsNotNull() {
            addCriterion("new_nc_mkpay is not null");
            return (Criteria) this;
        }

        public Criteria andNew_nc_mkpayEqualTo(Long value) {
            addCriterion("new_nc_mkpay =", value, "new_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNew_nc_mkpayNotEqualTo(Long value) {
            addCriterion("new_nc_mkpay <>", value, "new_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNew_nc_mkpayGreaterThan(Long value) {
            addCriterion("new_nc_mkpay >", value, "new_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNew_nc_mkpayGreaterThanOrEqualTo(Long value) {
            addCriterion("new_nc_mkpay >=", value, "new_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNew_nc_mkpayLessThan(Long value) {
            addCriterion("new_nc_mkpay <", value, "new_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNew_nc_mkpayLessThanOrEqualTo(Long value) {
            addCriterion("new_nc_mkpay <=", value, "new_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNew_nc_mkpayIn(List<Long> values) {
            addCriterion("new_nc_mkpay in", values, "new_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNew_nc_mkpayNotIn(List<Long> values) {
            addCriterion("new_nc_mkpay not in", values, "new_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNew_nc_mkpayBetween(Long value1, Long value2) {
            addCriterion("new_nc_mkpay between", value1, value2, "new_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andNew_nc_mkpayNotBetween(Long value1, Long value2) {
            addCriterion("new_nc_mkpay not between", value1, value2, "new_nc_mkpay");
            return (Criteria) this;
        }

        public Criteria andSv_mkpayIsNull() {
            addCriterion("sv_mkpay is null");
            return (Criteria) this;
        }

        public Criteria andSv_mkpayIsNotNull() {
            addCriterion("sv_mkpay is not null");
            return (Criteria) this;
        }

        public Criteria andSv_mkpayEqualTo(Long value) {
            addCriterion("sv_mkpay =", value, "sv_mkpay");
            return (Criteria) this;
        }

        public Criteria andSv_mkpayNotEqualTo(Long value) {
            addCriterion("sv_mkpay <>", value, "sv_mkpay");
            return (Criteria) this;
        }

        public Criteria andSv_mkpayGreaterThan(Long value) {
            addCriterion("sv_mkpay >", value, "sv_mkpay");
            return (Criteria) this;
        }

        public Criteria andSv_mkpayGreaterThanOrEqualTo(Long value) {
            addCriterion("sv_mkpay >=", value, "sv_mkpay");
            return (Criteria) this;
        }

        public Criteria andSv_mkpayLessThan(Long value) {
            addCriterion("sv_mkpay <", value, "sv_mkpay");
            return (Criteria) this;
        }

        public Criteria andSv_mkpayLessThanOrEqualTo(Long value) {
            addCriterion("sv_mkpay <=", value, "sv_mkpay");
            return (Criteria) this;
        }

        public Criteria andSv_mkpayIn(List<Long> values) {
            addCriterion("sv_mkpay in", values, "sv_mkpay");
            return (Criteria) this;
        }

        public Criteria andSv_mkpayNotIn(List<Long> values) {
            addCriterion("sv_mkpay not in", values, "sv_mkpay");
            return (Criteria) this;
        }

        public Criteria andSv_mkpayBetween(Long value1, Long value2) {
            addCriterion("sv_mkpay between", value1, value2, "sv_mkpay");
            return (Criteria) this;
        }

        public Criteria andSv_mkpayNotBetween(Long value1, Long value2) {
            addCriterion("sv_mkpay not between", value1, value2, "sv_mkpay");
            return (Criteria) this;
        }

        public Criteria andOq_mkpayIsNull() {
            addCriterion("oq_mkpay is null");
            return (Criteria) this;
        }

        public Criteria andOq_mkpayIsNotNull() {
            addCriterion("oq_mkpay is not null");
            return (Criteria) this;
        }

        public Criteria andOq_mkpayEqualTo(Long value) {
            addCriterion("oq_mkpay =", value, "oq_mkpay");
            return (Criteria) this;
        }

        public Criteria andOq_mkpayNotEqualTo(Long value) {
            addCriterion("oq_mkpay <>", value, "oq_mkpay");
            return (Criteria) this;
        }

        public Criteria andOq_mkpayGreaterThan(Long value) {
            addCriterion("oq_mkpay >", value, "oq_mkpay");
            return (Criteria) this;
        }

        public Criteria andOq_mkpayGreaterThanOrEqualTo(Long value) {
            addCriterion("oq_mkpay >=", value, "oq_mkpay");
            return (Criteria) this;
        }

        public Criteria andOq_mkpayLessThan(Long value) {
            addCriterion("oq_mkpay <", value, "oq_mkpay");
            return (Criteria) this;
        }

        public Criteria andOq_mkpayLessThanOrEqualTo(Long value) {
            addCriterion("oq_mkpay <=", value, "oq_mkpay");
            return (Criteria) this;
        }

        public Criteria andOq_mkpayIn(List<Long> values) {
            addCriterion("oq_mkpay in", values, "oq_mkpay");
            return (Criteria) this;
        }

        public Criteria andOq_mkpayNotIn(List<Long> values) {
            addCriterion("oq_mkpay not in", values, "oq_mkpay");
            return (Criteria) this;
        }

        public Criteria andOq_mkpayBetween(Long value1, Long value2) {
            addCriterion("oq_mkpay between", value1, value2, "oq_mkpay");
            return (Criteria) this;
        }

        public Criteria andOq_mkpayNotBetween(Long value1, Long value2) {
            addCriterion("oq_mkpay not between", value1, value2, "oq_mkpay");
            return (Criteria) this;
        }

        public Criteria andApr_mkpayIsNull() {
            addCriterion("apr_mkpay is null");
            return (Criteria) this;
        }

        public Criteria andApr_mkpayIsNotNull() {
            addCriterion("apr_mkpay is not null");
            return (Criteria) this;
        }

        public Criteria andApr_mkpayEqualTo(BigDecimal value) {
            addCriterion("apr_mkpay =", value, "apr_mkpay");
            return (Criteria) this;
        }

        public Criteria andApr_mkpayNotEqualTo(BigDecimal value) {
            addCriterion("apr_mkpay <>", value, "apr_mkpay");
            return (Criteria) this;
        }

        public Criteria andApr_mkpayGreaterThan(BigDecimal value) {
            addCriterion("apr_mkpay >", value, "apr_mkpay");
            return (Criteria) this;
        }

        public Criteria andApr_mkpayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("apr_mkpay >=", value, "apr_mkpay");
            return (Criteria) this;
        }

        public Criteria andApr_mkpayLessThan(BigDecimal value) {
            addCriterion("apr_mkpay <", value, "apr_mkpay");
            return (Criteria) this;
        }

        public Criteria andApr_mkpayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("apr_mkpay <=", value, "apr_mkpay");
            return (Criteria) this;
        }

        public Criteria andApr_mkpayIn(List<BigDecimal> values) {
            addCriterion("apr_mkpay in", values, "apr_mkpay");
            return (Criteria) this;
        }

        public Criteria andApr_mkpayNotIn(List<BigDecimal> values) {
            addCriterion("apr_mkpay not in", values, "apr_mkpay");
            return (Criteria) this;
        }

        public Criteria andApr_mkpayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apr_mkpay between", value1, value2, "apr_mkpay");
            return (Criteria) this;
        }

        public Criteria andApr_mkpayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apr_mkpay not between", value1, value2, "apr_mkpay");
            return (Criteria) this;
        }

        public Criteria andNc_mkplIsNull() {
            addCriterion("nc_mkpl is null");
            return (Criteria) this;
        }

        public Criteria andNc_mkplIsNotNull() {
            addCriterion("nc_mkpl is not null");
            return (Criteria) this;
        }

        public Criteria andNc_mkplEqualTo(Long value) {
            addCriterion("nc_mkpl =", value, "nc_mkpl");
            return (Criteria) this;
        }

        public Criteria andNc_mkplNotEqualTo(Long value) {
            addCriterion("nc_mkpl <>", value, "nc_mkpl");
            return (Criteria) this;
        }

        public Criteria andNc_mkplGreaterThan(Long value) {
            addCriterion("nc_mkpl >", value, "nc_mkpl");
            return (Criteria) this;
        }

        public Criteria andNc_mkplGreaterThanOrEqualTo(Long value) {
            addCriterion("nc_mkpl >=", value, "nc_mkpl");
            return (Criteria) this;
        }

        public Criteria andNc_mkplLessThan(Long value) {
            addCriterion("nc_mkpl <", value, "nc_mkpl");
            return (Criteria) this;
        }

        public Criteria andNc_mkplLessThanOrEqualTo(Long value) {
            addCriterion("nc_mkpl <=", value, "nc_mkpl");
            return (Criteria) this;
        }

        public Criteria andNc_mkplIn(List<Long> values) {
            addCriterion("nc_mkpl in", values, "nc_mkpl");
            return (Criteria) this;
        }

        public Criteria andNc_mkplNotIn(List<Long> values) {
            addCriterion("nc_mkpl not in", values, "nc_mkpl");
            return (Criteria) this;
        }

        public Criteria andNc_mkplBetween(Long value1, Long value2) {
            addCriterion("nc_mkpl between", value1, value2, "nc_mkpl");
            return (Criteria) this;
        }

        public Criteria andNc_mkplNotBetween(Long value1, Long value2) {
            addCriterion("nc_mkpl not between", value1, value2, "nc_mkpl");
            return (Criteria) this;
        }

        public Criteria andNc_mkpl_pay_coIsNull() {
            addCriterion("nc_mkpl_pay_co is null");
            return (Criteria) this;
        }

        public Criteria andNc_mkpl_pay_coIsNotNull() {
            addCriterion("nc_mkpl_pay_co is not null");
            return (Criteria) this;
        }

        public Criteria andNc_mkpl_pay_coEqualTo(BigDecimal value) {
            addCriterion("nc_mkpl_pay_co =", value, "nc_mkpl_pay_co");
            return (Criteria) this;
        }

        public Criteria andNc_mkpl_pay_coNotEqualTo(BigDecimal value) {
            addCriterion("nc_mkpl_pay_co <>", value, "nc_mkpl_pay_co");
            return (Criteria) this;
        }

        public Criteria andNc_mkpl_pay_coGreaterThan(BigDecimal value) {
            addCriterion("nc_mkpl_pay_co >", value, "nc_mkpl_pay_co");
            return (Criteria) this;
        }

        public Criteria andNc_mkpl_pay_coGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nc_mkpl_pay_co >=", value, "nc_mkpl_pay_co");
            return (Criteria) this;
        }

        public Criteria andNc_mkpl_pay_coLessThan(BigDecimal value) {
            addCriterion("nc_mkpl_pay_co <", value, "nc_mkpl_pay_co");
            return (Criteria) this;
        }

        public Criteria andNc_mkpl_pay_coLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nc_mkpl_pay_co <=", value, "nc_mkpl_pay_co");
            return (Criteria) this;
        }

        public Criteria andNc_mkpl_pay_coIn(List<BigDecimal> values) {
            addCriterion("nc_mkpl_pay_co in", values, "nc_mkpl_pay_co");
            return (Criteria) this;
        }

        public Criteria andNc_mkpl_pay_coNotIn(List<BigDecimal> values) {
            addCriterion("nc_mkpl_pay_co not in", values, "nc_mkpl_pay_co");
            return (Criteria) this;
        }

        public Criteria andNc_mkpl_pay_coBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nc_mkpl_pay_co between", value1, value2, "nc_mkpl_pay_co");
            return (Criteria) this;
        }

        public Criteria andNc_mkpl_pay_coNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nc_mkpl_pay_co not between", value1, value2, "nc_mkpl_pay_co");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}