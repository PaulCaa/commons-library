package ar.com.pablocaamano.commons.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serial;

@Data
public class CommonHttpException extends CommonException {

    @Serial
    private static final long serialVersionUID = 7826964567761504567L;

    private final HttpStatus httpStatus;

    public CommonHttpException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public CommonHttpException(String message, HttpStatus httpStatus, Throwable cause) {
        super(message, cause);
        this.httpStatus = httpStatus;
    }


}