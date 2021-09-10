package com.dadiyw.be01;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ReportSeoEqid implements Serializable {
    private Date DATA_DATE;

    private String URL_HOST;

    private String EQID;

    private Integer PV;

    private Integer UV;

    private static final long serialVersionUID = 1L;

    public Date getDATA_DATE() {
        return DATA_DATE;
    }

    public void setDATA_DATE(Date DATA_DATE) {
        this.DATA_DATE = DATA_DATE;
    }

    public String getURL_HOST() {
        return URL_HOST;
    }

    public void setURL_HOST(String URL_HOST) {
        this.URL_HOST = URL_HOST == null ? null : URL_HOST.trim();
    }

    public String getEQID() {
        return EQID;
    }

    public void setEQID(String EQID) {
        this.EQID = EQID == null ? null : EQID.trim();
    }

    public Integer getPV() {
        return PV;
    }

    public void setPV(Integer PV) {
        this.PV = PV;
    }

    public Integer getUV() {
        return UV;
    }

    public void setUV(Integer UV) {
        this.UV = UV;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", DATA_DATE=").append(DATA_DATE);
        sb.append(", URL_HOST=").append(URL_HOST);
        sb.append(", EQID=").append(EQID);
        sb.append(", PV=").append(PV);
        sb.append(", UV=").append(UV);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}