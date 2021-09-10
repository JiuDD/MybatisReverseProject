package com.dadiyw.be01;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportSeoEqidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportSeoEqidExample() {
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

        public Criteria andURL_HOSTIsNull() {
            addCriterion("URL_HOST is null");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTIsNotNull() {
            addCriterion("URL_HOST is not null");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTEqualTo(String value) {
            addCriterion("URL_HOST =", value, "URL_HOST");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTNotEqualTo(String value) {
            addCriterion("URL_HOST <>", value, "URL_HOST");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTGreaterThan(String value) {
            addCriterion("URL_HOST >", value, "URL_HOST");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTGreaterThanOrEqualTo(String value) {
            addCriterion("URL_HOST >=", value, "URL_HOST");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTLessThan(String value) {
            addCriterion("URL_HOST <", value, "URL_HOST");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTLessThanOrEqualTo(String value) {
            addCriterion("URL_HOST <=", value, "URL_HOST");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTLike(String value) {
            addCriterion("URL_HOST like", value, "URL_HOST");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTNotLike(String value) {
            addCriterion("URL_HOST not like", value, "URL_HOST");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTIn(List<String> values) {
            addCriterion("URL_HOST in", values, "URL_HOST");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTNotIn(List<String> values) {
            addCriterion("URL_HOST not in", values, "URL_HOST");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTBetween(String value1, String value2) {
            addCriterion("URL_HOST between", value1, value2, "URL_HOST");
            return (Criteria) this;
        }

        public Criteria andURL_HOSTNotBetween(String value1, String value2) {
            addCriterion("URL_HOST not between", value1, value2, "URL_HOST");
            return (Criteria) this;
        }

        public Criteria andEQIDIsNull() {
            addCriterion("EQID is null");
            return (Criteria) this;
        }

        public Criteria andEQIDIsNotNull() {
            addCriterion("EQID is not null");
            return (Criteria) this;
        }

        public Criteria andEQIDEqualTo(String value) {
            addCriterion("EQID =", value, "EQID");
            return (Criteria) this;
        }

        public Criteria andEQIDNotEqualTo(String value) {
            addCriterion("EQID <>", value, "EQID");
            return (Criteria) this;
        }

        public Criteria andEQIDGreaterThan(String value) {
            addCriterion("EQID >", value, "EQID");
            return (Criteria) this;
        }

        public Criteria andEQIDGreaterThanOrEqualTo(String value) {
            addCriterion("EQID >=", value, "EQID");
            return (Criteria) this;
        }

        public Criteria andEQIDLessThan(String value) {
            addCriterion("EQID <", value, "EQID");
            return (Criteria) this;
        }

        public Criteria andEQIDLessThanOrEqualTo(String value) {
            addCriterion("EQID <=", value, "EQID");
            return (Criteria) this;
        }

        public Criteria andEQIDLike(String value) {
            addCriterion("EQID like", value, "EQID");
            return (Criteria) this;
        }

        public Criteria andEQIDNotLike(String value) {
            addCriterion("EQID not like", value, "EQID");
            return (Criteria) this;
        }

        public Criteria andEQIDIn(List<String> values) {
            addCriterion("EQID in", values, "EQID");
            return (Criteria) this;
        }

        public Criteria andEQIDNotIn(List<String> values) {
            addCriterion("EQID not in", values, "EQID");
            return (Criteria) this;
        }

        public Criteria andEQIDBetween(String value1, String value2) {
            addCriterion("EQID between", value1, value2, "EQID");
            return (Criteria) this;
        }

        public Criteria andEQIDNotBetween(String value1, String value2) {
            addCriterion("EQID not between", value1, value2, "EQID");
            return (Criteria) this;
        }

        public Criteria andPVIsNull() {
            addCriterion("PV is null");
            return (Criteria) this;
        }

        public Criteria andPVIsNotNull() {
            addCriterion("PV is not null");
            return (Criteria) this;
        }

        public Criteria andPVEqualTo(Integer value) {
            addCriterion("PV =", value, "PV");
            return (Criteria) this;
        }

        public Criteria andPVNotEqualTo(Integer value) {
            addCriterion("PV <>", value, "PV");
            return (Criteria) this;
        }

        public Criteria andPVGreaterThan(Integer value) {
            addCriterion("PV >", value, "PV");
            return (Criteria) this;
        }

        public Criteria andPVGreaterThanOrEqualTo(Integer value) {
            addCriterion("PV >=", value, "PV");
            return (Criteria) this;
        }

        public Criteria andPVLessThan(Integer value) {
            addCriterion("PV <", value, "PV");
            return (Criteria) this;
        }

        public Criteria andPVLessThanOrEqualTo(Integer value) {
            addCriterion("PV <=", value, "PV");
            return (Criteria) this;
        }

        public Criteria andPVIn(List<Integer> values) {
            addCriterion("PV in", values, "PV");
            return (Criteria) this;
        }

        public Criteria andPVNotIn(List<Integer> values) {
            addCriterion("PV not in", values, "PV");
            return (Criteria) this;
        }

        public Criteria andPVBetween(Integer value1, Integer value2) {
            addCriterion("PV between", value1, value2, "PV");
            return (Criteria) this;
        }

        public Criteria andPVNotBetween(Integer value1, Integer value2) {
            addCriterion("PV not between", value1, value2, "PV");
            return (Criteria) this;
        }

        public Criteria andUVIsNull() {
            addCriterion("UV is null");
            return (Criteria) this;
        }

        public Criteria andUVIsNotNull() {
            addCriterion("UV is not null");
            return (Criteria) this;
        }

        public Criteria andUVEqualTo(Integer value) {
            addCriterion("UV =", value, "UV");
            return (Criteria) this;
        }

        public Criteria andUVNotEqualTo(Integer value) {
            addCriterion("UV <>", value, "UV");
            return (Criteria) this;
        }

        public Criteria andUVGreaterThan(Integer value) {
            addCriterion("UV >", value, "UV");
            return (Criteria) this;
        }

        public Criteria andUVGreaterThanOrEqualTo(Integer value) {
            addCriterion("UV >=", value, "UV");
            return (Criteria) this;
        }

        public Criteria andUVLessThan(Integer value) {
            addCriterion("UV <", value, "UV");
            return (Criteria) this;
        }

        public Criteria andUVLessThanOrEqualTo(Integer value) {
            addCriterion("UV <=", value, "UV");
            return (Criteria) this;
        }

        public Criteria andUVIn(List<Integer> values) {
            addCriterion("UV in", values, "UV");
            return (Criteria) this;
        }

        public Criteria andUVNotIn(List<Integer> values) {
            addCriterion("UV not in", values, "UV");
            return (Criteria) this;
        }

        public Criteria andUVBetween(Integer value1, Integer value2) {
            addCriterion("UV between", value1, value2, "UV");
            return (Criteria) this;
        }

        public Criteria andUVNotBetween(Integer value1, Integer value2) {
            addCriterion("UV not between", value1, value2, "UV");
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