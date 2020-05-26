package ar.com.pablocaamano.commons.exception;

/**
 * Exception to report missing of required parameter/s in methods
 * @author Pablo Caamaño
 * @since 25/05/2020
 */
public class EmptyParameterException extends CommonException {

    private static final String DEFAULT_MESSAGE = "Some required parameter is null or empty";

    /**
     * Create default EmptyParameterException
     */
    public EmptyParameterException(){
        super(DEFAULT_MESSAGE);
    }

    /**
     * Create custom EmptyParameterException
     * @param message error message description
     */
    public EmptyParameterException(String message){
        super(message);
    }
}
