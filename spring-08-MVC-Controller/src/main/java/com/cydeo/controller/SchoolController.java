package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SchoolController {

    @RequestMapping("/mit")
    public String school(){
        return "student/school.html"; // we add student/ because school.html is under the student Directory.
                                      // end point is still school
    }
}
