package com.data.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.data.demo.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	@Query(value = "select * from student where firstname=?1",nativeQuery=true)
	public List<Student> getStudentByfirstname(String firstname);
	
	
}
