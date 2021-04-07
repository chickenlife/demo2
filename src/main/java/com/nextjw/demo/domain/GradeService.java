package com.nextjw.demo.domain;

import com.nextjw.demo.domain.repository.GradeRepository;
import com.nextjw.demo.domain.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class GradeService {
    private final PersonRepository personRepository;
    private final GradeRepository gradeRepository;

    //find person by name

    //person save

    //grade save with person
}
