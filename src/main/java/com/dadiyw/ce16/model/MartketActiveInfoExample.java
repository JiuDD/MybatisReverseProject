package com.dadiyw.ce16.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MartketActiveInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MartketActiveInfoExample() {
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

        public Criteria andMidCodeIsNull() {
            addCriterion("MID_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMidCodeIsNotNull() {
            addCriterion("MID_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMidCodeEqualTo(String value) {
            addCriterion("MID_CODE =", value, "midCode");
            return (Criteria) this;
        }

        public Criteria andMidCodeNotEqualTo(String value) {
            addCriterion("MID_CODE <>", value, "midCode");
            return (Criteria) this;
        }

        public Criteria andMidCodeGreaterThan(String value) {
            addCriterion("MID_CODE >", value, "midCode");
            return (Criteria) this;
        }

        public Criteria andMidCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MID_CODE >=", value, "midCode");
            return (Criteria) this;
        }

        public Criteria andMidCodeLessThan(String value) {
            addCriterion("MID_CODE <", value, "midCode");
            return (Criteria) this;
        }

        public Criteria andMidCodeLessThanOrEqualTo(String value) {
            addCriterion("MID_CODE <=", value, "midCode");
            return (Criteria) this;
        }

        public Criteria andMidCodeLike(String value) {
            addCriterion("MID_CODE like", value, "midCode");
            return (Criteria) this;
        }

        public Criteria andMidCodeNotLike(String value) {
            addCriterion("MID_CODE not like", value, "midCode");
            return (Criteria) this;
        }

        public Criteria andMidCodeIn(List<String> values) {
            addCriterion("MID_CODE in", values, "midCode");
            return (Criteria) this;
        }

        public Criteria andMidCodeNotIn(List<String> values) {
            addCriterion("MID_CODE not in", values, "midCode");
            return (Criteria) this;
        }

        public Criteria andMidCodeBetween(String value1, String value2) {
            addCriterion("MID_CODE between", value1, value2, "midCode");
            return (Criteria) this;
        }

        public Criteria andMidCodeNotBetween(String value1, String value2) {
            addCriterion("MID_CODE not between", value1, value2, "midCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNull() {
            addCriterion("SHOP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNotNull() {
            addCriterion("SHOP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andShopCodeEqualTo(String value) {
            addCriterion("SHOP_CODE =", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotEqualTo(String value) {
            addCriterion("SHOP_CODE <>", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThan(String value) {
            addCriterion("SHOP_CODE >", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_CODE >=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThan(String value) {
            addCriterion("SHOP_CODE <", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThanOrEqualTo(String value) {
            addCriterion("SHOP_CODE <=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLike(String value) {
            addCriterion("SHOP_CODE like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotLike(String value) {
            addCriterion("SHOP_CODE not like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeIn(List<String> values) {
            addCriterion("SHOP_CODE in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotIn(List<String> values) {
            addCriterion("SHOP_CODE not in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeBetween(String value1, String value2) {
            addCriterion("SHOP_CODE between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotBetween(String value1, String value2) {
            addCriterion("SHOP_CODE not between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeIsNull() {
            addCriterion("ACTIVE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andActiveCodeIsNotNull() {
            addCriterion("ACTIVE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andActiveCodeEqualTo(String value) {
            addCriterion("ACTIVE_CODE =", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeNotEqualTo(String value) {
            addCriterion("ACTIVE_CODE <>", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeGreaterThan(String value) {
            addCriterion("ACTIVE_CODE >", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVE_CODE >=", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeLessThan(String value) {
            addCriterion("ACTIVE_CODE <", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeLessThanOrEqualTo(String value) {
            addCriterion("ACTIVE_CODE <=", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeLike(String value) {
            addCriterion("ACTIVE_CODE like", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeNotLike(String value) {
            addCriterion("ACTIVE_CODE not like", value, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeIn(List<String> values) {
            addCriterion("ACTIVE_CODE in", values, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeNotIn(List<String> values) {
            addCriterion("ACTIVE_CODE not in", values, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeBetween(String value1, String value2) {
            addCriterion("ACTIVE_CODE between", value1, value2, "activeCode");
            return (Criteria) this;
        }

        public Criteria andActiveCodeNotBetween(String value1, String value2) {
            addCriterion("ACTIVE_CODE not between", value1, value2, "activeCode");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeIsNull() {
            addCriterion("MARKET_ACTIVE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeIsNotNull() {
            addCriterion("MARKET_ACTIVE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeEqualTo(String value) {
            addCriterion("MARKET_ACTIVE_TYPE =", value, "marketActiveType");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeNotEqualTo(String value) {
            addCriterion("MARKET_ACTIVE_TYPE <>", value, "marketActiveType");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeGreaterThan(String value) {
            addCriterion("MARKET_ACTIVE_TYPE >", value, "marketActiveType");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MARKET_ACTIVE_TYPE >=", value, "marketActiveType");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeLessThan(String value) {
            addCriterion("MARKET_ACTIVE_TYPE <", value, "marketActiveType");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeLessThanOrEqualTo(String value) {
            addCriterion("MARKET_ACTIVE_TYPE <=", value, "marketActiveType");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeLike(String value) {
            addCriterion("MARKET_ACTIVE_TYPE like", value, "marketActiveType");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeNotLike(String value) {
            addCriterion("MARKET_ACTIVE_TYPE not like", value, "marketActiveType");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeIn(List<String> values) {
            addCriterion("MARKET_ACTIVE_TYPE in", values, "marketActiveType");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeNotIn(List<String> values) {
            addCriterion("MARKET_ACTIVE_TYPE not in", values, "marketActiveType");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeBetween(String value1, String value2) {
            addCriterion("MARKET_ACTIVE_TYPE between", value1, value2, "marketActiveType");
            return (Criteria) this;
        }

        public Criteria andMarketActiveTypeNotBetween(String value1, String value2) {
            addCriterion("MARKET_ACTIVE_TYPE not between", value1, value2, "marketActiveType");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIsNull() {
            addCriterion("ACTIVE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIsNotNull() {
            addCriterion("ACTIVE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andActiveStatusEqualTo(String value) {
            addCriterion("ACTIVE_STATUS =", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotEqualTo(String value) {
            addCriterion("ACTIVE_STATUS <>", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusGreaterThan(String value) {
            addCriterion("ACTIVE_STATUS >", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVE_STATUS >=", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusLessThan(String value) {
            addCriterion("ACTIVE_STATUS <", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusLessThanOrEqualTo(String value) {
            addCriterion("ACTIVE_STATUS <=", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusLike(String value) {
            addCriterion("ACTIVE_STATUS like", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotLike(String value) {
            addCriterion("ACTIVE_STATUS not like", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIn(List<String> values) {
            addCriterion("ACTIVE_STATUS in", values, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotIn(List<String> values) {
            addCriterion("ACTIVE_STATUS not in", values, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusBetween(String value1, String value2) {
            addCriterion("ACTIVE_STATUS between", value1, value2, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotBetween(String value1, String value2) {
            addCriterion("ACTIVE_STATUS not between", value1, value2, "activeStatus");
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