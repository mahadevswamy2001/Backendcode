package com.kit.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Student {
    @GetMapping("/demo")
    public String demo() {
        return "NewFile.html";
    }
}
