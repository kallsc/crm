package com.kallsc.crm.common.controller;
import com.kallsc.crm.common.domain.MonthIncome;
import com.kallsc.crm.common.service.CourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/dataanalysis")
public class DataanalysisController {
    @Autowired CourseOrderService courseOrderService;

    @RequestMapping("/income")
    public ModelAndView income(ModelAndView model){
        List<MonthIncome> data = courseOrderService.getMonthIncome();
        model.addObject("incomelist",data);
        model.setViewName("/dataanalysis/income");
        return model;
    }



}
