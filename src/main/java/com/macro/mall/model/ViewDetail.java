package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ViewDetail implements Serializable {
    private String code;

    private String msg;

    private String channelId;

    private String webinarId;

    private String uid;

    private String joinTime;

    private String leaveTime;

    private String duration;

    private String ip;

    private String platform;

    private String area;

    private String createdAt;

    private String webinarStartTime;

    private String inviteUid;

    private String inviteNickname;

    private String nickname;

    private String phone;

    private String originUniqueId;

    private String total;

    private String apiType;

    private Date datacenterInsertTime;

    private static final long serialVersionUID = 1L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getWebinarId() {
        return webinarId;
    }

    public void setWebinarId(String webinarId) {
        this.webinarId = webinarId == null ? null : webinarId.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime == null ? null : joinTime.trim();
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime == null ? null : leaveTime.trim();
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt == null ? null : createdAt.trim();
    }

    public String getWebinarStartTime() {
        return webinarStartTime;
    }

    public void setWebinarStartTime(String webinarStartTime) {
        this.webinarStartTime = webinarStartTime == null ? null : webinarStartTime.trim();
    }

    public String getInviteUid() {
        return inviteUid;
    }

    public void setInviteUid(String inviteUid) {
        this.inviteUid = inviteUid == null ? null : inviteUid.trim();
    }

    public String getInviteNickname() {
        return inviteNickname;
    }

    public void setInviteNickname(String inviteNickname) {
        this.inviteNickname = inviteNickname == null ? null : inviteNickname.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getOriginUniqueId() {
        return originUniqueId;
    }

    public void setOriginUniqueId(String originUniqueId) {
        this.originUniqueId = originUniqueId == null ? null : originUniqueId.trim();
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total == null ? null : total.trim();
    }

    public String getApiType() {
        return apiType;
    }

    public void setApiType(String apiType) {
        this.apiType = apiType == null ? null : apiType.trim();
    }

    public Date getDatacenterInsertTime() {
        return datacenterInsertTime;
    }

    public void setDatacenterInsertTime(Date datacenterInsertTime) {
        this.datacenterInsertTime = datacenterInsertTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", msg=").append(msg);
        sb.append(", channelId=").append(channelId);
        sb.append(", webinarId=").append(webinarId);
        sb.append(", uid=").append(uid);
        sb.append(", joinTime=").append(joinTime);
        sb.append(", leaveTime=").append(leaveTime);
        sb.append(", duration=").append(duration);
        sb.append(", ip=").append(ip);
        sb.append(", platform=").append(platform);
        sb.append(", area=").append(area);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", webinarStartTime=").append(webinarStartTime);
        sb.append(", inviteUid=").append(inviteUid);
        sb.append(", inviteNickname=").append(inviteNickname);
        sb.append(", nickname=").append(nickname);
        sb.append(", phone=").append(phone);
        sb.append(", originUniqueId=").append(originUniqueId);
        sb.append(", total=").append(total);
        sb.append(", apiType=").append(apiType);
        sb.append(", datacenterInsertTime=").append(datacenterInsertTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}