package com.amigoscode.amigoscode.facade;

import com.amigoscode.amigoscode.dto.student.request.AddStudentRequestDto;
import com.amigoscode.amigoscode.dto.student.request.UpdateStudentRequestDto;
import com.amigoscode.amigoscode.dto.student.response.StudentResponseDto;
import com.amigoscode.amigoscode.facade.base.BaseFacade;
import com.amigoscode.amigoscode.model.Student;

public interface StudentFacade extends BaseFacade<Student, AddStudentRequestDto, UpdateStudentRequestDto, StudentResponseDto> {
}
