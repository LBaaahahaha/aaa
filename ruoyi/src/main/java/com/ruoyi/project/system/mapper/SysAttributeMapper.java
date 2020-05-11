package com.ruoyi.project.system.mapper;

import java.util.List;
import com.ruoyi.project.system.domain.SysAttribute;
import com.ruoyi.project.system.domain.SysRole;

/**
 * 组织属性Mapper接口
 * 
 * @author aaa
 * @date 2020-05-06
 */
public interface SysAttributeMapper 
{
    /**
     * 查询组织属性
     * 
     * @param attrId 组织属性ID
     * @return 组织属性
     */
    public SysAttribute selectSysAttributeById(Long attrId);

    /**
     * 查询组织属性列表
     * 
     * @param sysAttribute 组织属性
     * @return 组织属性集合
     */
    public List<SysAttribute> selectSysAttributeList(SysAttribute sysAttribute);
    /**
     * 根据用户ID查询角色
     *
     * @param userName 用户名
     * @return 角色列表
     */
    public List<SysAttribute> selectAttributeByDeptName(String deptName);


    /**
     * 新增组织属性
     * 
     * @param sysAttribute 组织属性
     * @return 结果
     */
    public int insertSysAttribute(SysAttribute sysAttribute);

    /**
     * 修改组织属性
     * 
     * @param sysAttribute 组织属性
     * @return 结果
     */
    public int updateSysAttribute(SysAttribute sysAttribute);

    /**
     * 删除组织属性
     * 
     * @param attrId 组织属性ID
     * @return 结果
     */
    public int deleteSysAttributeById(Long attrId);

    /**
     * 批量删除组织属性
     * 
     * @param attrIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysAttributeByIds(Long[] attrIds);
}
