package com.dadiyw.ce16.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MarketPlanReportSumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketPlanReportSumExample() {
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

        public Criteria andPLAN_CODEIsNull() {
            addCriterion("PLAN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODEIsNotNull() {
            addCriterion("PLAN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODEEqualTo(String value) {
            addCriterion("PLAN_CODE =", value, "PLAN_CODE");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODENotEqualTo(String value) {
            addCriterion("PLAN_CODE <>", value, "PLAN_CODE");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODEGreaterThan(String value) {
            addCriterion("PLAN_CODE >", value, "PLAN_CODE");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_CODE >=", value, "PLAN_CODE");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODELessThan(String value) {
            addCriterion("PLAN_CODE <", value, "PLAN_CODE");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODELessThanOrEqualTo(String value) {
            addCriterion("PLAN_CODE <=", value, "PLAN_CODE");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODELike(String value) {
            addCriterion("PLAN_CODE like", value, "PLAN_CODE");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODENotLike(String value) {
            addCriterion("PLAN_CODE not like", value, "PLAN_CODE");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODEIn(List<String> values) {
            addCriterion("PLAN_CODE in", values, "PLAN_CODE");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODENotIn(List<String> values) {
            addCriterion("PLAN_CODE not in", values, "PLAN_CODE");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODEBetween(String value1, String value2) {
            addCriterion("PLAN_CODE between", value1, value2, "PLAN_CODE");
            return (Criteria) this;
        }

        public Criteria andPLAN_CODENotBetween(String value1, String value2) {
            addCriterion("PLAN_CODE not between", value1, value2, "PLAN_CODE");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPIsNull() {
            addCriterion("PLAN_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPIsNotNull() {
            addCriterion("PLAN_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPEqualTo(String value) {
            addCriterion("PLAN_GROUP =", value, "PLAN_GROUP");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPNotEqualTo(String value) {
            addCriterion("PLAN_GROUP <>", value, "PLAN_GROUP");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPGreaterThan(String value) {
            addCriterion("PLAN_GROUP >", value, "PLAN_GROUP");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_GROUP >=", value, "PLAN_GROUP");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPLessThan(String value) {
            addCriterion("PLAN_GROUP <", value, "PLAN_GROUP");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPLessThanOrEqualTo(String value) {
            addCriterion("PLAN_GROUP <=", value, "PLAN_GROUP");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPLike(String value) {
            addCriterion("PLAN_GROUP like", value, "PLAN_GROUP");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPNotLike(String value) {
            addCriterion("PLAN_GROUP not like", value, "PLAN_GROUP");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPIn(List<String> values) {
            addCriterion("PLAN_GROUP in", values, "PLAN_GROUP");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPNotIn(List<String> values) {
            addCriterion("PLAN_GROUP not in", values, "PLAN_GROUP");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPBetween(String value1, String value2) {
            addCriterion("PLAN_GROUP between", value1, value2, "PLAN_GROUP");
            return (Criteria) this;
        }

        public Criteria andPLAN_GROUPNotBetween(String value1, String value2) {
            addCriterion("PLAN_GROUP not between", value1, value2, "PLAN_GROUP");
            return (Criteria) this;
        }

        public Criteria andUV_PLANIsNull() {
            addCriterion("UV_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andUV_PLANIsNotNull() {
            addCriterion("UV_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andUV_PLANEqualTo(Long value) {
            addCriterion("UV_PLAN =", value, "UV_PLAN");
            return (Criteria) this;
        }

        public Criteria andUV_PLANNotEqualTo(Long value) {
            addCriterion("UV_PLAN <>", value, "UV_PLAN");
            return (Criteria) this;
        }

        public Criteria andUV_PLANGreaterThan(Long value) {
            addCriterion("UV_PLAN >", value, "UV_PLAN");
            return (Criteria) this;
        }

        public Criteria andUV_PLANGreaterThanOrEqualTo(Long value) {
            addCriterion("UV_PLAN >=", value, "UV_PLAN");
            return (Criteria) this;
        }

        public Criteria andUV_PLANLessThan(Long value) {
            addCriterion("UV_PLAN <", value, "UV_PLAN");
            return (Criteria) this;
        }

        public Criteria andUV_PLANLessThanOrEqualTo(Long value) {
            addCriterion("UV_PLAN <=", value, "UV_PLAN");
            return (Criteria) this;
        }

        public Criteria andUV_PLANIn(List<Long> values) {
            addCriterion("UV_PLAN in", values, "UV_PLAN");
            return (Criteria) this;
        }

        public Criteria andUV_PLANNotIn(List<Long> values) {
            addCriterion("UV_PLAN not in", values, "UV_PLAN");
            return (Criteria) this;
        }

        public Criteria andUV_PLANBetween(Long value1, Long value2) {
            addCriterion("UV_PLAN between", value1, value2, "UV_PLAN");
            return (Criteria) this;
        }

        public Criteria andUV_PLANNotBetween(Long value1, Long value2) {
            addCriterion("UV_PLAN not between", value1, value2, "UV_PLAN");
            return (Criteria) this;
        }

        public Criteria andOA_PAY_PLANIsNull() {
            addCriterion("OA_PAY_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andOA_PAY_PLANIsNotNull() {
            addCriterion("OA_PAY_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andOA_PAY_PLANEqualTo(BigDecimal value) {
            addCriterion("OA_PAY_PLAN =", value, "OA_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOA_PAY_PLANNotEqualTo(BigDecimal value) {
            addCriterion("OA_PAY_PLAN <>", value, "OA_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOA_PAY_PLANGreaterThan(BigDecimal value) {
            addCriterion("OA_PAY_PLAN >", value, "OA_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOA_PAY_PLANGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OA_PAY_PLAN >=", value, "OA_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOA_PAY_PLANLessThan(BigDecimal value) {
            addCriterion("OA_PAY_PLAN <", value, "OA_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOA_PAY_PLANLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OA_PAY_PLAN <=", value, "OA_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOA_PAY_PLANIn(List<BigDecimal> values) {
            addCriterion("OA_PAY_PLAN in", values, "OA_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOA_PAY_PLANNotIn(List<BigDecimal> values) {
            addCriterion("OA_PAY_PLAN not in", values, "OA_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOA_PAY_PLANBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OA_PAY_PLAN between", value1, value2, "OA_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOA_PAY_PLANNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OA_PAY_PLAN not between", value1, value2, "OA_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOQ_PAY_PLANIsNull() {
            addCriterion("OQ_PAY_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andOQ_PAY_PLANIsNotNull() {
            addCriterion("OQ_PAY_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andOQ_PAY_PLANEqualTo(Long value) {
            addCriterion("OQ_PAY_PLAN =", value, "OQ_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOQ_PAY_PLANNotEqualTo(Long value) {
            addCriterion("OQ_PAY_PLAN <>", value, "OQ_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOQ_PAY_PLANGreaterThan(Long value) {
            addCriterion("OQ_PAY_PLAN >", value, "OQ_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOQ_PAY_PLANGreaterThanOrEqualTo(Long value) {
            addCriterion("OQ_PAY_PLAN >=", value, "OQ_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOQ_PAY_PLANLessThan(Long value) {
            addCriterion("OQ_PAY_PLAN <", value, "OQ_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOQ_PAY_PLANLessThanOrEqualTo(Long value) {
            addCriterion("OQ_PAY_PLAN <=", value, "OQ_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOQ_PAY_PLANIn(List<Long> values) {
            addCriterion("OQ_PAY_PLAN in", values, "OQ_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOQ_PAY_PLANNotIn(List<Long> values) {
            addCriterion("OQ_PAY_PLAN not in", values, "OQ_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOQ_PAY_PLANBetween(Long value1, Long value2) {
            addCriterion("OQ_PAY_PLAN between", value1, value2, "OQ_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andOQ_PAY_PLANNotBetween(Long value1, Long value2) {
            addCriterion("OQ_PAY_PLAN not between", value1, value2, "OQ_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andNC_PAY_PLANIsNull() {
            addCriterion("NC_PAY_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andNC_PAY_PLANIsNotNull() {
            addCriterion("NC_PAY_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andNC_PAY_PLANEqualTo(Long value) {
            addCriterion("NC_PAY_PLAN =", value, "NC_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andNC_PAY_PLANNotEqualTo(Long value) {
            addCriterion("NC_PAY_PLAN <>", value, "NC_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andNC_PAY_PLANGreaterThan(Long value) {
            addCriterion("NC_PAY_PLAN >", value, "NC_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andNC_PAY_PLANGreaterThanOrEqualTo(Long value) {
            addCriterion("NC_PAY_PLAN >=", value, "NC_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andNC_PAY_PLANLessThan(Long value) {
            addCriterion("NC_PAY_PLAN <", value, "NC_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andNC_PAY_PLANLessThanOrEqualTo(Long value) {
            addCriterion("NC_PAY_PLAN <=", value, "NC_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andNC_PAY_PLANIn(List<Long> values) {
            addCriterion("NC_PAY_PLAN in", values, "NC_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andNC_PAY_PLANNotIn(List<Long> values) {
            addCriterion("NC_PAY_PLAN not in", values, "NC_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andNC_PAY_PLANBetween(Long value1, Long value2) {
            addCriterion("NC_PAY_PLAN between", value1, value2, "NC_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andNC_PAY_PLANNotBetween(Long value1, Long value2) {
            addCriterion("NC_PAY_PLAN not between", value1, value2, "NC_PAY_PLAN");
            return (Criteria) this;
        }

        public Criteria andNC_VI_PAY_COIsNull() {
            addCriterion("NC_VI_PAY_CO is null");
            return (Criteria) this;
        }

        public Criteria andNC_VI_PAY_COIsNotNull() {
            addCriterion("NC_VI_PAY_CO is not null");
            return (Criteria) this;
        }

        public Criteria andNC_VI_PAY_COEqualTo(BigDecimal value) {
            addCriterion("NC_VI_PAY_CO =", value, "NC_VI_PAY_CO");
            return (Criteria) this;
        }

        public Criteria andNC_VI_PAY_CONotEqualTo(BigDecimal value) {
            addCriterion("NC_VI_PAY_CO <>", value, "NC_VI_PAY_CO");
            return (Criteria) this;
        }

        public Criteria andNC_VI_PAY_COGreaterThan(BigDecimal value) {
            addCriterion("NC_VI_PAY_CO >", value, "NC_VI_PAY_CO");
            return (Criteria) this;
        }

        public Criteria andNC_VI_PAY_COGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NC_VI_PAY_CO >=", value, "NC_VI_PAY_CO");
            return (Criteria) this;
        }

        public Criteria andNC_VI_PAY_COLessThan(BigDecimal value) {
            addCriterion("NC_VI_PAY_CO <", value, "NC_VI_PAY_CO");
            return (Criteria) this;
        }

        public Criteria andNC_VI_PAY_COLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NC_VI_PAY_CO <=", value, "NC_VI_PAY_CO");
            return (Criteria) this;
        }

        public Criteria andNC_VI_PAY_COIn(List<BigDecimal> values) {
            addCriterion("NC_VI_PAY_CO in", values, "NC_VI_PAY_CO");
            return (Criteria) this;
        }

        public Criteria andNC_VI_PAY_CONotIn(List<BigDecimal> values) {
            addCriterion("NC_VI_PAY_CO not in", values, "NC_VI_PAY_CO");
            return (Criteria) this;
        }

        public Criteria andNC_VI_PAY_COBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NC_VI_PAY_CO between", value1, value2, "NC_VI_PAY_CO");
            return (Criteria) this;
        }

        public Criteria andNC_VI_PAY_CONotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NC_VI_PAY_CO not between", value1, value2, "NC_VI_PAY_CO");
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