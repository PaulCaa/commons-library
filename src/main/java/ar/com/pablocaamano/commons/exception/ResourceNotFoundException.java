package ar.com.pablocaamano.commons.exception;

public class ResourceNotFoundException extends CommonException{
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
