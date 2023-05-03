package com.example.UniversityManagementSystem.exceptionHandler;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> exception(MethodArgumentNotValidException ex){
        List<ObjectError> allErrors = ex.getBindingResult().getAllErrors();
        Map<String,String> map=new HashMap<>();
        for(ObjectError error:allErrors){
            String code = error.getCode();
            String defaultMessage = error.getDefaultMessage();
            map.put(code,defaultMessage);
        }
        return map;
    }
}
