package com.amigoscode.amigoscode.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetail {
    private int status;
    private Date timeStamp;
    private String message;
    private String details;
    private String code;
}

