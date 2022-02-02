package com.nagarro.devopstools.devops.ciplugintestapp;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        System.err.println("Welcome Page!");
        model.put("message", "value");
        return "home";
    }
}
