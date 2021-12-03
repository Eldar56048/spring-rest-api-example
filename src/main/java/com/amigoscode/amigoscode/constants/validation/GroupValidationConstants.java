package com.amigoscode.amigoscode.constants.validation;

public class GroupValidationConstants {
    //Id constants
    public static final String FIELD_ID_REQUIRED = "Поле id обязательно";
    public static final String FIELD_ID_MUST_BE_POSITIVE = "Идентификатор поля должен быть положительным";

    //Group name constants
    public static final int FIELD_GROUP_NAME_MIN_LENGTH_VALUE = 1;
    public static final int FIELD_GROUP_NAME_MAX_LENGTH_VALUE = 30;
    public static final String FIELD_GROUP_NAME_REQUIRED = "Поле название группы обязательно";
    public static final String FIELD_GROUP_NAME_LENGTH_MESSAGE = "Длина название группы должна быть от "+ FIELD_GROUP_NAME_MIN_LENGTH_VALUE +" до " + FIELD_GROUP_NAME_MAX_LENGTH_VALUE + " символов";
}
