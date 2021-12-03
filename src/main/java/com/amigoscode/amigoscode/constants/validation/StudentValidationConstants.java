package com.amigoscode.amigoscode.constants.validation;

public class StudentValidationConstants {
    //ID constants
    public static final String FIELD_ID_REQUIRED = "Поле id обязательно";
    public static final String FIELD_ID_MUST_BE_POSITIVE = "Идентификатор поля должен быть положительным";

    //Surname constants
    public static final int FIELD_SURNAME_MIN_LENGTH_VALUE = 1;
    public static final int FIELD_SURNAME_MAX_LENGTH_VALUE = 30;
    public static final String FIELD_SURNAME_REQUIRED = "Поле фамилия обязательно";
    public static final String FIELD_SURNAME_LENGTH_MESSAGE = "Длина фамилии должна быть от "+ FIELD_SURNAME_MIN_LENGTH_VALUE +" до " + FIELD_SURNAME_MAX_LENGTH_VALUE + " символов";

    //Name constants
    public static final int FIELD_NAME_MIN_LENGTH_VALUE = 1;
    public static final int FIELD_NAME_MAX_LENGTH_VALUE = 30;
    public static final String FIELD_NAME_REQUIRED = "Поле имя обязательно";
    public static final String FIELD_NAME_LENGTH_MESSAGE = "Длина имени должна быть от "+ FIELD_NAME_MIN_LENGTH_VALUE +" до " + FIELD_NAME_MAX_LENGTH_VALUE + " символов";

    //Email constants
    public static final int FIELD_EMAIL_MIN_LENGTH_VALUE = 3;
    public static final int FIELD_EMAIL_MAX_LENGTH_VALUE = 255;
    public static final String FIELD_EMAIL_REQUIRED = "Поле email обязательно";
    public static final String EMAIL_ADDRESS_FORMAT_IS_INCORRECT = "Формат адреса электронной почты неверный";
    public static final String FIELD_EMAIL_LENGTH_MESSAGE = "Длина email должна быть от "+ FIELD_EMAIL_MIN_LENGTH_VALUE +" до " + FIELD_EMAIL_MAX_LENGTH_VALUE + " символов";

    //Date of birth constants
    public static final String FIELD_DATE_OF_BIRTH_REQUIRED = "Поле дата рождения обязательно";
    public static final String DATE_OF_BIRTH_MUST_BE_PAST = "Дата рождения должно быть прошедшим";
}
