package com.kallsc.crm.service.impl;

import com.kallsc.crm.mapper.CourseOrderMapper;
import com.kallsc.crm.model.CourseOrder;
import com.kallsc.crm.model.MonthIncome;
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
        map.put("condition",condition);
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

    @Override
    public Integer insert(CourseOrder order) {
        Integer res = courseOrderMapper.insert(order);
        return  res;
    }

    @Override
    public CourseOrder findByOrderId(String order_id) {
        CourseOrder order = courseOrderMapper.findByOrderId(order_id);
        return order;
    }

    @Override
    public Integer deleteByOrderId(String order_id) {
        Integer res = courseOrderMapper.deleteByOrderId(order_id);
        return res;
    }

    @Override
    public Integer update(CourseOrder courseOrder) {
        Integer res = courseOrderMapper.update(courseOrder);
        return res;
    }

    @Override
    public List<MonthIncome> getMonthIncome() {
        return courseOrderMapper.getMonthIncome();
    }
}
