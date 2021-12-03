package com.amigoscode.amigoscode.constants.model;

public class StudentConstants {
    public static final String STUDENT_EXISTS_BY_EMAIL_MESSAGE = "Студент с таким email уже существует";
    public static final String STUDENT_EXISTS_BY_EMAIL_CODE = "student/exists-by-email";

    public static final String STUDENT_NOT_FOUND_MESSAGE(Long id) {
        return "Студент с идентификатором №" + id + " не найдено";
    }
    public static final String STUDENT_NOT_FOUND_CODE = "student/not-found";

    public static final String STUDENT_TWO_ANOTHER_ID_MESSAGE = "Два разных id";
    public static final String STUDENT_TWO_ANOTHER_ID_CODE = "student/two-another-id";

    public static final String STUDENT_SUCCESSFULLY_DELETED = "student/successfully-deleted";


}
