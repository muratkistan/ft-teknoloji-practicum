package com.muratkistan.ft.exceptions;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

@Data
public class ApiError {

    private int status;
    private String message;

    private LocalDate timestamp= LocalDate.now();

    private Map<String,String> validationErrors;

    public ApiError(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
