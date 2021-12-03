package com.amigoscode.amigoscode.dto.student.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentResponseDto {
    private Long id;
    private String surname;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
}
