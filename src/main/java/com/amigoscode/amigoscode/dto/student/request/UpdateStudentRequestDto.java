package com.amigoscode.amigoscode.dto.student.request;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.time.LocalDate;

import static com.amigoscode.amigoscode.constants.validation.StudentValidationConstants.*;

@Data
public class UpdateStudentRequestDto {

    @NotNull(message = FIELD_ID_REQUIRED)
    @Positive(message = FIELD_ID_MUST_BE_POSITIVE)
    private Long id;

    @NotBlank(message = FIELD_SURNAME_REQUIRED)
    @Length(message = FIELD_SURNAME_LENGTH_MESSAGE, min = FIELD_SURNAME_MIN_LENGTH_VALUE, max = FIELD_SURNAME_MAX_LENGTH_VALUE)
    private String surname;

    @NotBlank(message = FIELD_NAME_REQUIRED)
    @Length(message = FIELD_NAME_LENGTH_MESSAGE, min = FIELD_NAME_MIN_LENGTH_VALUE, max = FIELD_NAME_MAX_LENGTH_VALUE)
    private String name;

    @NotBlank(message = FIELD_EMAIL_REQUIRED)
    @Email(message = EMAIL_ADDRESS_FORMAT_IS_INCORRECT)
    @Length(message = FIELD_EMAIL_LENGTH_MESSAGE, min = FIELD_EMAIL_MIN_LENGTH_VALUE, max = FIELD_EMAIL_MAX_LENGTH_VALUE)
    private String email;

    @NotNull(message = FIELD_DATE_OF_BIRTH_REQUIRED)
    @Past(message = DATE_OF_BIRTH_MUST_BE_PAST)
    private LocalDate dateOfBirth;

}
