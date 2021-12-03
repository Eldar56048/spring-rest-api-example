package com.amigoscode.amigoscode.controller;

import com.amigoscode.amigoscode.dto.student.request.AddStudentRequestDto;
import com.amigoscode.amigoscode.dto.student.request.UpdateStudentRequestDto;
import com.amigoscode.amigoscode.dto.student.response.StudentResponseDto;
import com.amigoscode.amigoscode.facade.impl.StudentFacadeImpl;
import com.amigoscode.amigoscode.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.amigoscode.amigoscode.constants.model.StudentConstants.STUDENT_SUCCESSFULLY_DELETED;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentServiceImpl studentService;
    private final StudentFacadeImpl studentFacade;

    @Autowired
    public StudentController(StudentServiceImpl studentService, StudentFacadeImpl studentFacade) {
        this.studentService = studentService;
        this.studentFacade = studentFacade;
    }

    @GetMapping
    public ResponseEntity<List<StudentResponseDto>> getAll() {
        return ResponseEntity.ok(studentFacade.modelListToResponseDtoList(studentService.getAll()));
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<StudentResponseDto> get(@PathVariable Long studentId) {
        return ResponseEntity.ok(studentFacade.modelToResponseDto(studentService.getById(studentId)));
    }

    @PostMapping
    public ResponseEntity<StudentResponseDto> add(@Valid @RequestBody AddStudentRequestDto addDto) {
        return ResponseEntity.ok(studentFacade.modelToResponseDto(studentService.add(addDto)));
    }

    @PutMapping("/{studentId}")
    public ResponseEntity<StudentResponseDto> update(@Valid @RequestBody UpdateStudentRequestDto updateDto, @PathVariable Long studentId) {
        return ResponseEntity.ok(studentFacade.modelToResponseDto(studentService.update(updateDto, studentId)));
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        return ResponseEntity.ok(STUDENT_SUCCESSFULLY_DELETED);
    }
}
