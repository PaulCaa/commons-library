package ar.com.pablocaamano.commons.exception;

public class UnauthorizedException extends CommonException {
    public UnauthorizedException(String message) {
        super(message);
    }

    public UnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }
}
