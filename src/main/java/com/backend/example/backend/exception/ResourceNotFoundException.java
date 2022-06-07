package com.backend.example.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    private String ressourceName;
    private String fieldName;
    private Object fieldValue;

    public ResourceNotFoundException(String ressourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s: '%s'", ressourceName, fieldName, fieldValue));
        this.ressourceName = ressourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getRessourceName() {
        return ressourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
}
