package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {
  //  @RequestMapping("/register") //localhost:8080/register
    @GetMapping("/register")
    public String register(Model model){

        List<String> batchList = Arrays.asList("JD1","JD2","JD3");
        model.addAttribute("batchList",batchList);
        model.addAttribute("mentor", new Mentor());
        return "mentor/mentor-register";
    }
//    @RequestMapping("/drop") //localhost:8080/register
//    public String drop(){
//
//        return "student/register";
//    }
    @PostMapping("/confirm")
    public String submitForm(@ModelAttribute("mentor")Mentor mentor){
        // i access to "mentor" attribute in this method with @ModelAttribute
        return  "mentor/mentor-confirmation";
    }

//    @GetMapping("/confirm")
//    public String submitForm2(){
//        return  "mentor/mentor-confirmation";
//    }
}
