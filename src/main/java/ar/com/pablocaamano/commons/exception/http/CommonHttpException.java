package ar.com.pablocaamano.commons.exception.http;

import ar.com.pablocaamano.commons.exception.CommonException;
import org.springframework.http.HttpStatus;

public class CommonHttpException extends CommonException implements ICommonHttpException {

    private HttpStatus httpStatus;
    private String code;

    public CommonHttpException(String message, HttpStatus status) {
        super(message);
    }

    public CommonHttpException(String message, HttpStatus status, Throwable cause) {
        super(message, cause);
    }

    public CommonHttpException(String message, HttpStatus status, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }

    @Override
    public HttpStatus getStatus() {
        return this.httpStatus;
    }

    public String getCode(){
        return this.code;
    }
}
