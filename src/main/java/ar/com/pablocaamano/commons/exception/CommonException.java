package ar.com.pablocaamano.commons.exception;

import ar.com.pablocaamano.commons.rest.Error;
import lombok.Getter;

/**
 * Base exception model to generate custom exceptions
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
@Getter
public class CommonException extends RuntimeException {

    private static final long serialVersionUID = 5142379291361803058L;

    private final Error error;

    /**
     * @param message error message description
     */
    public CommonException(String message){
        super(message);
        this.error = new Error(message, "", null);
    }

    /**
     * @param error class with details of error event
     */
    public CommonException(Error error){
        super(error.getMessage());
        this.error = error;
    }


    /**
     * @param message error message description
     * @param cause exception causing of error
     */
    public CommonException(String message, Throwable cause){
        super(message, cause);
        this.error = new Error(message, "", cause);
    }

    /**
     *
     * @param message error message description
     * @param error class with details of error event
     */
    public CommonException(String message, Error error){
        super(message, error.getCause());
        this.error = error;
    }

}
