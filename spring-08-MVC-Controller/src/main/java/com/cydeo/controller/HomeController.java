package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home") // this is end point, end point is what ever you are looking in the application
    private String home(){  //which end point? www.amazon.com
        return "home.html";
    }
    @RequestMapping //nothing and / is default
    private String home2(){  //which end point? www.amazon.com
        return "home.html";
    }
    @RequestMapping({"/apple","/orange"}) // this is end point, end point is what ever you are looking in the application
    private String home3(){  //which end point? www.amazon.com
        return "home.html";
    }
}
