package ar.com.pablocaamano.commons.exception;

/**
 * Base exception model to generate custom exceptions
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
public class CommonException extends RuntimeException {

    /**
     * @param message error message description
     */
    public CommonException(String message){
        super(message);
    }

    /**
     * @param cause exception causing of error
     */
    public CommonException(Throwable cause){
        super(cause);
    }

    /**
     * @param message error message description
     * @param cause exception causing of error
     */
    public CommonException(String message, Throwable cause){
        super(message, cause);
    }

    /**
     * @param cause exception causing of error
     * @param message error message description
     */
    public CommonException(Throwable cause, String message){
        super(message, cause);
    }
}
