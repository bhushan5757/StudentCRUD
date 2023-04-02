package com.data.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.data.demo.model.Student;

public interface StudentService {

	
	public Student saveStudent(Student student);
	public Optional<Student> findById(Integer Id);
    public void deleteById(Integer Id);
    public Student updateStudent(Student student);
	public List<Student> getStudentByfirstname(String firstname);
	
	
}
