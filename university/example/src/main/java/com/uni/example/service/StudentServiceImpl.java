package com.uni.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.example.model.Student;
import com.uni.example.model.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public Student findStudent(String id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).orElse(null);
	}

	@Override
	public void removeStudent(String id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return (List<Student>)studentRepository.findAll();
	}

	@Override
	public List<Student> findByFullName(String fullName) {
		// TODO Auto-generated method stub
		return studentRepository.findByFullName(fullName);
	}

	@Override
	public Integer getCountByFullName(String fullName) {
		// TODO Auto-generated method stub
		return studentRepository.getCountByFullName(fullName);
	}

}
