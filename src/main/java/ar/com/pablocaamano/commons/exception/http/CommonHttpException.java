package ar.com.pablocaamano.commons.exception.http;

import ar.com.pablocaamano.commons.exception.CommonException;
import org.springframework.http.HttpStatus;

public class CommonHttpException extends CommonException implements ICommonHttpException {

    private HttpStatus httpStatus;
    private String code;

    public CommonHttpException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public CommonHttpException(String message, HttpStatus httpStatus, Throwable cause) {
        super(message, cause);
        this.httpStatus = httpStatus;
    }

    public CommonHttpException(String message, HttpStatus httpStatus, String code) {
        super(message);
        this.code = code;
        this.httpStatus = httpStatus;
    }

    public CommonHttpException(String message, HttpStatus httpStatus, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
        this.httpStatus = httpStatus;
    }

    @Override
    public HttpStatus getStatus() {
        return this.httpStatus;
    }

    public String getCode(){
        return this.code;
    }
}
