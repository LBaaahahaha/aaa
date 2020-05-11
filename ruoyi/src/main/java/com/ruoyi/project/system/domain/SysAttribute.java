package com.ruoyi.project.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 组织属性对象 sys_attribute
 * 
 * @author aaa
 * @date 2020-05-06
 */
public class SysAttribute extends BaseEntity
{
    public SysAttribute(){}
    private static final long serialVersionUID = 1L;

    /** 属性ID */
    @Excel(name = "属性ID")
    private Long attrId;

    /** 组织属性 */
    @Excel(name = "组织属性")
    private String attribute;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public SysAttribute(String delFlag) {
        this.delFlag = delFlag;
    }

    public void setAttrId(Long attrId) 
    {
        this.attrId = attrId;
    }

    public Long getAttrId() 
    {
        return attrId;
    }
    public void setAttribute(String attribute) 
    {
        this.attribute = attribute;
    }
    public String getDelFlag()
    {
        return delFlag;
    }
    public String getAttribute() 
    {
        return attribute;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("attrId", getAttrId())
            .append("attribute", getAttribute())
                .append("delFlag", getDelFlag())
            .toString();
    }


}
