package com.kallsc.crm.common.service;

import com.kallsc.crm.common.domain.CourseOrder;
import com.kallsc.crm.common.domain.MonthIncome;
import com.kallsc.crm.common.domain.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseOrderService {

    /**返回分页数据*/
    PageResult<CourseOrder> findPageResult(CourseOrder condition,int page,int pageSize);

    /**新增订单数据*/
    Integer insert(CourseOrder order);

    /**order_id查询**/
    CourseOrder findByOrderId(String order_id);

    Integer deleteByOrderId(String order_id);

    Integer update(CourseOrder courseOrder);

    List<MonthIncome> getMonthIncome();
}
