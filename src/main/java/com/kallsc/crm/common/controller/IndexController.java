package com.kallsc.crm.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "common/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "common/welcome";
    }
}
