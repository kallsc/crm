package com.kallsc.crm.mapper;


import com.kallsc.crm.model.CourseOrder;
import java.util.List;
import java.util.Map;

public interface CourseOrderMapper {
    /**返回记录数*/
    Integer findCountByMap(Map<String,Object> map);

    /** 返回数据列表*/
    List<CourseOrder> findListByMap(Map<String,Object> map);
}
