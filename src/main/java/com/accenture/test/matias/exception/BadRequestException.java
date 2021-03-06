package com.accenture.test.matias.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;

/**
 * Customizable Class for a Bad Request exception.
 * 
 * @author Matias Gomez Arancibia.
 *
 */
@Getter
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    /**
     * Serial.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Solution.
     */
    private final String solution;

    /**
     * Code.
     */
    private final String code;

    /**
     * error time
     */
    private final Date time = new Date();

    /**
     * Empty default constructor.
     */
    public BadRequestException() {

        super();
        code = "";
        solution = "";
    }

    /**
     * Constructor for a custom exception.
     * 
     * @param message Message of the error.
     * @param solution Solution given to the user.
     * @param code Code that identifies the service of the error.
     */
    public BadRequestException(String message, String solution, String code) {

        super(message);
        this.solution = solution;
        this.code = code;
    }
}
