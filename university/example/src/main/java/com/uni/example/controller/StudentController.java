package com.uni.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uni.example.model.Student;
import com.uni.example.service.StudentService;

@RestController
@RequestMapping(path="/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping(path="/save")
	public void saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
	}
	
	@GetMapping(path="/{id}")
	public Student getStudent(@PathVariable("id") String id) {
		return studentService.findStudent(id);
	}
	
	@DeleteMapping(path="/{id}")
	public void deleteStudent(@PathVariable("id") String id) {
		studentService.removeStudent(id);
	}
	
	@PutMapping
	public void updateStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
	}
	
	@GetMapping(path="/all")
	public List<Student> getAllStudent() {
		return studentService.findAll();
	}
	
	@GetMapping(path="/byName")
	public List<Student> getStudentByName(@RequestParam String fullName) {
		return studentService.findByFullName(fullName);
	}
	
	@GetMapping(path="/countBYName")
	public Integer getStudentCountByName(@RequestParam String fullName) {
		return studentService.getCountByFullName(fullName);
	}
	
}
