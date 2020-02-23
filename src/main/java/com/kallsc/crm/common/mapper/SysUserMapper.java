package com.kallsc.crm.common.mapper;


import com.kallsc.crm.common.domain.SysUser;
import org.springframework.stereotype.Component;

@Component
public interface SysUserMapper {
    /**
     * 添加用户
     * @param user
     * @return
     */
    Integer insertUser(SysUser user);
}
