package com.ruoyi.project.system.service.impl;

import java.util.List;

import com.ruoyi.project.system.domain.SysDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.mapper.SysAttributeMapper;
import com.ruoyi.project.system.domain.SysAttribute;
import com.ruoyi.project.system.service.ISysAttributeService;

/**
 * 组织属性Service业务层处理
 * 
 * @author aaa
 * @date 2020-05-06
 */
@Service
public class SysAttributeServiceImpl implements ISysAttributeService 
{
    @Autowired
    private SysAttributeMapper sysAttributeMapper;

    /**
     * 查询组织属性
     * 
     * @param attrId 组织属性ID
     * @return 组织属性
     */
    @Override
    public SysAttribute selectSysAttributeById(Long attrId)
    {
        return sysAttributeMapper.selectSysAttributeById(attrId);
    }

    /**
     * 查询组织属性列表
     * 
     * @param sysAttribute 组织属性
     * @return 组织属性
     */
    @Override
    public List<SysAttribute> selectSysAttributeList(SysAttribute sysAttribute)
    {
        return sysAttributeMapper.selectSysAttributeList(sysAttribute);
    }

    /**
     * 新增组织属性
     * 
     * @param sysAttribute 组织属性
     * @return 结果
     */
    @Override
    public int insertSysAttribute(SysAttribute sysAttribute)
    {
        return sysAttributeMapper.insertSysAttribute(sysAttribute);
    }

    /**
     * 修改组织属性
     * 
     * @param sysAttribute 组织属性
     * @return 结果
     */
    @Override
    public int updateSysAttribute(SysAttribute sysAttribute)
    {
        return sysAttributeMapper.updateSysAttribute(sysAttribute);
    }

    /**
     * 批量删除组织属性
     * 
     * @param attrIds 需要删除的组织属性ID
     * @return 结果
     */
    @Override
    public int deleteSysAttributeByIds(Long[] attrIds)
    {
        return sysAttributeMapper.deleteSysAttributeByIds(attrIds);
    }

    /**
     * 删除组织属性信息
     * 
     * @param attrId 组织属性ID
     * @return 结果
     */
    @Override
    public int deleteSysAttributeById(Long attrId) {

            return sysAttributeMapper.deleteSysAttributeById(attrId);

    }
}
