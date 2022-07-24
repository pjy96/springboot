package com.example.test.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class TestController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){

        return String.format("hello %s!!", name);
    }

    @GetMapping("/message")
    public String message(Model model){
        model.addAttribute("message", "This is a custom message");
        return "message";
    }
}