package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DegreeController {
    @RequestMapping("/degree")
    public String getUniversityDegree(){
        return "degree.html";
    }
}
