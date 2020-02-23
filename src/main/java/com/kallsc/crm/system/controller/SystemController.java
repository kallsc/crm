package com.kallsc.crm.system.controller;

import com.kallsc.crm.common.domain.SysUser;
import com.kallsc.crm.common.domain.CRUDresult;
import com.kallsc.crm.common.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
public class SystemController {

    @Autowired
    SysUserService sysUserService;

    @RequestMapping("/user")
    public ModelAndView user(ModelAndView model){
        model.setViewName("system/user");
        return model;
    }

    @RequestMapping("/register")
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


}
