package net.learning.app.service;

import java.util.List;

import net.learning.app.entity.Student;
//import org.springframework.security.core.userdetails.UserDetailsService;

public interface StudentService {
	// extends UserDetailsService
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);


	Student save(Student student);

	boolean ifExists(Student student);




}
