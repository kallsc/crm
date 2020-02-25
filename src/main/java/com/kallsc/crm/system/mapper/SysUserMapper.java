package com.kallsc.crm.system.mapper;


import com.kallsc.crm.system.domain.SysUser;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface SysUserMapper {
    /**
     * 添加用户
     * @param user
     * @return
     */
    Integer insertUser(SysUser user);

    /**
     * 获取用户总记录数
     * @param map
     * @return
     */
    Integer findCountByMap(Map<String, Object> map);

    /**
     * 获取用户列表
     * @param map
     * @return
     */
    List<SysUser> findListByMap(Map<String, Object> map);

    SysUser findByUserId(String user_id);

    Integer delete(String user_id);
}
