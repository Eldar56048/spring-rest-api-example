package com.amigoscode.amigoscode.facade.impl;

import com.amigoscode.amigoscode.dto.student.request.AddStudentRequestDto;
import com.amigoscode.amigoscode.dto.student.request.UpdateStudentRequestDto;
import com.amigoscode.amigoscode.dto.student.response.StudentResponseDto;
import com.amigoscode.amigoscode.facade.StudentFacade;
import com.amigoscode.amigoscode.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentFacadeImpl implements StudentFacade {
    @Override
    public StudentResponseDto modelToResponseDto(Student student) {
        StudentResponseDto responseDto = new StudentResponseDto();
        if (student.getId() != null)
            responseDto.setId(student.getId());
        if (student.getSurname() != null)
            responseDto.setSurname(student.getSurname());
        if (student.getName() != null)
            responseDto.setName(student.getName());
        if (student.getEmail() != null)
            responseDto.setEmail(student.getEmail());
        if (student.getDateOfBirth() != null)
            responseDto.setDateOfBirth(student.getDateOfBirth());
        return responseDto;
    }

    @Override
    public List<StudentResponseDto> modelListToResponseDtoList(List<Student> students) {
        List<StudentResponseDto> responseDtoList = new ArrayList<>();
        for(Student model : students)
            responseDtoList.add(modelToResponseDto(model));
        return responseDtoList;
    }

    @Override
    public Student addDtoToModel(AddStudentRequestDto addStudentRequestDto) {
        System.out.println("EMAIL: "+addStudentRequestDto.getEmail());
        Student model = new Student();
        if (addStudentRequestDto.getSurname() != null)
            model.setSurname(addStudentRequestDto.getSurname());
        if (addStudentRequestDto.getName() != null)
            model.setName(addStudentRequestDto.getName());
        if (addStudentRequestDto.getEmail() != null)
            model.setEmail(addStudentRequestDto.getEmail());
        if (addStudentRequestDto.getDateOfBirth() != null)
            model.setDateOfBirth(addStudentRequestDto.getDateOfBirth());
        return model;
    }

    @Override
    public Student updateDtoToModel(Student student, UpdateStudentRequestDto updateStudentRequestDto) {
        if (!updateStudentRequestDto.getSurname().equals(student.getSurname()))
            student.setSurname(updateStudentRequestDto.getSurname());
        if (!updateStudentRequestDto.getName().equals(student.getName()))
            student.setName(updateStudentRequestDto.getName());
        if (!updateStudentRequestDto.getEmail().equals(student.getEmail()))
            student.setEmail(updateStudentRequestDto.getEmail());
        return student;
    }
}




















