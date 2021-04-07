package com.nextjw.demo.day3.controller;

import com.nextjw.demo.day3.service.Day3Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day3Controller {

    final Day3Service day3Service;

    public Day3Controller(com.nextjw.demo.day3.service.Day3Service day3Service) {
        this.day3Service = day3Service;
    }

    @GetMapping("/hello")
    public String hello(){
        return day3Service.hello();
    }


}
