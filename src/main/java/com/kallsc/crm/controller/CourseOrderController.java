package com.kallsc.crm.controller;

import com.kallsc.crm.model.CRUDresult;
import com.kallsc.crm.model.CourseOrder;
import com.kallsc.crm.model.PageResult;
import com.kallsc.crm.service.CourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/courseorder")
public class CourseOrderController {

    @Autowired  CourseOrderService courseOrderService;

    @RequestMapping("/list")
    public ModelAndView list(ModelAndView model){
        model.setViewName("courseorder/list");
        return model;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView model){
        model.setViewName("courseorder/add");
        return model;
    }

    @RequestMapping("/edit")
    public ModelAndView edit(ModelAndView model,String order_id){
        CourseOrder order = courseOrderService.findByOrderId(order_id);
        model.setViewName("courseorder/edit");
        model.addObject("order",order);
        return model;
    }

    @ResponseBody
    @RequestMapping("/save")
    public CRUDresult save(CourseOrder courseOrder){

        CourseOrder order = courseOrderService.findByOrderId(courseOrder.getOrder_id());
        CRUDresult result = new CRUDresult();
        if (order==null) {
            //add
            Integer res = courseOrderService.insert(courseOrder);
            if (res!=-1) {
                result.setType(1);
                result.setMsg("添加成功");
            }else {
                result.setType(-1);
                result.setMsg("添加失败");
            }
        }else{
            //edit
            Integer res = courseOrderService.update(courseOrder);
            if (res!=-1) {
                result.setType(1);
                result.setMsg("更新成功");
            }else {
                result.setType(-1);
                result.setMsg("更新失败");
            }
        }

        return result;
    }

    @ResponseBody
    @RequestMapping("/detail")
    public ModelAndView detail(ModelAndView model,String order_id){

        CourseOrder order = courseOrderService.findByOrderId(order_id);
        model.setViewName("courseorder/detail");
        model.addObject("order",order);
        return model;
    }

    @ResponseBody
    @RequestMapping("/delete")
    public CRUDresult delete(ModelAndView model,String order_id){

        Integer res = courseOrderService.deleteByOrderId(order_id);
        CRUDresult result = new CRUDresult();
        if (res!=-1) {
            result.setType(1);
            result.setMsg("删除成功");
        }else {
            result.setType(-1);
            result.setMsg("删除失败");
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
