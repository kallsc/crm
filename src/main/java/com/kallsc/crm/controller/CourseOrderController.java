package com.kallsc.crm.controller;

import com.kallsc.crm.model.CourseOrder;
import com.kallsc.crm.model.PageResult;
import com.kallsc.crm.service.CourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/courseorder")
public class CourseOrderController {

    @Autowired  CourseOrderService courseOrderService;

    @RequestMapping("/list")
    public String list(){
        return "courseorder/list";
    }


    @RequestMapping("/listjson")
    @ResponseBody
    //CourseOrder condition,int page,int pagesize
    public PageResult<CourseOrder> listjson(){
        PageResult result = courseOrderService.findPageResult(null,1,1);
        return result;
    }
}
