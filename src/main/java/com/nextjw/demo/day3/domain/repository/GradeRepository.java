package com.nextjw.demo.day3.domain.repository;

import com.nextjw.demo.day3.domain.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
}
