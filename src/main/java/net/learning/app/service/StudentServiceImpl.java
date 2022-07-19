package net.learning.app.service;

import java.util.List;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import net.learning.app.entity.Student;
import org.springframework.stereotype.Service;

import net.learning.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
//		studentRepository.exists()
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}
	public boolean ifExists(Student student){
		boolean exists = studentRepository.existsById(student.getId());
		return exists;
	}

//	@Override
//	public UserDetails loadUserByUsername(String student) throws UsernameNotFoundException {
//		Student user = studentRepository.findByEmail(student);
//		if(user == null) {
//			throw new UsernameNotFoundException("Invalid username or password.");
//		}
//		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), null);
//	}
}
