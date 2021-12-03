package com.amigoscode.amigoscode.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationErrorDetail {
    private ErrorDetail errorDetail;
    private Map<String, String> validation;
}
