package ar.com.pablocaamano.commons.exception;

import java.io.Serial;

/**
 * Base exception model to generate custom exceptions
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
public class CommonException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 5142379291361803058L;

    /**
     * @param message error message description
     */
    public CommonException(String message){
        super(message);
    }


    /**
     * @param message error message description
     * @param cause exception causing of error
     */
    public CommonException(String message, Throwable cause){
        super(message, cause);
    }

}
