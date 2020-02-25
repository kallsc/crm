package com.kallsc.crm.system.service.impl;

import com.kallsc.crm.common.domain.PageResult;
import com.kallsc.crm.system.domain.SysUser;
import com.kallsc.crm.system.mapper.SysUserMapper;
import com.kallsc.crm.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public PageResult<SysUser> findPageResult(SysUser condition, int page, int pageSize) {

        PageResult<SysUser> result = new PageResult();
        Map<String,Object> map = new HashMap();
        map.put("condition",condition);
        map.put("start",(page-1)*pageSize);
        map.put("pagesize",pageSize);

        Integer count = sysUserMapper.findCountByMap(map);
        List<SysUser> data = sysUserMapper.findListByMap(map) ;

        result.setCode(0);
        result.setCount(count);
        result.setMsg("success");
        result.setData(data);

        return result;
    }

    @Override
    public SysUser findByUserId(String user_id) {
        SysUser user = sysUserMapper.findByUserId(user_id);
        return user;
    }

    @Override
    public Integer delete(String user_id) {
        Integer res = sysUserMapper.delete(user_id);
        return res;
    }
}
