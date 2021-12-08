package com.petsgram.mspost.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseBody
@ControllerAdvice
public class LikeAlreadyCreatedAdvice {

    @ResponseBody
    @ExceptionHandler(LikeAlreadyCreatedException.class)
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public String likeAlreadyCreatedExceptionHandler(LikeAlreadyCreatedException e) {
        return e.getMessage();
    }

}
