package com.kallsc.crm.controller;

import com.kallsc.crm.model.CRUDresult;
import com.kallsc.crm.model.CourseOrder;
import com.kallsc.crm.model.PageResult;
import com.kallsc.crm.service.CourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/courseorder")
public class CourseOrderController {

    @Autowired  CourseOrderService courseOrderService;

    @RequestMapping("/list")
    public String list(){
        return "courseorder/list";
    }

    @RequestMapping("/add")
    public String add(){
        return "courseorder/add";
    }

    @ResponseBody
    @RequestMapping("/save")
    public CRUDresult save(CourseOrder courseOrder){

        Integer res = courseOrderService.insert(courseOrder);
        CRUDresult result = new CRUDresult();

        if (res!=-1) {
            result.setType(1);
            result.setMsg("添加成功");
        }else {
            result.setType(-1);
            result.setMsg("添加失败");
        }
        return result;
    }

    @RequestMapping("/listjson")
    @ResponseBody
    //CourseOrder condition,int page,int pagesize
    public PageResult<CourseOrder> listjson(int page,int limit){
        PageResult result = courseOrderService.findPageResult(null,page,limit);
        return result;
    }
}
