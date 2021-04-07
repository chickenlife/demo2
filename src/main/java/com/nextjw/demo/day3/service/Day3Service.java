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
                .orElseThrow(() -> new RuntimeException("Not Found "+name));
        personDto.setName(person.getName());
        return personDto;
    }

    public PersonDto addPerson(PersonDto persondto) {
        Person person = new Person();
        person.setName(persondto.getName());
        gradeDomainService.addPerson(person.getName());
        return persondto;
    }

    public PersonDto updatePerson(String name, PersonDto persondto) {
        Person person = new Person();
        person.setName(persondto.getName());
        gradeDomainService.updatePerson(name, person.getName());
        return persondto;
    }
}
