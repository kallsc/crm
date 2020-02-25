package com.kallsc.crm.system.controller;

import com.kallsc.crm.common.domain.PageResult;
import com.kallsc.crm.system.domain.SysUser;
import com.kallsc.crm.common.domain.CRUDresult;
import com.kallsc.crm.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    /**
     * 用户管理页面
     * @param model
     * @return
     */
    @RequestMapping("/user")
    public ModelAndView userPage(ModelAndView model){
        model.setViewName("system/user");
        return model;
    }

    /**
     * 用户添加页面
     * @param model
     * @return
     */
    @RequestMapping("/user_add")
    public ModelAndView addPage(ModelAndView model){
        model.setViewName("system/user_add");
        return model;
    }

    /**
     * 返回用户列表json
     * @param condition
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/userlist")
    @ResponseBody
    public PageResult<SysUser> list(SysUser condition, int page, int limit){
        PageResult<SysUser> result = sysUserService.findPageResult(condition,page,limit);
        return result;
    }

    /**
     * 注册用户
     * @param user
     * @return
     */
    @RequestMapping("/register")
    @ResponseBody
    public CRUDresult register(SysUser user){
        CRUDresult result = new CRUDresult();
            Integer res = sysUserService.insertUser(user);
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
     * 用户详情页面
     * @param model
     * @return
     */
    @RequestMapping("/user_detail")
    public ModelAndView detailPage(ModelAndView model,String user_id){
        SysUser user = sysUserService.findByUserId(user_id);
        model.addObject("user",user);
        model.setViewName("system/user_detail");
        return model;
    }

    /**
     * 用户编辑页面
     * @param model
     * @return
     */
    @RequestMapping("/user_edit")
    public ModelAndView editPage(ModelAndView model,String user_id){
        SysUser user = sysUserService.findByUserId(user_id);
        model.addObject("user",user);
        model.setViewName("system/user_edit");
        return model;
    }

    @RequestMapping("/user_del")
    @ResponseBody
    public CRUDresult delete(String user_id){
        CRUDresult result = new CRUDresult();
        Integer res = sysUserService.delete(user_id);
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
