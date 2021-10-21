package com.dadiyw.sop.entity.excel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderDetailReportModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailReportModelExample() {
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

        public Criteria andORDER_CODEIsNull() {
            addCriterion("ORDER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andORDER_CODEIsNotNull() {
            addCriterion("ORDER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andORDER_CODEEqualTo(String value) {
            addCriterion("ORDER_CODE =", value, "ORDER_CODE");
            return (Criteria) this;
        }

        public Criteria andORDER_CODENotEqualTo(String value) {
            addCriterion("ORDER_CODE <>", value, "ORDER_CODE");
            return (Criteria) this;
        }

        public Criteria andORDER_CODEGreaterThan(String value) {
            addCriterion("ORDER_CODE >", value, "ORDER_CODE");
            return (Criteria) this;
        }

        public Criteria andORDER_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CODE >=", value, "ORDER_CODE");
            return (Criteria) this;
        }

        public Criteria andORDER_CODELessThan(String value) {
            addCriterion("ORDER_CODE <", value, "ORDER_CODE");
            return (Criteria) this;
        }

        public Criteria andORDER_CODELessThanOrEqualTo(String value) {
            addCriterion("ORDER_CODE <=", value, "ORDER_CODE");
            return (Criteria) this;
        }

        public Criteria andORDER_CODELike(String value) {
            addCriterion("ORDER_CODE like", value, "ORDER_CODE");
            return (Criteria) this;
        }

        public Criteria andORDER_CODENotLike(String value) {
            addCriterion("ORDER_CODE not like", value, "ORDER_CODE");
            return (Criteria) this;
        }

        public Criteria andORDER_CODEIn(List<String> values) {
            addCriterion("ORDER_CODE in", values, "ORDER_CODE");
            return (Criteria) this;
        }

        public Criteria andORDER_CODENotIn(List<String> values) {
            addCriterion("ORDER_CODE not in", values, "ORDER_CODE");
            return (Criteria) this;
        }

        public Criteria andORDER_CODEBetween(String value1, String value2) {
            addCriterion("ORDER_CODE between", value1, value2, "ORDER_CODE");
            return (Criteria) this;
        }

        public Criteria andORDER_CODENotBetween(String value1, String value2) {
            addCriterion("ORDER_CODE not between", value1, value2, "ORDER_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODEIsNull() {
            addCriterion("GOODS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODEIsNotNull() {
            addCriterion("GOODS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODEEqualTo(String value) {
            addCriterion("GOODS_CODE =", value, "GOODS_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODENotEqualTo(String value) {
            addCriterion("GOODS_CODE <>", value, "GOODS_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODEGreaterThan(String value) {
            addCriterion("GOODS_CODE >", value, "GOODS_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_CODE >=", value, "GOODS_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODELessThan(String value) {
            addCriterion("GOODS_CODE <", value, "GOODS_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODELessThanOrEqualTo(String value) {
            addCriterion("GOODS_CODE <=", value, "GOODS_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODELike(String value) {
            addCriterion("GOODS_CODE like", value, "GOODS_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODENotLike(String value) {
            addCriterion("GOODS_CODE not like", value, "GOODS_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODEIn(List<String> values) {
            addCriterion("GOODS_CODE in", values, "GOODS_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODENotIn(List<String> values) {
            addCriterion("GOODS_CODE not in", values, "GOODS_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODEBetween(String value1, String value2) {
            addCriterion("GOODS_CODE between", value1, value2, "GOODS_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_CODENotBetween(String value1, String value2) {
            addCriterion("GOODS_CODE not between", value1, value2, "GOODS_CODE");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMEIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMEIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMEEqualTo(String value) {
            addCriterion("GOODS_NAME =", value, "GOODS_NAME");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMENotEqualTo(String value) {
            addCriterion("GOODS_NAME <>", value, "GOODS_NAME");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMEGreaterThan(String value) {
            addCriterion("GOODS_NAME >", value, "GOODS_NAME");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME >=", value, "GOODS_NAME");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMELessThan(String value) {
            addCriterion("GOODS_NAME <", value, "GOODS_NAME");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMELessThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME <=", value, "GOODS_NAME");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMELike(String value) {
            addCriterion("GOODS_NAME like", value, "GOODS_NAME");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMENotLike(String value) {
            addCriterion("GOODS_NAME not like", value, "GOODS_NAME");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMEIn(List<String> values) {
            addCriterion("GOODS_NAME in", values, "GOODS_NAME");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMENotIn(List<String> values) {
            addCriterion("GOODS_NAME not in", values, "GOODS_NAME");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMEBetween(String value1, String value2) {
            addCriterion("GOODS_NAME between", value1, value2, "GOODS_NAME");
            return (Criteria) this;
        }

        public Criteria andGOODS_NAMENotBetween(String value1, String value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "GOODS_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEIsNull() {
            addCriterion("PRODUCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEIsNotNull() {
            addCriterion("PRODUCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEEqualTo(String value) {
            addCriterion("PRODUCT_CODE =", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODENotEqualTo(String value) {
            addCriterion("PRODUCT_CODE <>", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEGreaterThan(String value) {
            addCriterion("PRODUCT_CODE >", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE >=", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODELessThan(String value) {
            addCriterion("PRODUCT_CODE <", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODELessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE <=", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODELike(String value) {
            addCriterion("PRODUCT_CODE like", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODENotLike(String value) {
            addCriterion("PRODUCT_CODE not like", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEIn(List<String> values) {
            addCriterion("PRODUCT_CODE in", values, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODENotIn(List<String> values) {
            addCriterion("PRODUCT_CODE not in", values, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE between", value1, value2, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODENotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE not between", value1, value2, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMENotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMELessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMELessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMELike(String value) {
            addCriterion("PRODUCT_NAME like", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMENotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMENotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMENotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPORDUCT_NUMIsNull() {
            addCriterion("PORDUCT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPORDUCT_NUMIsNotNull() {
            addCriterion("PORDUCT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPORDUCT_NUMEqualTo(Long value) {
            addCriterion("PORDUCT_NUM =", value, "PORDUCT_NUM");
            return (Criteria) this;
        }

        public Criteria andPORDUCT_NUMNotEqualTo(Long value) {
            addCriterion("PORDUCT_NUM <>", value, "PORDUCT_NUM");
            return (Criteria) this;
        }

        public Criteria andPORDUCT_NUMGreaterThan(Long value) {
            addCriterion("PORDUCT_NUM >", value, "PORDUCT_NUM");
            return (Criteria) this;
        }

        public Criteria andPORDUCT_NUMGreaterThanOrEqualTo(Long value) {
            addCriterion("PORDUCT_NUM >=", value, "PORDUCT_NUM");
            return (Criteria) this;
        }

        public Criteria andPORDUCT_NUMLessThan(Long value) {
            addCriterion("PORDUCT_NUM <", value, "PORDUCT_NUM");
            return (Criteria) this;
        }

        public Criteria andPORDUCT_NUMLessThanOrEqualTo(Long value) {
            addCriterion("PORDUCT_NUM <=", value, "PORDUCT_NUM");
            return (Criteria) this;
        }

        public Criteria andPORDUCT_NUMIn(List<Long> values) {
            addCriterion("PORDUCT_NUM in", values, "PORDUCT_NUM");
            return (Criteria) this;
        }

        public Criteria andPORDUCT_NUMNotIn(List<Long> values) {
            addCriterion("PORDUCT_NUM not in", values, "PORDUCT_NUM");
            return (Criteria) this;
        }

        public Criteria andPORDUCT_NUMBetween(Long value1, Long value2) {
            addCriterion("PORDUCT_NUM between", value1, value2, "PORDUCT_NUM");
            return (Criteria) this;
        }

        public Criteria andPORDUCT_NUMNotBetween(Long value1, Long value2) {
            addCriterion("PORDUCT_NUM not between", value1, value2, "PORDUCT_NUM");
            return (Criteria) this;
        }

        public Criteria andEXCEED_NUMBERIsNull() {
            addCriterion("EXCEED_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEXCEED_NUMBERIsNotNull() {
            addCriterion("EXCEED_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEXCEED_NUMBEREqualTo(Long value) {
            addCriterion("EXCEED_NUMBER =", value, "EXCEED_NUMBER");
            return (Criteria) this;
        }

        public Criteria andEXCEED_NUMBERNotEqualTo(Long value) {
            addCriterion("EXCEED_NUMBER <>", value, "EXCEED_NUMBER");
            return (Criteria) this;
        }

        public Criteria andEXCEED_NUMBERGreaterThan(Long value) {
            addCriterion("EXCEED_NUMBER >", value, "EXCEED_NUMBER");
            return (Criteria) this;
        }

        public Criteria andEXCEED_NUMBERGreaterThanOrEqualTo(Long value) {
            addCriterion("EXCEED_NUMBER >=", value, "EXCEED_NUMBER");
            return (Criteria) this;
        }

        public Criteria andEXCEED_NUMBERLessThan(Long value) {
            addCriterion("EXCEED_NUMBER <", value, "EXCEED_NUMBER");
            return (Criteria) this;
        }

        public Criteria andEXCEED_NUMBERLessThanOrEqualTo(Long value) {
            addCriterion("EXCEED_NUMBER <=", value, "EXCEED_NUMBER");
            return (Criteria) this;
        }

        public Criteria andEXCEED_NUMBERIn(List<Long> values) {
            addCriterion("EXCEED_NUMBER in", values, "EXCEED_NUMBER");
            return (Criteria) this;
        }

        public Criteria andEXCEED_NUMBERNotIn(List<Long> values) {
            addCriterion("EXCEED_NUMBER not in", values, "EXCEED_NUMBER");
            return (Criteria) this;
        }

        public Criteria andEXCEED_NUMBERBetween(Long value1, Long value2) {
            addCriterion("EXCEED_NUMBER between", value1, value2, "EXCEED_NUMBER");
            return (Criteria) this;
        }

        public Criteria andEXCEED_NUMBERNotBetween(Long value1, Long value2) {
            addCriterion("EXCEED_NUMBER not between", value1, value2, "EXCEED_NUMBER");
            return (Criteria) this;
        }

        public Criteria andYEARIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYEARIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYEAREqualTo(Integer value) {
            addCriterion("YEAR =", value, "YEAR");
            return (Criteria) this;
        }

        public Criteria andYEARNotEqualTo(Integer value) {
            addCriterion("YEAR <>", value, "YEAR");
            return (Criteria) this;
        }

        public Criteria andYEARGreaterThan(Integer value) {
            addCriterion("YEAR >", value, "YEAR");
            return (Criteria) this;
        }

        public Criteria andYEARGreaterThanOrEqualTo(Integer value) {
            addCriterion("YEAR >=", value, "YEAR");
            return (Criteria) this;
        }

        public Criteria andYEARLessThan(Integer value) {
            addCriterion("YEAR <", value, "YEAR");
            return (Criteria) this;
        }

        public Criteria andYEARLessThanOrEqualTo(Integer value) {
            addCriterion("YEAR <=", value, "YEAR");
            return (Criteria) this;
        }

        public Criteria andYEARIn(List<Integer> values) {
            addCriterion("YEAR in", values, "YEAR");
            return (Criteria) this;
        }

        public Criteria andYEARNotIn(List<Integer> values) {
            addCriterion("YEAR not in", values, "YEAR");
            return (Criteria) this;
        }

        public Criteria andYEARBetween(Integer value1, Integer value2) {
            addCriterion("YEAR between", value1, value2, "YEAR");
            return (Criteria) this;
        }

        public Criteria andYEARNotBetween(Integer value1, Integer value2) {
            addCriterion("YEAR not between", value1, value2, "YEAR");
            return (Criteria) this;
        }

        public Criteria andMONTHIsNull() {
            addCriterion("MONTH is null");
            return (Criteria) this;
        }

        public Criteria andMONTHIsNotNull() {
            addCriterion("MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andMONTHEqualTo(Integer value) {
            addCriterion("MONTH =", value, "MONTH");
            return (Criteria) this;
        }

        public Criteria andMONTHNotEqualTo(Integer value) {
            addCriterion("MONTH <>", value, "MONTH");
            return (Criteria) this;
        }

        public Criteria andMONTHGreaterThan(Integer value) {
            addCriterion("MONTH >", value, "MONTH");
            return (Criteria) this;
        }

        public Criteria andMONTHGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONTH >=", value, "MONTH");
            return (Criteria) this;
        }

        public Criteria andMONTHLessThan(Integer value) {
            addCriterion("MONTH <", value, "MONTH");
            return (Criteria) this;
        }

        public Criteria andMONTHLessThanOrEqualTo(Integer value) {
            addCriterion("MONTH <=", value, "MONTH");
            return (Criteria) this;
        }

        public Criteria andMONTHIn(List<Integer> values) {
            addCriterion("MONTH in", values, "MONTH");
            return (Criteria) this;
        }

        public Criteria andMONTHNotIn(List<Integer> values) {
            addCriterion("MONTH not in", values, "MONTH");
            return (Criteria) this;
        }

        public Criteria andMONTHBetween(Integer value1, Integer value2) {
            addCriterion("MONTH between", value1, value2, "MONTH");
            return (Criteria) this;
        }

        public Criteria andMONTHNotBetween(Integer value1, Integer value2) {
            addCriterion("MONTH not between", value1, value2, "MONTH");
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