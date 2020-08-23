package com.test.controller;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Student;
import com.test.service.TestService;

@RestController
//@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private TestService Service;
	
	@PostMapping(value="/addstudent", consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	
	public ResponseEntity<Student> addStudent(@RequestBody Student student)
	{
		System.out.println("hi "+student);
		Student addStudent = Service.addStudent(student);
		System.out.println(addStudent);
		return new ResponseEntity<Student>(addStudent,HttpStatus.OK) ;  
	}

	@GetMapping("/hi")
	public String m1(@RequestParam("data") String data) {
		
		return "test 123333"+data;
	}
}
