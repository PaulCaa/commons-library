package ar.com.pablocaamano.commons.exception;

public class ForbiddenException extends CommonException {
    public ForbiddenException(String message) {
        super(message);
    }

    public ForbiddenException(String message, Throwable cause) {
        super(message, cause);
    }
}
