package com.kallsc.crm.common.service.impl;

import com.kallsc.crm.common.domain.SysUser;
import com.kallsc.crm.common.mapper.SysUserMapper;
import com.kallsc.crm.common.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**   
  * 
  * 类名称:   SystemServiceImpl  
  * 类描述:   SystemService实现类
  * 创建人:   ks  
  * 创建时间:  2020/2/10
  * 修改人:   ks   
  * 修改时间:  2020/2/20 
  * 修改备注: 
  * 版本:    [v1.0]   
  *    
  */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public Integer insertUser(SysUser user) {
        Integer res = sysUserMapper.insertUser(user);
        return res;
    }
}
