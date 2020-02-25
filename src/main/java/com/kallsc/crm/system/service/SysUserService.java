package com.kallsc.crm.system.service;

import com.kallsc.crm.common.domain.PageResult;
import com.kallsc.crm.system.domain.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 获取用户列表
     * @param condition  查询条件
     * @param page       页码
     * @param pagesize   大小
     * @return
     */
    PageResult<SysUser> findPageResult(SysUser condition, int page, int pagesize);

    /**
     * id查询用户
     * @param user_id
     * @return
     */
    SysUser findByUserId(String user_id);

    /**
     * id删除用户
     * @param user_id
     * @return
     */
    Integer delete(String user_id);
}
