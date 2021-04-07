package com.nextjw.demo.domain;

import com.nextjw.demo.domain.model.Person;
import com.nextjw.demo.domain.repository.GradeRepository;
import com.nextjw.demo.domain.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Slf4j
@RequiredArgsConstructor
public class GradeService {
    private final PersonRepository personRepository;
    private final GradeRepository gradeRepository;

    //find person by name
    @Transactional(readOnly = true)
    public Optional<Person> getPerson(String name) {
        return personRepository.findByName(name);
    }

    //person save
    @Transactional
    public Person addPerson(String name) {
        Person person = new Person();
        person.setName(name);
        return personRepository.save(person);
    }

    //grade save with person
}
