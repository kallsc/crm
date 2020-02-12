package com.kallsc.crm.service.impl;

import com.kallsc.crm.mapper.CourseOrderMapper;
import com.kallsc.crm.model.CourseOrder;
import com.kallsc.crm.model.PageResult;
import com.kallsc.crm.service.CourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseOrderServiceImpl implements CourseOrderService {

    @Autowired
    CourseOrderMapper courseOrderMapper ;


    @Override
    public PageResult<CourseOrder> findPageResult(CourseOrder condition, int page, int pageSize) {

        PageResult<CourseOrder> result = new PageResult<CourseOrder>();
        Map<String,Object> map = new HashMap();
        //map.put("condition",condition);
        map.put("start",(page-1)*pageSize);
        map.put("pagesize",pageSize);

        Integer count = courseOrderMapper.findCountByMap(map);
        List<CourseOrder> data = courseOrderMapper.findListByMap(map) ;

        result.setCode(0);
        result.setCount(count);
        result.setMsg("success");
        result.setData(data);

        return result;
    }
}
