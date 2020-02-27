package com.kallsc.crm.system.mapper;


import com.kallsc.crm.system.domain.SysRole;
import com.kallsc.crm.system.domain.SysUser;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface SysRoleMapper {
    /**
     * 添加角色
     * @param role
     * @return
     */
    Integer insertRole(SysRole role);

    /**
     * 获取角色总记录数
     * @param map
     * @return
     */
    Integer findCountByMap(Map<String, Object> map);

    /**
     * 获取角色列表
     * @param map
     * @return
     */
    List<SysRole> findListByMap(Map<String, Object> map);

    SysRole findByRoleId(Integer role_id);

    Integer delete(Integer role_id);

    Integer update(SysRole role);
}
