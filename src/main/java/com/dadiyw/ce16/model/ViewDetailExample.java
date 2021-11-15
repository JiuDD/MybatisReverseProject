package com.dadiyw.ce16.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewDetailExample() {
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

        public Criteria andCODEIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCODEIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCODEEqualTo(String value) {
            addCriterion("CODE =", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotEqualTo(String value) {
            addCriterion("CODE <>", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEGreaterThan(String value) {
            addCriterion("CODE >", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELessThan(String value) {
            addCriterion("CODE <", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELike(String value) {
            addCriterion("CODE like", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotLike(String value) {
            addCriterion("CODE not like", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEIn(List<String> values) {
            addCriterion("CODE in", values, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotIn(List<String> values) {
            addCriterion("CODE not in", values, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "CODE");
            return (Criteria) this;
        }

        public Criteria andMSGIsNull() {
            addCriterion("MSG is null");
            return (Criteria) this;
        }

        public Criteria andMSGIsNotNull() {
            addCriterion("MSG is not null");
            return (Criteria) this;
        }

        public Criteria andMSGEqualTo(String value) {
            addCriterion("MSG =", value, "MSG");
            return (Criteria) this;
        }

        public Criteria andMSGNotEqualTo(String value) {
            addCriterion("MSG <>", value, "MSG");
            return (Criteria) this;
        }

        public Criteria andMSGGreaterThan(String value) {
            addCriterion("MSG >", value, "MSG");
            return (Criteria) this;
        }

        public Criteria andMSGGreaterThanOrEqualTo(String value) {
            addCriterion("MSG >=", value, "MSG");
            return (Criteria) this;
        }

        public Criteria andMSGLessThan(String value) {
            addCriterion("MSG <", value, "MSG");
            return (Criteria) this;
        }

        public Criteria andMSGLessThanOrEqualTo(String value) {
            addCriterion("MSG <=", value, "MSG");
            return (Criteria) this;
        }

        public Criteria andMSGLike(String value) {
            addCriterion("MSG like", value, "MSG");
            return (Criteria) this;
        }

        public Criteria andMSGNotLike(String value) {
            addCriterion("MSG not like", value, "MSG");
            return (Criteria) this;
        }

        public Criteria andMSGIn(List<String> values) {
            addCriterion("MSG in", values, "MSG");
            return (Criteria) this;
        }

        public Criteria andMSGNotIn(List<String> values) {
            addCriterion("MSG not in", values, "MSG");
            return (Criteria) this;
        }

        public Criteria andMSGBetween(String value1, String value2) {
            addCriterion("MSG between", value1, value2, "MSG");
            return (Criteria) this;
        }

        public Criteria andMSGNotBetween(String value1, String value2) {
            addCriterion("MSG not between", value1, value2, "MSG");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDEqualTo(String value) {
            addCriterion("CHANNEL_ID =", value, "CHANNEL_ID");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDNotEqualTo(String value) {
            addCriterion("CHANNEL_ID <>", value, "CHANNEL_ID");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDGreaterThan(String value) {
            addCriterion("CHANNEL_ID >", value, "CHANNEL_ID");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID >=", value, "CHANNEL_ID");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDLessThan(String value) {
            addCriterion("CHANNEL_ID <", value, "CHANNEL_ID");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID <=", value, "CHANNEL_ID");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDLike(String value) {
            addCriterion("CHANNEL_ID like", value, "CHANNEL_ID");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDNotLike(String value) {
            addCriterion("CHANNEL_ID not like", value, "CHANNEL_ID");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDIn(List<String> values) {
            addCriterion("CHANNEL_ID in", values, "CHANNEL_ID");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDNotIn(List<String> values) {
            addCriterion("CHANNEL_ID not in", values, "CHANNEL_ID");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "CHANNEL_ID");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_IDNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "CHANNEL_ID");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDIsNull() {
            addCriterion("WEBINAR_ID is null");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDIsNotNull() {
            addCriterion("WEBINAR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDEqualTo(String value) {
            addCriterion("WEBINAR_ID =", value, "WEBINAR_ID");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDNotEqualTo(String value) {
            addCriterion("WEBINAR_ID <>", value, "WEBINAR_ID");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDGreaterThan(String value) {
            addCriterion("WEBINAR_ID >", value, "WEBINAR_ID");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDGreaterThanOrEqualTo(String value) {
            addCriterion("WEBINAR_ID >=", value, "WEBINAR_ID");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDLessThan(String value) {
            addCriterion("WEBINAR_ID <", value, "WEBINAR_ID");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDLessThanOrEqualTo(String value) {
            addCriterion("WEBINAR_ID <=", value, "WEBINAR_ID");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDLike(String value) {
            addCriterion("WEBINAR_ID like", value, "WEBINAR_ID");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDNotLike(String value) {
            addCriterion("WEBINAR_ID not like", value, "WEBINAR_ID");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDIn(List<String> values) {
            addCriterion("WEBINAR_ID in", values, "WEBINAR_ID");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDNotIn(List<String> values) {
            addCriterion("WEBINAR_ID not in", values, "WEBINAR_ID");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDBetween(String value1, String value2) {
            addCriterion("WEBINAR_ID between", value1, value2, "WEBINAR_ID");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_IDNotBetween(String value1, String value2) {
            addCriterion("WEBINAR_ID not between", value1, value2, "WEBINAR_ID");
            return (Criteria) this;
        }

        public Criteria andUIDIsNull() {
            addCriterion("UID is null");
            return (Criteria) this;
        }

        public Criteria andUIDIsNotNull() {
            addCriterion("UID is not null");
            return (Criteria) this;
        }

        public Criteria andUIDEqualTo(String value) {
            addCriterion("UID =", value, "UID");
            return (Criteria) this;
        }

        public Criteria andUIDNotEqualTo(String value) {
            addCriterion("UID <>", value, "UID");
            return (Criteria) this;
        }

        public Criteria andUIDGreaterThan(String value) {
            addCriterion("UID >", value, "UID");
            return (Criteria) this;
        }

        public Criteria andUIDGreaterThanOrEqualTo(String value) {
            addCriterion("UID >=", value, "UID");
            return (Criteria) this;
        }

        public Criteria andUIDLessThan(String value) {
            addCriterion("UID <", value, "UID");
            return (Criteria) this;
        }

        public Criteria andUIDLessThanOrEqualTo(String value) {
            addCriterion("UID <=", value, "UID");
            return (Criteria) this;
        }

        public Criteria andUIDLike(String value) {
            addCriterion("UID like", value, "UID");
            return (Criteria) this;
        }

        public Criteria andUIDNotLike(String value) {
            addCriterion("UID not like", value, "UID");
            return (Criteria) this;
        }

        public Criteria andUIDIn(List<String> values) {
            addCriterion("UID in", values, "UID");
            return (Criteria) this;
        }

        public Criteria andUIDNotIn(List<String> values) {
            addCriterion("UID not in", values, "UID");
            return (Criteria) this;
        }

        public Criteria andUIDBetween(String value1, String value2) {
            addCriterion("UID between", value1, value2, "UID");
            return (Criteria) this;
        }

        public Criteria andUIDNotBetween(String value1, String value2) {
            addCriterion("UID not between", value1, value2, "UID");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMEIsNull() {
            addCriterion("JOIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMEIsNotNull() {
            addCriterion("JOIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMEEqualTo(String value) {
            addCriterion("JOIN_TIME =", value, "JOIN_TIME");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMENotEqualTo(String value) {
            addCriterion("JOIN_TIME <>", value, "JOIN_TIME");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMEGreaterThan(String value) {
            addCriterion("JOIN_TIME >", value, "JOIN_TIME");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMEGreaterThanOrEqualTo(String value) {
            addCriterion("JOIN_TIME >=", value, "JOIN_TIME");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMELessThan(String value) {
            addCriterion("JOIN_TIME <", value, "JOIN_TIME");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMELessThanOrEqualTo(String value) {
            addCriterion("JOIN_TIME <=", value, "JOIN_TIME");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMELike(String value) {
            addCriterion("JOIN_TIME like", value, "JOIN_TIME");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMENotLike(String value) {
            addCriterion("JOIN_TIME not like", value, "JOIN_TIME");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMEIn(List<String> values) {
            addCriterion("JOIN_TIME in", values, "JOIN_TIME");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMENotIn(List<String> values) {
            addCriterion("JOIN_TIME not in", values, "JOIN_TIME");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMEBetween(String value1, String value2) {
            addCriterion("JOIN_TIME between", value1, value2, "JOIN_TIME");
            return (Criteria) this;
        }

        public Criteria andJOIN_TIMENotBetween(String value1, String value2) {
            addCriterion("JOIN_TIME not between", value1, value2, "JOIN_TIME");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMEIsNull() {
            addCriterion("LEAVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMEIsNotNull() {
            addCriterion("LEAVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMEEqualTo(String value) {
            addCriterion("LEAVE_TIME =", value, "LEAVE_TIME");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMENotEqualTo(String value) {
            addCriterion("LEAVE_TIME <>", value, "LEAVE_TIME");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMEGreaterThan(String value) {
            addCriterion("LEAVE_TIME >", value, "LEAVE_TIME");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMEGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_TIME >=", value, "LEAVE_TIME");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMELessThan(String value) {
            addCriterion("LEAVE_TIME <", value, "LEAVE_TIME");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMELessThanOrEqualTo(String value) {
            addCriterion("LEAVE_TIME <=", value, "LEAVE_TIME");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMELike(String value) {
            addCriterion("LEAVE_TIME like", value, "LEAVE_TIME");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMENotLike(String value) {
            addCriterion("LEAVE_TIME not like", value, "LEAVE_TIME");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMEIn(List<String> values) {
            addCriterion("LEAVE_TIME in", values, "LEAVE_TIME");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMENotIn(List<String> values) {
            addCriterion("LEAVE_TIME not in", values, "LEAVE_TIME");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMEBetween(String value1, String value2) {
            addCriterion("LEAVE_TIME between", value1, value2, "LEAVE_TIME");
            return (Criteria) this;
        }

        public Criteria andLEAVE_TIMENotBetween(String value1, String value2) {
            addCriterion("LEAVE_TIME not between", value1, value2, "LEAVE_TIME");
            return (Criteria) this;
        }

        public Criteria andDURATIONIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDURATIONIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDURATIONEqualTo(String value) {
            addCriterion("DURATION =", value, "DURATION");
            return (Criteria) this;
        }

        public Criteria andDURATIONNotEqualTo(String value) {
            addCriterion("DURATION <>", value, "DURATION");
            return (Criteria) this;
        }

        public Criteria andDURATIONGreaterThan(String value) {
            addCriterion("DURATION >", value, "DURATION");
            return (Criteria) this;
        }

        public Criteria andDURATIONGreaterThanOrEqualTo(String value) {
            addCriterion("DURATION >=", value, "DURATION");
            return (Criteria) this;
        }

        public Criteria andDURATIONLessThan(String value) {
            addCriterion("DURATION <", value, "DURATION");
            return (Criteria) this;
        }

        public Criteria andDURATIONLessThanOrEqualTo(String value) {
            addCriterion("DURATION <=", value, "DURATION");
            return (Criteria) this;
        }

        public Criteria andDURATIONLike(String value) {
            addCriterion("DURATION like", value, "DURATION");
            return (Criteria) this;
        }

        public Criteria andDURATIONNotLike(String value) {
            addCriterion("DURATION not like", value, "DURATION");
            return (Criteria) this;
        }

        public Criteria andDURATIONIn(List<String> values) {
            addCriterion("DURATION in", values, "DURATION");
            return (Criteria) this;
        }

        public Criteria andDURATIONNotIn(List<String> values) {
            addCriterion("DURATION not in", values, "DURATION");
            return (Criteria) this;
        }

        public Criteria andDURATIONBetween(String value1, String value2) {
            addCriterion("DURATION between", value1, value2, "DURATION");
            return (Criteria) this;
        }

        public Criteria andDURATIONNotBetween(String value1, String value2) {
            addCriterion("DURATION not between", value1, value2, "DURATION");
            return (Criteria) this;
        }

        public Criteria andIPIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIPIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIPEqualTo(String value) {
            addCriterion("IP =", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotEqualTo(String value) {
            addCriterion("IP <>", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThan(String value) {
            addCriterion("IP >", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThan(String value) {
            addCriterion("IP <", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLike(String value) {
            addCriterion("IP like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotLike(String value) {
            addCriterion("IP not like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPIn(List<String> values) {
            addCriterion("IP in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotIn(List<String> values) {
            addCriterion("IP not in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIsNull() {
            addCriterion("PLATFORM is null");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIsNotNull() {
            addCriterion("PLATFORM is not null");
            return (Criteria) this;
        }

        public Criteria andPLATFORMEqualTo(String value) {
            addCriterion("PLATFORM =", value, "PLATFORM");
            return (Criteria) this;
        }

        public Criteria andPLATFORMNotEqualTo(String value) {
            addCriterion("PLATFORM <>", value, "PLATFORM");
            return (Criteria) this;
        }

        public Criteria andPLATFORMGreaterThan(String value) {
            addCriterion("PLATFORM >", value, "PLATFORM");
            return (Criteria) this;
        }

        public Criteria andPLATFORMGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORM >=", value, "PLATFORM");
            return (Criteria) this;
        }

        public Criteria andPLATFORMLessThan(String value) {
            addCriterion("PLATFORM <", value, "PLATFORM");
            return (Criteria) this;
        }

        public Criteria andPLATFORMLessThanOrEqualTo(String value) {
            addCriterion("PLATFORM <=", value, "PLATFORM");
            return (Criteria) this;
        }

        public Criteria andPLATFORMLike(String value) {
            addCriterion("PLATFORM like", value, "PLATFORM");
            return (Criteria) this;
        }

        public Criteria andPLATFORMNotLike(String value) {
            addCriterion("PLATFORM not like", value, "PLATFORM");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIn(List<String> values) {
            addCriterion("PLATFORM in", values, "PLATFORM");
            return (Criteria) this;
        }

        public Criteria andPLATFORMNotIn(List<String> values) {
            addCriterion("PLATFORM not in", values, "PLATFORM");
            return (Criteria) this;
        }

        public Criteria andPLATFORMBetween(String value1, String value2) {
            addCriterion("PLATFORM between", value1, value2, "PLATFORM");
            return (Criteria) this;
        }

        public Criteria andPLATFORMNotBetween(String value1, String value2) {
            addCriterion("PLATFORM not between", value1, value2, "PLATFORM");
            return (Criteria) this;
        }

        public Criteria andAREAIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAREAIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAREAEqualTo(String value) {
            addCriterion("AREA =", value, "AREA");
            return (Criteria) this;
        }

        public Criteria andAREANotEqualTo(String value) {
            addCriterion("AREA <>", value, "AREA");
            return (Criteria) this;
        }

        public Criteria andAREAGreaterThan(String value) {
            addCriterion("AREA >", value, "AREA");
            return (Criteria) this;
        }

        public Criteria andAREAGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "AREA");
            return (Criteria) this;
        }

        public Criteria andAREALessThan(String value) {
            addCriterion("AREA <", value, "AREA");
            return (Criteria) this;
        }

        public Criteria andAREALessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "AREA");
            return (Criteria) this;
        }

        public Criteria andAREALike(String value) {
            addCriterion("AREA like", value, "AREA");
            return (Criteria) this;
        }

        public Criteria andAREANotLike(String value) {
            addCriterion("AREA not like", value, "AREA");
            return (Criteria) this;
        }

        public Criteria andAREAIn(List<String> values) {
            addCriterion("AREA in", values, "AREA");
            return (Criteria) this;
        }

        public Criteria andAREANotIn(List<String> values) {
            addCriterion("AREA not in", values, "AREA");
            return (Criteria) this;
        }

        public Criteria andAREABetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "AREA");
            return (Criteria) this;
        }

        public Criteria andAREANotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "AREA");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATIsNull() {
            addCriterion("CREATED_AT is null");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATIsNotNull() {
            addCriterion("CREATED_AT is not null");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATEqualTo(String value) {
            addCriterion("CREATED_AT =", value, "CREATED_AT");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATNotEqualTo(String value) {
            addCriterion("CREATED_AT <>", value, "CREATED_AT");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATGreaterThan(String value) {
            addCriterion("CREATED_AT >", value, "CREATED_AT");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_AT >=", value, "CREATED_AT");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATLessThan(String value) {
            addCriterion("CREATED_AT <", value, "CREATED_AT");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATLessThanOrEqualTo(String value) {
            addCriterion("CREATED_AT <=", value, "CREATED_AT");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATLike(String value) {
            addCriterion("CREATED_AT like", value, "CREATED_AT");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATNotLike(String value) {
            addCriterion("CREATED_AT not like", value, "CREATED_AT");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATIn(List<String> values) {
            addCriterion("CREATED_AT in", values, "CREATED_AT");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATNotIn(List<String> values) {
            addCriterion("CREATED_AT not in", values, "CREATED_AT");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATBetween(String value1, String value2) {
            addCriterion("CREATED_AT between", value1, value2, "CREATED_AT");
            return (Criteria) this;
        }

        public Criteria andCREATED_ATNotBetween(String value1, String value2) {
            addCriterion("CREATED_AT not between", value1, value2, "CREATED_AT");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMEIsNull() {
            addCriterion("WEBINAR_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMEIsNotNull() {
            addCriterion("WEBINAR_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMEEqualTo(String value) {
            addCriterion("WEBINAR_START_TIME =", value, "WEBINAR_START_TIME");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMENotEqualTo(String value) {
            addCriterion("WEBINAR_START_TIME <>", value, "WEBINAR_START_TIME");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMEGreaterThan(String value) {
            addCriterion("WEBINAR_START_TIME >", value, "WEBINAR_START_TIME");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMEGreaterThanOrEqualTo(String value) {
            addCriterion("WEBINAR_START_TIME >=", value, "WEBINAR_START_TIME");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMELessThan(String value) {
            addCriterion("WEBINAR_START_TIME <", value, "WEBINAR_START_TIME");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMELessThanOrEqualTo(String value) {
            addCriterion("WEBINAR_START_TIME <=", value, "WEBINAR_START_TIME");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMELike(String value) {
            addCriterion("WEBINAR_START_TIME like", value, "WEBINAR_START_TIME");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMENotLike(String value) {
            addCriterion("WEBINAR_START_TIME not like", value, "WEBINAR_START_TIME");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMEIn(List<String> values) {
            addCriterion("WEBINAR_START_TIME in", values, "WEBINAR_START_TIME");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMENotIn(List<String> values) {
            addCriterion("WEBINAR_START_TIME not in", values, "WEBINAR_START_TIME");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMEBetween(String value1, String value2) {
            addCriterion("WEBINAR_START_TIME between", value1, value2, "WEBINAR_START_TIME");
            return (Criteria) this;
        }

        public Criteria andWEBINAR_START_TIMENotBetween(String value1, String value2) {
            addCriterion("WEBINAR_START_TIME not between", value1, value2, "WEBINAR_START_TIME");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDIsNull() {
            addCriterion("INVITE_UID is null");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDIsNotNull() {
            addCriterion("INVITE_UID is not null");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDEqualTo(String value) {
            addCriterion("INVITE_UID =", value, "INVITE_UID");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDNotEqualTo(String value) {
            addCriterion("INVITE_UID <>", value, "INVITE_UID");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDGreaterThan(String value) {
            addCriterion("INVITE_UID >", value, "INVITE_UID");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDGreaterThanOrEqualTo(String value) {
            addCriterion("INVITE_UID >=", value, "INVITE_UID");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDLessThan(String value) {
            addCriterion("INVITE_UID <", value, "INVITE_UID");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDLessThanOrEqualTo(String value) {
            addCriterion("INVITE_UID <=", value, "INVITE_UID");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDLike(String value) {
            addCriterion("INVITE_UID like", value, "INVITE_UID");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDNotLike(String value) {
            addCriterion("INVITE_UID not like", value, "INVITE_UID");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDIn(List<String> values) {
            addCriterion("INVITE_UID in", values, "INVITE_UID");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDNotIn(List<String> values) {
            addCriterion("INVITE_UID not in", values, "INVITE_UID");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDBetween(String value1, String value2) {
            addCriterion("INVITE_UID between", value1, value2, "INVITE_UID");
            return (Criteria) this;
        }

        public Criteria andINVITE_UIDNotBetween(String value1, String value2) {
            addCriterion("INVITE_UID not between", value1, value2, "INVITE_UID");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMEIsNull() {
            addCriterion("INVITE_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMEIsNotNull() {
            addCriterion("INVITE_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMEEqualTo(String value) {
            addCriterion("INVITE_NICKNAME =", value, "INVITE_NICKNAME");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMENotEqualTo(String value) {
            addCriterion("INVITE_NICKNAME <>", value, "INVITE_NICKNAME");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMEGreaterThan(String value) {
            addCriterion("INVITE_NICKNAME >", value, "INVITE_NICKNAME");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("INVITE_NICKNAME >=", value, "INVITE_NICKNAME");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMELessThan(String value) {
            addCriterion("INVITE_NICKNAME <", value, "INVITE_NICKNAME");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMELessThanOrEqualTo(String value) {
            addCriterion("INVITE_NICKNAME <=", value, "INVITE_NICKNAME");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMELike(String value) {
            addCriterion("INVITE_NICKNAME like", value, "INVITE_NICKNAME");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMENotLike(String value) {
            addCriterion("INVITE_NICKNAME not like", value, "INVITE_NICKNAME");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMEIn(List<String> values) {
            addCriterion("INVITE_NICKNAME in", values, "INVITE_NICKNAME");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMENotIn(List<String> values) {
            addCriterion("INVITE_NICKNAME not in", values, "INVITE_NICKNAME");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMEBetween(String value1, String value2) {
            addCriterion("INVITE_NICKNAME between", value1, value2, "INVITE_NICKNAME");
            return (Criteria) this;
        }

        public Criteria andINVITE_NICKNAMENotBetween(String value1, String value2) {
            addCriterion("INVITE_NICKNAME not between", value1, value2, "INVITE_NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEEqualTo(String value) {
            addCriterion("NICKNAME =", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMENotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMELessThan(String value) {
            addCriterion("NICKNAME <", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMELessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMELike(String value) {
            addCriterion("NICKNAME like", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMENotLike(String value) {
            addCriterion("NICKNAME not like", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEIn(List<String> values) {
            addCriterion("NICKNAME in", values, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMENotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMENotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andPHONEIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPHONEIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPHONEEqualTo(String value) {
            addCriterion("PHONE =", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotEqualTo(String value) {
            addCriterion("PHONE <>", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEGreaterThan(String value) {
            addCriterion("PHONE >", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELessThan(String value) {
            addCriterion("PHONE <", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELike(String value) {
            addCriterion("PHONE like", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotLike(String value) {
            addCriterion("PHONE not like", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEIn(List<String> values) {
            addCriterion("PHONE in", values, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotIn(List<String> values) {
            addCriterion("PHONE not in", values, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "PHONE");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDIsNull() {
            addCriterion("ORIGIN_UNIQUE_ID is null");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDIsNotNull() {
            addCriterion("ORIGIN_UNIQUE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDEqualTo(String value) {
            addCriterion("ORIGIN_UNIQUE_ID =", value, "ORIGIN_UNIQUE_ID");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDNotEqualTo(String value) {
            addCriterion("ORIGIN_UNIQUE_ID <>", value, "ORIGIN_UNIQUE_ID");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDGreaterThan(String value) {
            addCriterion("ORIGIN_UNIQUE_ID >", value, "ORIGIN_UNIQUE_ID");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGIN_UNIQUE_ID >=", value, "ORIGIN_UNIQUE_ID");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDLessThan(String value) {
            addCriterion("ORIGIN_UNIQUE_ID <", value, "ORIGIN_UNIQUE_ID");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDLessThanOrEqualTo(String value) {
            addCriterion("ORIGIN_UNIQUE_ID <=", value, "ORIGIN_UNIQUE_ID");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDLike(String value) {
            addCriterion("ORIGIN_UNIQUE_ID like", value, "ORIGIN_UNIQUE_ID");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDNotLike(String value) {
            addCriterion("ORIGIN_UNIQUE_ID not like", value, "ORIGIN_UNIQUE_ID");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDIn(List<String> values) {
            addCriterion("ORIGIN_UNIQUE_ID in", values, "ORIGIN_UNIQUE_ID");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDNotIn(List<String> values) {
            addCriterion("ORIGIN_UNIQUE_ID not in", values, "ORIGIN_UNIQUE_ID");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDBetween(String value1, String value2) {
            addCriterion("ORIGIN_UNIQUE_ID between", value1, value2, "ORIGIN_UNIQUE_ID");
            return (Criteria) this;
        }

        public Criteria andORIGIN_UNIQUE_IDNotBetween(String value1, String value2) {
            addCriterion("ORIGIN_UNIQUE_ID not between", value1, value2, "ORIGIN_UNIQUE_ID");
            return (Criteria) this;
        }

        public Criteria andTOTALIsNull() {
            addCriterion("TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTOTALIsNotNull() {
            addCriterion("TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTOTALEqualTo(String value) {
            addCriterion("TOTAL =", value, "TOTAL");
            return (Criteria) this;
        }

        public Criteria andTOTALNotEqualTo(String value) {
            addCriterion("TOTAL <>", value, "TOTAL");
            return (Criteria) this;
        }

        public Criteria andTOTALGreaterThan(String value) {
            addCriterion("TOTAL >", value, "TOTAL");
            return (Criteria) this;
        }

        public Criteria andTOTALGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL >=", value, "TOTAL");
            return (Criteria) this;
        }

        public Criteria andTOTALLessThan(String value) {
            addCriterion("TOTAL <", value, "TOTAL");
            return (Criteria) this;
        }

        public Criteria andTOTALLessThanOrEqualTo(String value) {
            addCriterion("TOTAL <=", value, "TOTAL");
            return (Criteria) this;
        }

        public Criteria andTOTALLike(String value) {
            addCriterion("TOTAL like", value, "TOTAL");
            return (Criteria) this;
        }

        public Criteria andTOTALNotLike(String value) {
            addCriterion("TOTAL not like", value, "TOTAL");
            return (Criteria) this;
        }

        public Criteria andTOTALIn(List<String> values) {
            addCriterion("TOTAL in", values, "TOTAL");
            return (Criteria) this;
        }

        public Criteria andTOTALNotIn(List<String> values) {
            addCriterion("TOTAL not in", values, "TOTAL");
            return (Criteria) this;
        }

        public Criteria andTOTALBetween(String value1, String value2) {
            addCriterion("TOTAL between", value1, value2, "TOTAL");
            return (Criteria) this;
        }

        public Criteria andTOTALNotBetween(String value1, String value2) {
            addCriterion("TOTAL not between", value1, value2, "TOTAL");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPEIsNull() {
            addCriterion("API_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPEIsNotNull() {
            addCriterion("API_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPEEqualTo(String value) {
            addCriterion("API_TYPE =", value, "API_TYPE");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPENotEqualTo(String value) {
            addCriterion("API_TYPE <>", value, "API_TYPE");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPEGreaterThan(String value) {
            addCriterion("API_TYPE >", value, "API_TYPE");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("API_TYPE >=", value, "API_TYPE");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPELessThan(String value) {
            addCriterion("API_TYPE <", value, "API_TYPE");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPELessThanOrEqualTo(String value) {
            addCriterion("API_TYPE <=", value, "API_TYPE");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPELike(String value) {
            addCriterion("API_TYPE like", value, "API_TYPE");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPENotLike(String value) {
            addCriterion("API_TYPE not like", value, "API_TYPE");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPEIn(List<String> values) {
            addCriterion("API_TYPE in", values, "API_TYPE");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPENotIn(List<String> values) {
            addCriterion("API_TYPE not in", values, "API_TYPE");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPEBetween(String value1, String value2) {
            addCriterion("API_TYPE between", value1, value2, "API_TYPE");
            return (Criteria) this;
        }

        public Criteria andAPI_TYPENotBetween(String value1, String value2) {
            addCriterion("API_TYPE not between", value1, value2, "API_TYPE");
            return (Criteria) this;
        }

        public Criteria andDATACENTER_INSERT_TIMEIsNull() {
            addCriterion("DATACENTER_INSERT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDATACENTER_INSERT_TIMEIsNotNull() {
            addCriterion("DATACENTER_INSERT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDATACENTER_INSERT_TIMEEqualTo(Date value) {
            addCriterion("DATACENTER_INSERT_TIME =", value, "DATACENTER_INSERT_TIME");
            return (Criteria) this;
        }

        public Criteria andDATACENTER_INSERT_TIMENotEqualTo(Date value) {
            addCriterion("DATACENTER_INSERT_TIME <>", value, "DATACENTER_INSERT_TIME");
            return (Criteria) this;
        }

        public Criteria andDATACENTER_INSERT_TIMEGreaterThan(Date value) {
            addCriterion("DATACENTER_INSERT_TIME >", value, "DATACENTER_INSERT_TIME");
            return (Criteria) this;
        }

        public Criteria andDATACENTER_INSERT_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("DATACENTER_INSERT_TIME >=", value, "DATACENTER_INSERT_TIME");
            return (Criteria) this;
        }

        public Criteria andDATACENTER_INSERT_TIMELessThan(Date value) {
            addCriterion("DATACENTER_INSERT_TIME <", value, "DATACENTER_INSERT_TIME");
            return (Criteria) this;
        }

        public Criteria andDATACENTER_INSERT_TIMELessThanOrEqualTo(Date value) {
            addCriterion("DATACENTER_INSERT_TIME <=", value, "DATACENTER_INSERT_TIME");
            return (Criteria) this;
        }

        public Criteria andDATACENTER_INSERT_TIMEIn(List<Date> values) {
            addCriterion("DATACENTER_INSERT_TIME in", values, "DATACENTER_INSERT_TIME");
            return (Criteria) this;
        }

        public Criteria andDATACENTER_INSERT_TIMENotIn(List<Date> values) {
            addCriterion("DATACENTER_INSERT_TIME not in", values, "DATACENTER_INSERT_TIME");
            return (Criteria) this;
        }

        public Criteria andDATACENTER_INSERT_TIMEBetween(Date value1, Date value2) {
            addCriterion("DATACENTER_INSERT_TIME between", value1, value2, "DATACENTER_INSERT_TIME");
            return (Criteria) this;
        }

        public Criteria andDATACENTER_INSERT_TIMENotBetween(Date value1, Date value2) {
            addCriterion("DATACENTER_INSERT_TIME not between", value1, value2, "DATACENTER_INSERT_TIME");
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