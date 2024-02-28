package com.kit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/data")
public class DataController {

    @PostMapping
    @ResponseBody
    public String acceptData(
            @RequestParam String name,
            @RequestParam double sub1,
            @RequestParam double sub2,
            @RequestParam double sub3,
            @RequestParam double sub4,
            @RequestParam double sub5) {

        double average = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

        return  "<h2>Hello " + name + "!</h2>"
                + "<p>Your average percentage is: " + average + "</p>"
                + "</body></html>";
    }
}
