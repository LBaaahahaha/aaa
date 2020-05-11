package com.ruoyi.project.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.mapper.SysOldDeptMapper;
import com.ruoyi.project.system.domain.SysOldDept;
import com.ruoyi.project.system.service.ISysOldDeptService;

/**
 * 历史组织Service业务层处理
 * 
 * @author aaa
 * @date 2020-05-06
 */
@Service
public class SysOldDeptServiceImpl implements ISysOldDeptService 
{
    @Autowired
    private SysOldDeptMapper sysOldDeptMapper;

    /**
     * 查询历史组织
     * 
     * @param deptId 历史组织ID
     * @return 历史组织
     */
    @Override
    public SysOldDept selectSysOldDeptById(Long deptId)
    {
        return sysOldDeptMapper.selectSysOldDeptById(deptId);
    }

    /**
     * 查询历史组织列表
     * 
     * @param sysOldDept 历史组织
     * @return 历史组织
     */
    @Override
    public List<SysOldDept> selectSysOldDeptList(SysOldDept sysOldDept)
    {
        return sysOldDeptMapper.selectSysOldDeptList(sysOldDept);
    }

    /**
     * 新增历史组织
     * 
     * @param sysOldDept 历史组织
     * @return 结果
     */
    @Override
    public int insertSysOldDept(SysOldDept sysOldDept)
    {
        sysOldDept.setCreateTime(DateUtils.getNowDate());
        return sysOldDeptMapper.insertSysOldDept(sysOldDept);
    }

    /**
     * 修改历史组织
     * 
     * @param sysOldDept 历史组织
     * @return 结果
     */
    @Override
    public int updateSysOldDept(SysOldDept sysOldDept)
    {
        sysOldDept.setUpdateTime(DateUtils.getNowDate());
        return sysOldDeptMapper.updateSysOldDept(sysOldDept);
    }

    /**
     * 批量删除历史组织
     * 
     * @param deptIds 需要删除的历史组织ID
     * @return 结果
     */
    @Override
    public int deleteSysOldDeptByIds(Long[] deptIds)
    {
        return sysOldDeptMapper.deleteSysOldDeptByIds(deptIds);
    }

    /**
     * 删除历史组织信息
     * 
     * @param deptId 历史组织ID
     * @return 结果
     */
    @Override
    public int deleteSysOldDeptById(Long deptId)
    {
        return sysOldDeptMapper.deleteSysOldDeptById(deptId);
    }
}
