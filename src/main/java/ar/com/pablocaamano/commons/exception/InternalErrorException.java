package ar.com.pablocaamano.commons.exception;

public class InternalErrorException extends CommonException{
    public InternalErrorException(String message) {
        super(message);
    }

    public InternalErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
