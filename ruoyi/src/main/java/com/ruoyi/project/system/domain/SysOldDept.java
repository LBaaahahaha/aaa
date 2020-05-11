package com.ruoyi.project.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

import javax.management.Attribute;

/**
 * 历史组织对象 sys_dept
 * 
 * @author aaa
 * @date 2020-05-06
 */
public class SysOldDept extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 部门id */
    private Long deptId;

    /** 父部门id */
    @Excel(name = "父部门id")
    private Long parentId;

    /** 祖级列表 */
    private String ancestors;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 显示顺序 */
    private Integer orderNum;

    /** 负责人 */
    @Excel(name = "负责人")
    private String leader;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;


    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 部门状态（0正常 1停用） */
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 组织属性 */
    @Excel(name = "组织属性")
    private Long attrId;
    private Long oldattrId;


    //    private String attribute;
    private SysAttribute  attr;

//    public String getAttri()
//    {
//        return attribute;
//    }
//    public void setAttri(String attribute)
//    {
//        this.attribute = attribute;
//    }
public Long getOldattrId() {
    return oldattrId;
}

    public void setOldattrId(Long oldattrId) {
        this.oldattrId = oldattrId;
    }

    public SysAttribute getAttribute()
    {
        return attr;
    }

    public void setAttribute(SysAttribute attr)
    {
        this.attr = attr;
    }

    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setAncestors(String ancestors) 
    {
        this.ancestors = ancestors;
    }

    public String getAncestors() 
    {
        return ancestors;
    }
    public void setDeptName(String deptName) 
    {
        this.deptName = deptName;
    }

    public String getDeptName() 
    {
        return deptName;
    }
    public void setOrderNum(Integer orderNum) 
    {
        this.orderNum = orderNum;
    }

    public Integer getOrderNum() 
    {
        return orderNum;
    }
    public void setLeader(String leader) 
    {
        this.leader = leader;
    }

    public String getLeader() 
    {
        return leader;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    public void setattrId(Long attrId)
    {
        this.attrId = attrId;
    }

    public Long getattrId()
    {
        return attrId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("deptId", getDeptId())
            .append("parentId", getParentId())
            .append("ancestors", getAncestors())
            .append("deptName", getDeptName())
            .append("orderNum", getOrderNum())
            .append("leader", getLeader())
            .append("phone", getPhone())
            .append("email", getEmail())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("attr", getAttribute())
            .append("oldattrId",getOldattrId())
            .toString();
    }
}
