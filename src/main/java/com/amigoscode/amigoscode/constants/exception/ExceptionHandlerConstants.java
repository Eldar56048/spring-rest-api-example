package com.amigoscode.amigoscode.constants.exception;

public class ExceptionHandlerConstants {
    public static final String VALIDATION_FAILED_MESSAGE = "Валидация провалена";
    public static final String VALIDATION_FAILED_CODE = "validation/failed";

    public static final String METHOD_NOT_ALLOWED_MESSAGE(String method) {
        return "Метод запроса "+method+" не поддерживается";
    }
    public static final String METHOD_NOT_ALLOWED_CODE = "method/not-allowed";
}
