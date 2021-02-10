package com.uni.example.service;

import java.util.List;

import com.uni.example.model.Student;

public interface StudentService {
	public void saveStudent(Student student);
	public Student findStudent(String id);
	public void removeStudent(String id);
	public List<Student> findAll(); 
	public List<Student> findByFullName(String fullName); 
	public Integer getCountByFullName(String fullName);
}
