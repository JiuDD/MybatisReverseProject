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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("MSG is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("MSG is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("MSG =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("MSG <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("MSG >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("MSG >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("MSG <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("MSG <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("MSG like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("MSG not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("MSG in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("MSG not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("MSG between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("MSG not between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("CHANNEL_ID like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("CHANNEL_ID not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andWebinarIdIsNull() {
            addCriterion("WEBINAR_ID is null");
            return (Criteria) this;
        }

        public Criteria andWebinarIdIsNotNull() {
            addCriterion("WEBINAR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWebinarIdEqualTo(String value) {
            addCriterion("WEBINAR_ID =", value, "webinarId");
            return (Criteria) this;
        }

        public Criteria andWebinarIdNotEqualTo(String value) {
            addCriterion("WEBINAR_ID <>", value, "webinarId");
            return (Criteria) this;
        }

        public Criteria andWebinarIdGreaterThan(String value) {
            addCriterion("WEBINAR_ID >", value, "webinarId");
            return (Criteria) this;
        }

        public Criteria andWebinarIdGreaterThanOrEqualTo(String value) {
            addCriterion("WEBINAR_ID >=", value, "webinarId");
            return (Criteria) this;
        }

        public Criteria andWebinarIdLessThan(String value) {
            addCriterion("WEBINAR_ID <", value, "webinarId");
            return (Criteria) this;
        }

        public Criteria andWebinarIdLessThanOrEqualTo(String value) {
            addCriterion("WEBINAR_ID <=", value, "webinarId");
            return (Criteria) this;
        }

        public Criteria andWebinarIdLike(String value) {
            addCriterion("WEBINAR_ID like", value, "webinarId");
            return (Criteria) this;
        }

        public Criteria andWebinarIdNotLike(String value) {
            addCriterion("WEBINAR_ID not like", value, "webinarId");
            return (Criteria) this;
        }

        public Criteria andWebinarIdIn(List<String> values) {
            addCriterion("WEBINAR_ID in", values, "webinarId");
            return (Criteria) this;
        }

        public Criteria andWebinarIdNotIn(List<String> values) {
            addCriterion("WEBINAR_ID not in", values, "webinarId");
            return (Criteria) this;
        }

        public Criteria andWebinarIdBetween(String value1, String value2) {
            addCriterion("WEBINAR_ID between", value1, value2, "webinarId");
            return (Criteria) this;
        }

        public Criteria andWebinarIdNotBetween(String value1, String value2) {
            addCriterion("WEBINAR_ID not between", value1, value2, "webinarId");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNull() {
            addCriterion("JOIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNotNull() {
            addCriterion("JOIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeEqualTo(String value) {
            addCriterion("JOIN_TIME =", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotEqualTo(String value) {
            addCriterion("JOIN_TIME <>", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThan(String value) {
            addCriterion("JOIN_TIME >", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThanOrEqualTo(String value) {
            addCriterion("JOIN_TIME >=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThan(String value) {
            addCriterion("JOIN_TIME <", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThanOrEqualTo(String value) {
            addCriterion("JOIN_TIME <=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLike(String value) {
            addCriterion("JOIN_TIME like", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotLike(String value) {
            addCriterion("JOIN_TIME not like", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIn(List<String> values) {
            addCriterion("JOIN_TIME in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotIn(List<String> values) {
            addCriterion("JOIN_TIME not in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeBetween(String value1, String value2) {
            addCriterion("JOIN_TIME between", value1, value2, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotBetween(String value1, String value2) {
            addCriterion("JOIN_TIME not between", value1, value2, "joinTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("LEAVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("LEAVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(String value) {
            addCriterion("LEAVE_TIME =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(String value) {
            addCriterion("LEAVE_TIME <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(String value) {
            addCriterion("LEAVE_TIME >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_TIME >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(String value) {
            addCriterion("LEAVE_TIME <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_TIME <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLike(String value) {
            addCriterion("LEAVE_TIME like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotLike(String value) {
            addCriterion("LEAVE_TIME not like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<String> values) {
            addCriterion("LEAVE_TIME in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<String> values) {
            addCriterion("LEAVE_TIME not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(String value1, String value2) {
            addCriterion("LEAVE_TIME between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(String value1, String value2) {
            addCriterion("LEAVE_TIME not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(String value) {
            addCriterion("DURATION =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(String value) {
            addCriterion("DURATION <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(String value) {
            addCriterion("DURATION >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(String value) {
            addCriterion("DURATION >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(String value) {
            addCriterion("DURATION <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(String value) {
            addCriterion("DURATION <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLike(String value) {
            addCriterion("DURATION like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotLike(String value) {
            addCriterion("DURATION not like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<String> values) {
            addCriterion("DURATION in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<String> values) {
            addCriterion("DURATION not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(String value1, String value2) {
            addCriterion("DURATION between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(String value1, String value2) {
            addCriterion("DURATION not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("PLATFORM is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("PLATFORM is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("PLATFORM =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("PLATFORM <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("PLATFORM >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORM >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("PLATFORM <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("PLATFORM <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("PLATFORM like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("PLATFORM not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("PLATFORM in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("PLATFORM not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("PLATFORM between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("PLATFORM not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("CREATED_AT is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("CREATED_AT is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(String value) {
            addCriterion("CREATED_AT =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(String value) {
            addCriterion("CREATED_AT <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(String value) {
            addCriterion("CREATED_AT >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_AT >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(String value) {
            addCriterion("CREATED_AT <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(String value) {
            addCriterion("CREATED_AT <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLike(String value) {
            addCriterion("CREATED_AT like", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotLike(String value) {
            addCriterion("CREATED_AT not like", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<String> values) {
            addCriterion("CREATED_AT in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<String> values) {
            addCriterion("CREATED_AT not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(String value1, String value2) {
            addCriterion("CREATED_AT between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(String value1, String value2) {
            addCriterion("CREATED_AT not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeIsNull() {
            addCriterion("WEBINAR_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeIsNotNull() {
            addCriterion("WEBINAR_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeEqualTo(String value) {
            addCriterion("WEBINAR_START_TIME =", value, "webinarStartTime");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeNotEqualTo(String value) {
            addCriterion("WEBINAR_START_TIME <>", value, "webinarStartTime");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeGreaterThan(String value) {
            addCriterion("WEBINAR_START_TIME >", value, "webinarStartTime");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("WEBINAR_START_TIME >=", value, "webinarStartTime");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeLessThan(String value) {
            addCriterion("WEBINAR_START_TIME <", value, "webinarStartTime");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeLessThanOrEqualTo(String value) {
            addCriterion("WEBINAR_START_TIME <=", value, "webinarStartTime");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeLike(String value) {
            addCriterion("WEBINAR_START_TIME like", value, "webinarStartTime");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeNotLike(String value) {
            addCriterion("WEBINAR_START_TIME not like", value, "webinarStartTime");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeIn(List<String> values) {
            addCriterion("WEBINAR_START_TIME in", values, "webinarStartTime");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeNotIn(List<String> values) {
            addCriterion("WEBINAR_START_TIME not in", values, "webinarStartTime");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeBetween(String value1, String value2) {
            addCriterion("WEBINAR_START_TIME between", value1, value2, "webinarStartTime");
            return (Criteria) this;
        }

        public Criteria andWebinarStartTimeNotBetween(String value1, String value2) {
            addCriterion("WEBINAR_START_TIME not between", value1, value2, "webinarStartTime");
            return (Criteria) this;
        }

        public Criteria andInviteUidIsNull() {
            addCriterion("INVITE_UID is null");
            return (Criteria) this;
        }

        public Criteria andInviteUidIsNotNull() {
            addCriterion("INVITE_UID is not null");
            return (Criteria) this;
        }

        public Criteria andInviteUidEqualTo(String value) {
            addCriterion("INVITE_UID =", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidNotEqualTo(String value) {
            addCriterion("INVITE_UID <>", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidGreaterThan(String value) {
            addCriterion("INVITE_UID >", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidGreaterThanOrEqualTo(String value) {
            addCriterion("INVITE_UID >=", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidLessThan(String value) {
            addCriterion("INVITE_UID <", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidLessThanOrEqualTo(String value) {
            addCriterion("INVITE_UID <=", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidLike(String value) {
            addCriterion("INVITE_UID like", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidNotLike(String value) {
            addCriterion("INVITE_UID not like", value, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidIn(List<String> values) {
            addCriterion("INVITE_UID in", values, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidNotIn(List<String> values) {
            addCriterion("INVITE_UID not in", values, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidBetween(String value1, String value2) {
            addCriterion("INVITE_UID between", value1, value2, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteUidNotBetween(String value1, String value2) {
            addCriterion("INVITE_UID not between", value1, value2, "inviteUid");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameIsNull() {
            addCriterion("INVITE_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameIsNotNull() {
            addCriterion("INVITE_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameEqualTo(String value) {
            addCriterion("INVITE_NICKNAME =", value, "inviteNickname");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameNotEqualTo(String value) {
            addCriterion("INVITE_NICKNAME <>", value, "inviteNickname");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameGreaterThan(String value) {
            addCriterion("INVITE_NICKNAME >", value, "inviteNickname");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("INVITE_NICKNAME >=", value, "inviteNickname");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameLessThan(String value) {
            addCriterion("INVITE_NICKNAME <", value, "inviteNickname");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameLessThanOrEqualTo(String value) {
            addCriterion("INVITE_NICKNAME <=", value, "inviteNickname");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameLike(String value) {
            addCriterion("INVITE_NICKNAME like", value, "inviteNickname");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameNotLike(String value) {
            addCriterion("INVITE_NICKNAME not like", value, "inviteNickname");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameIn(List<String> values) {
            addCriterion("INVITE_NICKNAME in", values, "inviteNickname");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameNotIn(List<String> values) {
            addCriterion("INVITE_NICKNAME not in", values, "inviteNickname");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameBetween(String value1, String value2) {
            addCriterion("INVITE_NICKNAME between", value1, value2, "inviteNickname");
            return (Criteria) this;
        }

        public Criteria andInviteNicknameNotBetween(String value1, String value2) {
            addCriterion("INVITE_NICKNAME not between", value1, value2, "inviteNickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NICKNAME =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NICKNAME <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NICKNAME like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NICKNAME not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NICKNAME in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdIsNull() {
            addCriterion("ORIGIN_UNIQUE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdIsNotNull() {
            addCriterion("ORIGIN_UNIQUE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdEqualTo(String value) {
            addCriterion("ORIGIN_UNIQUE_ID =", value, "originUniqueId");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdNotEqualTo(String value) {
            addCriterion("ORIGIN_UNIQUE_ID <>", value, "originUniqueId");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdGreaterThan(String value) {
            addCriterion("ORIGIN_UNIQUE_ID >", value, "originUniqueId");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGIN_UNIQUE_ID >=", value, "originUniqueId");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdLessThan(String value) {
            addCriterion("ORIGIN_UNIQUE_ID <", value, "originUniqueId");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdLessThanOrEqualTo(String value) {
            addCriterion("ORIGIN_UNIQUE_ID <=", value, "originUniqueId");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdLike(String value) {
            addCriterion("ORIGIN_UNIQUE_ID like", value, "originUniqueId");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdNotLike(String value) {
            addCriterion("ORIGIN_UNIQUE_ID not like", value, "originUniqueId");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdIn(List<String> values) {
            addCriterion("ORIGIN_UNIQUE_ID in", values, "originUniqueId");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdNotIn(List<String> values) {
            addCriterion("ORIGIN_UNIQUE_ID not in", values, "originUniqueId");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdBetween(String value1, String value2) {
            addCriterion("ORIGIN_UNIQUE_ID between", value1, value2, "originUniqueId");
            return (Criteria) this;
        }

        public Criteria andOriginUniqueIdNotBetween(String value1, String value2) {
            addCriterion("ORIGIN_UNIQUE_ID not between", value1, value2, "originUniqueId");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(String value) {
            addCriterion("TOTAL =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(String value) {
            addCriterion("TOTAL <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(String value) {
            addCriterion("TOTAL >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(String value) {
            addCriterion("TOTAL <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(String value) {
            addCriterion("TOTAL <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLike(String value) {
            addCriterion("TOTAL like", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotLike(String value) {
            addCriterion("TOTAL not like", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<String> values) {
            addCriterion("TOTAL in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<String> values) {
            addCriterion("TOTAL not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(String value1, String value2) {
            addCriterion("TOTAL between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(String value1, String value2) {
            addCriterion("TOTAL not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andApiTypeIsNull() {
            addCriterion("API_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andApiTypeIsNotNull() {
            addCriterion("API_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApiTypeEqualTo(String value) {
            addCriterion("API_TYPE =", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotEqualTo(String value) {
            addCriterion("API_TYPE <>", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeGreaterThan(String value) {
            addCriterion("API_TYPE >", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("API_TYPE >=", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeLessThan(String value) {
            addCriterion("API_TYPE <", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeLessThanOrEqualTo(String value) {
            addCriterion("API_TYPE <=", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeLike(String value) {
            addCriterion("API_TYPE like", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotLike(String value) {
            addCriterion("API_TYPE not like", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeIn(List<String> values) {
            addCriterion("API_TYPE in", values, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotIn(List<String> values) {
            addCriterion("API_TYPE not in", values, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeBetween(String value1, String value2) {
            addCriterion("API_TYPE between", value1, value2, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotBetween(String value1, String value2) {
            addCriterion("API_TYPE not between", value1, value2, "apiType");
            return (Criteria) this;
        }

        public Criteria andDatacenterInsertTimeIsNull() {
            addCriterion("DATACENTER_INSERT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDatacenterInsertTimeIsNotNull() {
            addCriterion("DATACENTER_INSERT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatacenterInsertTimeEqualTo(Date value) {
            addCriterion("DATACENTER_INSERT_TIME =", value, "datacenterInsertTime");
            return (Criteria) this;
        }

        public Criteria andDatacenterInsertTimeNotEqualTo(Date value) {
            addCriterion("DATACENTER_INSERT_TIME <>", value, "datacenterInsertTime");
            return (Criteria) this;
        }

        public Criteria andDatacenterInsertTimeGreaterThan(Date value) {
            addCriterion("DATACENTER_INSERT_TIME >", value, "datacenterInsertTime");
            return (Criteria) this;
        }

        public Criteria andDatacenterInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DATACENTER_INSERT_TIME >=", value, "datacenterInsertTime");
            return (Criteria) this;
        }

        public Criteria andDatacenterInsertTimeLessThan(Date value) {
            addCriterion("DATACENTER_INSERT_TIME <", value, "datacenterInsertTime");
            return (Criteria) this;
        }

        public Criteria andDatacenterInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("DATACENTER_INSERT_TIME <=", value, "datacenterInsertTime");
            return (Criteria) this;
        }

        public Criteria andDatacenterInsertTimeIn(List<Date> values) {
            addCriterion("DATACENTER_INSERT_TIME in", values, "datacenterInsertTime");
            return (Criteria) this;
        }

        public Criteria andDatacenterInsertTimeNotIn(List<Date> values) {
            addCriterion("DATACENTER_INSERT_TIME not in", values, "datacenterInsertTime");
            return (Criteria) this;
        }

        public Criteria andDatacenterInsertTimeBetween(Date value1, Date value2) {
            addCriterion("DATACENTER_INSERT_TIME between", value1, value2, "datacenterInsertTime");
            return (Criteria) this;
        }

        public Criteria andDatacenterInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("DATACENTER_INSERT_TIME not between", value1, value2, "datacenterInsertTime");
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