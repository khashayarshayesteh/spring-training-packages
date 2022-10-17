package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CanonController {

    @RequestMapping("/canon")
    public String getMyEmployer(){
        return "canon.html";
    }


}
