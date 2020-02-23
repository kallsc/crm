package com.kallsc.crm.common.service;

import com.kallsc.crm.common.domain.SysUser;
import org.springframework.stereotype.Service;

/**   
  * 
  * 类名称:   SystemService  
  * 类描述:   SystemService接口
  * 创建人:   ks  
  * 创建时间:  2020/2/10
  * 修改人:   ks   
  * 修改时间:  2020/2/20 
  * 修改备注: 
  * 版本:    [v1.0]   
  *    
  */

@Service
public interface SysUserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    Integer insertUser(SysUser user);
}
