package com.data.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.demo.model.Student;
import com.data.demo.service.StudentServiceimpl;


@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentServiceimpl stuimp ;
	

	@PostMapping("/save")
	public ResponseEntity<Student> saveStutent(@RequestBody Student student) {
		Student student1=stuimp.saveStudent(student);
		return ResponseEntity.ok().body(student1);
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Student>> getStudentById(@PathVariable ("id")Integer Id){
		Optional<Student> stu1=stuimp.findById(Id);
		return ResponseEntity.ok().body(stu1) ;
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable ("id")Integer Id) {
		stuimp.deleteById(Id);
	}
	@GetMapping("/getfirstname/{firstname}")
	public ResponseEntity<List<Student>> getStudentByCity(@PathVariable ("firstname")String firstname){
		List<Student> stu2=	stuimp.getStudentByfirstname(firstname);
		return ResponseEntity.ok().body(stu2);
	}

	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable int id,@RequestBody Student student) {
	    student.setId(id);
	    return ResponseEntity.ok().body(stuimp.updateStudent(student));
	}
}

	
	
	
	