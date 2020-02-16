package com.kallsc.crm.mapper;


import com.kallsc.crm.model.CourseOrder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface CourseOrderMapper {
    /**返回记录数*/
    Integer findCountByMap(Map<String,Object> map);

    /** 返回数据列表*/
    List<CourseOrder> findListByMap(Map<String,Object> map);

    /** 添加订单*/
    Integer insert(CourseOrder order);

    CourseOrder findByOrderId(String order_id);

    Integer deleteByOrderId(String order_id);

    Integer update(CourseOrder courseOrder);
}
