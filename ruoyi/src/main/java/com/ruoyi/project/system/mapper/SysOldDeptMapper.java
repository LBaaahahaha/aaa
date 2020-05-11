package com.ruoyi.project.system.mapper;

import java.util.List;
import com.ruoyi.project.system.domain.SysOldDept;

/**
 * 历史组织Mapper接口
 * 
 * @author aaa
 * @date 2020-05-06
 */
public interface SysOldDeptMapper 
{
    /**
     * 查询历史组织
     * 
     * @param deptId 历史组织ID
     * @return 历史组织
     */
    public SysOldDept selectSysOldDeptById(Long deptId);

    /**
     * 查询历史组织列表
     * 
     * @param sysOldDept 历史组织
     * @return 历史组织集合
     */
    public List<SysOldDept> selectSysOldDeptList(SysOldDept sysOldDept);

    /**
     * 新增历史组织
     *
     * @param sysOldDept 历史组织
     * @return 结果
     */
    public int insertSysOldDept(SysOldDept sysOldDept);

    /**
     * 修改历史组织
     *
     * @param sysOldDept 历史组织
     * @return 结果
     */
    public int updateSysOldDept(SysOldDept sysOldDept);

    /**
     * 删除历史组织
     *
     * @param deptId 历史组织ID
     * @return 结果
     */
    public int deleteSysOldDeptById(Long deptId);

    /**
     * 批量删除历史组织
     *
     * @param deptIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysOldDeptByIds(Long[] deptIds);
}
