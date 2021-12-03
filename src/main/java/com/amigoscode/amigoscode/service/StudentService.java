package com.amigoscode.amigoscode.service;

import com.amigoscode.amigoscode.dto.student.request.AddStudentRequestDto;
import com.amigoscode.amigoscode.dto.student.request.UpdateStudentRequestDto;
import com.amigoscode.amigoscode.model.Student;
import com.amigoscode.amigoscode.service.base.BaseService;

public interface StudentService extends BaseService<Student> {
    Student add(AddStudentRequestDto addDto);
    Student update(UpdateStudentRequestDto updateDto, Long studentId);
    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNotEqual(String email , Long studentId);
}
