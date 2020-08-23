package com.test.service;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.test.entity.Student;
import com.test.repository.TestReposit;
import com.test.repository.TestRepository;

@Service
public class TestService {

	@Autowired
	private TestReposit testRepository;
	
	public Student addStudent(Student student)
	{
		Student save=null;
		try {
			 save = testRepository.save(student);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return save;
	}
}
