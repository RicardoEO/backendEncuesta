package com.encuesta.encuestasApp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FOUND)
public class EmailFoundException extends RuntimeException {

    public EmailFoundException(String mensaje) {
        super(mensaje);
    }
}
