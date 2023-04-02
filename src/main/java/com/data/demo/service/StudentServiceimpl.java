package com.data.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.data.demo.dao.StudentRepository;
import com.data.demo.model.Student;
@Service
public class StudentServiceimpl implements StudentService {
    
	@Autowired
	private StudentRepository stuRepo;
@Override
	public Student saveStudent(Student student) {
		return stuRepo.save(student);
	}
@Override
public Optional<Student> findById(Integer Id) {
	Optional<Student> stu= stuRepo.findById(Id);
	return stu;
}
@Override
public void deleteById(Integer Id) {
stuRepo.deleteById(Id);	
}
@Override
public List<Student> getStudentByfirstname(String firstname) {
	List <Student> Stu1=stuRepo.getStudentByfirstname(firstname);
	return Stu1;
}
@Override
public Student updateStudent(Student student) {
	// TODO Auto-generated method stub
	return stuRepo.save(student);
}

}
