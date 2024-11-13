package cn.ce.cesupport.sma.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * Database Table Remarks:
 *   数据库此表没有注释
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table employee_intent_clue_white_list
 */


@ApiModel(value="数据库此表没有注释")
@Accessors(chain = true)
@Data
@ToString
public class EmployeeIntentClueWhiteList implements Serializable {
    private Integer id;

    private String empId;

    @ApiModelProperty(value = "组织类型: 0未知 1中企 2跨境")
    private Byte orgType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public Byte getOrgType() {
        return orgType;
    }

    public void setOrgType(Byte orgType) {
        this.orgType = orgType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", empId=").append(empId);
        sb.append(", orgType=").append(orgType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}