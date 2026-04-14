package ar.com.pablocaamano.commons.exception;

/**
 * Exception to report missing of required parameter/s in methods
 * @author Pablo Caamaño
 * @since 25/05/2020
 */
public class BadRequestException extends RuntimeException {
    public static final String DEFAULT_MESSAGE = "Some required parameter is null or empty";

    /**
     * Create EmptyParameterException with default message
     */
    public BadRequestException() {
        super(DEFAULT_MESSAGE);
    }

    /**
     * Create EmptyParameterException with custom message
     * @param message (String) error message description
     */
    public BadRequestException(String message){
        super(message);
    }

    /**
     * Create EmptyParameterException with cause and default message
     * @param cause Throwable
     */
    public BadRequestException(Throwable cause){
        super(DEFAULT_MESSAGE, cause);
    }

    /**
     * Create EmptyParameterException with cause and custom  message
     * @param message (String) error message description
     * @param cause Throwable
     */
    public BadRequestException(String message, Throwable cause){
        super(message, cause);
    }
}
