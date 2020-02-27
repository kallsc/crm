package com.kallsc.crm.system.service.impl;

import com.kallsc.crm.common.domain.PageResult;
import com.kallsc.crm.system.domain.SysRole;
import com.kallsc.crm.system.mapper.SysRoleMapper;
import com.kallsc.crm.system.service.SysRoleService;
import com.kallsc.crm.tool.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**   
  * 
  * 创建人:   ks  
  * 创建时间:  2020/2/10
  * 修改人:   ks   
  * 修改时间:  2020/2/20 
  * 修改备注: SysRoleServiceImpl
  * 版本:    [v1.0]   
  *    
  */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    SysRoleMapper sysRoleMapper;

    @Override
    public Integer insertRole(SysRole role) {
        Integer res = sysRoleMapper.insertRole(role);
        return res;
    }

    @Override
    public PageResult<SysRole> findPageResult(SysRole condition, int page, int pageSize) {

        PageResult<SysRole> result = new PageResult();
        Map<String,Object> map = new HashMap();
        map.put("condition",condition);
        map.put("start",(page-1)*pageSize);
        map.put("pagesize",pageSize);

        Integer count = sysRoleMapper.findCountByMap(map);
        List<SysRole> data = sysRoleMapper.findListByMap(map) ;

        result.setCode(0);
        result.setCount(count);
        result.setMsg("success");
        result.setData(data);

        return result;
    }

    @Override
    public SysRole findByRoleId(Integer role_id) {
        SysRole role = sysRoleMapper.findByRoleId(role_id);
        return role;
    }

    @Override
    public Integer delete(Integer role_id) {
        Integer res = sysRoleMapper.delete(role_id);
        return res;
    }

    @Override
    public Integer update(SysRole role) {
        return sysRoleMapper.update(role);
    }
}
