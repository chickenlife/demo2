package com.nextjw.demo.domain.repository;

import com.nextjw.demo.domain.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByName(String name);
}
