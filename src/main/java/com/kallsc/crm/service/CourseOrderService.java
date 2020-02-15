package com.kallsc.crm.service;

import com.kallsc.crm.model.CourseOrder;
import com.kallsc.crm.model.PageResult;
import org.springframework.stereotype.Service;

@Service
public interface CourseOrderService {

    /**返回分页数据*/
    PageResult<CourseOrder> findPageResult(CourseOrder condition,int page,int pageSize);

    /**新增订单数据*/
    Integer insert(CourseOrder order);
}
