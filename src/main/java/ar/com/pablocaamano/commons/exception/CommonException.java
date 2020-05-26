package ar.com.pablocaamano.commons.exception;

/**
 * Base exception model to generate custom exceptions
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
public class CommonException extends RuntimeException {

    public CommonException(String message){
        super(message);
    }

    public CommonException(String message, Throwable cause){
        super(message, cause);
    }

    public CommonException(Throwable cause, String message){
        super(message, cause);
    }
}
