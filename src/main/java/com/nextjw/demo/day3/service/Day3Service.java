package com.nextjw.demo.day3.service;

import com.nextjw.demo.day3.domain.GradeDomainService;
import com.nextjw.demo.day3.domain.model.Person;
import com.nextjw.demo.day3.dto.PersonDto;
import org.springframework.stereotype.Service;

@Service
public class Day3Service {

    final GradeDomainService gradeDomainService;

    public Day3Service(GradeDomainService gradeDomainService) {
        this.gradeDomainService = gradeDomainService;
    }

    public String hello(){
        return "hi";
    }

    public PersonDto getPerson(String name) {
        PersonDto personDto = new PersonDto();
        Person person = gradeDomainService.getPerson(name)
                .orElseThrow(() -> new RuntimeException("asdf"));
        personDto.setName(person.getName());
        return personDto;
    }

    public Person addPerson(Person person) {

        return gradeDomainService.addPerson(person.getName());
    }
}
