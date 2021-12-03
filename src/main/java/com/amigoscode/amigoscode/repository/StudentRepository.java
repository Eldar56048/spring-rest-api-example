package com.amigoscode.amigoscode.repository;

import com.amigoscode.amigoscode.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, Long studentId);
}
