package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Student;

public interface TestReposit extends JpaRepository<Student, Long>{

}
