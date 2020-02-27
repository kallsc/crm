package com.kallsc.crm.system.controller;

import com.kallsc.crm.common.domain.CRUDresult;
import com.kallsc.crm.common.domain.PageResult;
import com.kallsc.crm.system.domain.SysRole;
import com.kallsc.crm.system.domain.SysUser;
import com.kallsc.crm.system.service.SysRoleService;
import com.kallsc.crm.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**   
 * 
  * 项目名称:  CRM
 * 包:     controller
 * 类名称:   SystemController  
 * 类描述:   系统相关功能
 * 创建人:   ks  
 * 创建时间:  2020/2/10
 * 修改人:   ks   
 * 修改时间:  2020/2/20 
 * 修改备注:  添加系统功能及注释 
 * 版本:    [v1.0]   
 *    
 */
@Controller
@RequestMapping("/sys")
public class SysRoleController {

    @Autowired
    SysRoleService sysRoleService;

    /**
     * 角色管理页面
     * @param model
     * @return
     */
    @RequestMapping("/role")
    public ModelAndView rolePage(ModelAndView model){
        model.setViewName("system/role");
        return model;
    }


    /**
     * 返回角色列表json
     * @param condition
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/role_list")
    @ResponseBody
    public PageResult<SysRole> role_list(SysRole condition, int page, int limit){
        PageResult<SysRole> result = sysRoleService.findPageResult(condition,page,limit);
        return result;
    }

    @RequestMapping("/role_add_page")
    public ModelAndView addPage(ModelAndView model){
        model.setViewName("system/role_add");
        return model;
    }

    /**
     * 添加角色
     * @param role
     * @return
     */
    @RequestMapping("/role_add")
    @ResponseBody
    public CRUDresult role_add(SysRole role){
        CRUDresult result = new CRUDresult();
        Integer res = sysRoleService.insertRole(role);
        if (res!=-1) {
            result.setType(1);
            result.setMsg("添加成功");
        }else {
            result.setType(-1);
            result.setMsg("添加失败");
        }
        return result;
    }

    /**
     * 编辑页面
     * @param model
     * @param role_id
     * @return
     */
    @RequestMapping("/role_edit")
    public ModelAndView editPage(ModelAndView model,Integer role_id){
        SysRole role = sysRoleService.findByRoleId(role_id);
        model.addObject("role",role);
        model.setViewName("system/role_edit");
        return model;
    }

    /**
     * 更新角色数据
     * @param role
     * @return
     */
    @RequestMapping("/role_update")
    @ResponseBody
    public CRUDresult update(SysRole role){
        CRUDresult result = new CRUDresult();
        Integer res = sysRoleService.update(role);
        if (res!=-1) {
            result.setType(1);
            result.setMsg("更新成功");
        }else {
            result.setType(-1);
            result.setMsg("更新失败");
        }
        return result;
    }

    /**
     * 删除角色
     * @param role_id
     * @return
     */
    @RequestMapping("/role_del")
    @ResponseBody
    public CRUDresult delete(Integer role_id){
        CRUDresult result = new CRUDresult();
        Integer res = sysRoleService.delete(role_id);
        if (res!=-1) {
            result.setType(1);
            result.setMsg("删除成功");
        }else {
            result.setType(-1);
            result.setMsg("删除失败");
        }
        return result;
    }
}
