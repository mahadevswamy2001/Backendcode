package com.kit.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    @PostMapping
    public String acceptData(
            @RequestParam String name,
            @RequestParam double sub1,
            @RequestParam double sub2,
            @RequestParam double sub3,
            @RequestParam double sub4,
            @RequestParam double sub5) {

        double averagePercentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

        return "Hello " + name + ", your average percentage is " + averagePercentage + "%";
    }
}



//Notw :@RequestParam used to connect with HTMl page n name Should be same what we mention in the the HTMl