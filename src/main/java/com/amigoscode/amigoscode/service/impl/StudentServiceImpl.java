package com.amigoscode.amigoscode.service.impl;

import com.amigoscode.amigoscode.dto.student.request.AddStudentRequestDto;
import com.amigoscode.amigoscode.dto.student.request.UpdateStudentRequestDto;
import com.amigoscode.amigoscode.exception.domain.DtoException;
import com.amigoscode.amigoscode.exception.domain.ResourceNotFoundException;
import com.amigoscode.amigoscode.facade.impl.StudentFacadeImpl;
import com.amigoscode.amigoscode.model.Student;
import com.amigoscode.amigoscode.repository.StudentRepository;
import com.amigoscode.amigoscode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.amigoscode.amigoscode.constants.model.StudentConstants.*;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentFacadeImpl studentFacade;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, StudentFacadeImpl studentFacade) {
        this.studentRepository = studentRepository;
        this.studentFacade = studentFacade;
    }

    @Override
    public Student add(AddStudentRequestDto addDto) {
        if (existsByEmail(addDto.getEmail()))
            throw new DtoException(STUDENT_EXISTS_BY_EMAIL_MESSAGE, STUDENT_EXISTS_BY_EMAIL_CODE);
        return save(studentFacade.addDtoToModel(addDto));
    }

    @Override
    public Student update(UpdateStudentRequestDto updateDto, Long studentId) {
        Student model = getById(updateDto.getId());
        if (updateDto.getId() != studentId)
            throw new DtoException(STUDENT_TWO_ANOTHER_ID_MESSAGE, STUDENT_TWO_ANOTHER_ID_CODE);
        if (existsByEmailAndIdNotEqual(updateDto.getEmail(), studentId))
            throw new DtoException(STUDENT_EXISTS_BY_EMAIL_MESSAGE, STUDENT_EXISTS_BY_EMAIL_CODE);
        return save(studentFacade.updateDtoToModel(model, updateDto));
    }

    @Override
    public boolean existsByEmail(String email) {
        return studentRepository.existsByEmail(email);
    }

    @Override
    public boolean existsByEmailAndIdNotEqual(String email, Long studentId) {
        return studentRepository.existsByEmailAndIdNot(email, studentId);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(STUDENT_NOT_FOUND_MESSAGE(id), STUDENT_NOT_FOUND_CODE)
        );
    }

    @Override
    public Student save(Student model) {
        return studentRepository.save(model);
    }

    @Override
    public boolean existsById(Long id) {
        return studentRepository.existsById(id);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
