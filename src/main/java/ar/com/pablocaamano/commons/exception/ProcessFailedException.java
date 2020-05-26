package ar.com.pablocaamano.commons.exception;

/**
 * Exception to report fails of process executions
 * @author Pablo Caamaño
 * @since 25/05/2020
 */
public class ProcessFailedException extends CommonException {

    private static final String DEFAULT_MESSAGE = "A internal process was failed";

    /**
     * Generate default ProcessFailedException
     */
    public ProcessFailedException(){
        super(DEFAULT_MESSAGE);
    }

    /**
     * Generate ProcessFailedException with custom message description
     * @param message error message description
     */
    public ProcessFailedException(String message){
        super(message);
    }

    /**
     * Generate ProcessFailedException with cause and default message description
     * @param cause exception causing of error
     */
    public ProcessFailedException(Throwable cause){
        super(DEFAULT_MESSAGE, cause);
    }

    /**
     * Generate ProcessFailedException with cause and custom message description
     * @param message error message description
     * @param cause exception causing of error
     */
    public ProcessFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
