package net.learning.app.repository;

import net.learning.app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
    Student findByEmail(String email);


}
