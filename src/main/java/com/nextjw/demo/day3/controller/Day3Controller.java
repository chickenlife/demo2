package com.nextjw.demo.day3.controller;

import com.nextjw.demo.day3.domain.model.Person;
import com.nextjw.demo.day3.dto.PersonDto;
import com.nextjw.demo.day3.service.Day3Service;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getPerson/{name}")
    public PersonDto getPerson(@PathVariable String name){
        return day3Service.getPerson(name);
    }

    @PostMapping("/addPerson")
    public PersonDto addPerson(@RequestBody PersonDto persondto){
        return day3Service.addPerson(persondto);
    }

    @PutMapping("/updatePerson/{name}")
    public PersonDto updatePerson(@PathVariable String name, @RequestBody PersonDto persondto){
        return day3Service.updatePerson(name, persondto);
    }

    @DeleteMapping("/deletePerson/{name}")
    public PersonDto deletePerson(@PathVariable String name){
        return day3Service.deletePerson(name);
    }
}
