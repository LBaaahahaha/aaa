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
import com.ruoyi.project.system.domain.SysAttribute;
import com.ruoyi.project.system.service.ISysAttributeService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.domain.SysDept;
import com.ruoyi.project.system.service.ISysDeptService;
/**
 * 组织属性Controller
 * 
 * @author aaa
 * @date 2020-05-06
 */
@RestController
@RequestMapping("/system/attribute")
public class SysAttributeController extends BaseController
{
    @Autowired
    private ISysAttributeService sysAttributeService;
    @Autowired
    private ISysDeptService deptService;

    /**
     * 查询组织属性列表
     */
    @PreAuthorize("@ss.hasPermi('system:attribute:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysAttribute sysAttribute)
    {
        startPage();
        List<SysAttribute> list = sysAttributeService.selectSysAttributeList(sysAttribute);
        return getDataTable(list);
    }

    /**
     * 导出组织属性列表
     */
    @PreAuthorize("@ss.hasPermi('system:attribute:export')")
    @Log(title = "组织属性", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysAttribute sysAttribute)
    {
        List<SysAttribute> list = sysAttributeService.selectSysAttributeList(sysAttribute);
        ExcelUtil<SysAttribute> util = new ExcelUtil<SysAttribute>(SysAttribute.class);
        return util.exportExcel(list, "attribute");
    }

    /**
     * 获取组织属性详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:attribute:query')")
    @GetMapping(value = "/{attrId}")
    public AjaxResult getInfo(@PathVariable("attrId") Long attrId)
    {
        return AjaxResult.success(sysAttributeService.selectSysAttributeById(attrId));
    }

    /**
     * 新增组织属性
     */
    @PreAuthorize("@ss.hasPermi('system:attribute:add')")
    @Log(title = "组织属性", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysAttribute sysAttribute)
    {
        return toAjax(sysAttributeService.insertSysAttribute(sysAttribute));
    }

    /**
     * 修改组织属性
     */
    @PreAuthorize("@ss.hasPermi('system:attribute:edit')")
    @Log(title = "组织属性", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysAttribute sysAttribute)
    {
        return toAjax(sysAttributeService.updateSysAttribute(sysAttribute));
    }

    /**
     * 删除组织属性
     */

    @PreAuthorize("@ss.hasPermi('system:attribute:remove')")
    @Log(title = "组织属性", businessType = BusinessType.DELETE)
	@DeleteMapping("/{attrId}")
    public AjaxResult remove(@PathVariable Long attrId){

//        SysDept deptattrId1 = deptService.selectDeptList(attrId);
//
//        System.out.println(attrId1.getAttrId());
//        if (deptattrId.getAttrId().equals(attrId1.getAttrId())){
//            return AjaxResult.error("修改部门'" + attrId1.getAttribute() + "'失败，删除"+attrId1.getAttribute()+"需要组织中无该属性");
//        }else {

        return toAjax(sysAttributeService.deleteSysAttributeById(attrId));}
//    }
}
