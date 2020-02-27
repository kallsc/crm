package com.kallsc.crm.system.service;

import com.kallsc.crm.common.domain.PageResult;
import com.kallsc.crm.system.domain.SysRole;
import com.kallsc.crm.system.domain.SysUser;
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
public interface SysRoleService {
    /**
     * 添加角色
     * @param role
     * @return
     */
    Integer insertRole(SysRole role);

    /**
     * 获取角色列表
     * @param condition  查询条件
     * @param page       页码
     * @param pagesize   大小
     * @return
     */
    PageResult<SysRole> findPageResult(SysRole condition, int page, int pagesize);

    /**
     * id查询角色
     * @param role_id
     * @return
     */
    SysRole findByRoleId(Integer role_id);

    /**
     * id删除角色
     * @param role_id
     * @return
     */
    Integer delete(Integer role_id);

    Integer update(SysRole role);
}
