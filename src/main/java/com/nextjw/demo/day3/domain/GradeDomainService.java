package com.nextjw.demo.day3.domain;

import com.nextjw.demo.day3.domain.model.Person;
import com.nextjw.demo.day3.domain.repository.GradeRepository;
import com.nextjw.demo.day3.domain.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Slf4j
@RequiredArgsConstructor
public class GradeDomainService {
    private final PersonRepository personRepository;
    private final GradeRepository gradeRepository;

    //find person by name
    @Transactional(readOnly = true)
    public Optional<Person> getPerson(String name) {
        log.debug("getPerson : input value : {}",name);
        return personRepository.findByName(name);
    }

    //person save
    @Transactional
    public Person addPerson(String name) {
        log.debug("addPerson : {}",name);
        Person person = new Person();
        person.setName(name);
        return personRepository.save(person);
    }

    //person update
    public Person updatePerson(String name, String updateName) {
        log.debug("updatePerson : {}", name);
        Optional<Person> person = personRepository.findByName(name);
        person.get().setName(updateName);
        personRepository.save(person.get());
        return person.get();
    }

    //grade save with person
}
