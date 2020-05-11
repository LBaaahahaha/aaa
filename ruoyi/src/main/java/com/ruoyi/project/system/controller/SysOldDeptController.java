package com.ruoyi.project.system.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.domain.SysOldDept;
import com.ruoyi.project.system.service.ISysOldDeptService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 历史组织Controller
 * 
 * @author aaa
 * @date 2020-05-06
 */
@RestController
@RequestMapping("/system/olddept")
public class SysOldDeptController extends BaseController
{
    @Autowired
    private ISysOldDeptService sysOldDeptService;

    /**
     * 查询历史组织列表
     */
    @PreAuthorize("@ss.hasPermi('system:olddept:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysOldDept sysOldDept)
    {
        startPage();
        List<SysOldDept> list = sysOldDeptService.selectSysOldDeptList(sysOldDept);
        return getDataTable(list);
    }

    /**
     * 导出历史组织列表
     */
    @PreAuthorize("@ss.hasPermi('system:olddept:export')")
    @Log(title = "历史组织", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysOldDept sysOldDept)
    {
        List<SysOldDept> list = sysOldDeptService.selectSysOldDeptList(sysOldDept);
        ExcelUtil<SysOldDept> util = new ExcelUtil<SysOldDept>(SysOldDept.class);
        return util.exportExcel(list, "olddept");
    }

    /**
     * 获取历史组织详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:olddept:query')")
    @GetMapping(value = "/{deptId}")
    public AjaxResult getInfo(@PathVariable("deptId") Long deptId)
    {
        return AjaxResult.success(sysOldDeptService.selectSysOldDeptById(deptId));
    }

    /**
     * 新增历史组织
     */
    @PreAuthorize("@ss.hasPermi('system:olddept:add')")
    @Log(title = "历史组织", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysOldDept sysOldDept)
    {
        return toAjax(sysOldDeptService.insertSysOldDept(sysOldDept));
    }

    /**
     * 修改历史组织
     */
    @PreAuthorize("@ss.hasPermi('system:olddept:edit')")
    @Log(title = "历史组织", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysOldDept sysOldDept)
    {
        return toAjax(sysOldDeptService.updateSysOldDept(sysOldDept));
    }

    /**
     * 删除历史组织
     */
    @PreAuthorize("@ss.hasPermi('system:olddept:remove')")
    @Log(title = "历史组织", businessType = BusinessType.DELETE)
	@DeleteMapping("/{deptIds}")
    public AjaxResult remove(@PathVariable Long[] deptIds)
    {
        return toAjax(sysOldDeptService.deleteSysOldDeptByIds(deptIds));
    }
}
