package ar.com.pablocaamano.commons.exception;

import ar.com.pablocaamano.commons.rest.Error;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class CommonHttpException extends CommonException {

    private static final long serialVersionUID = 7826964567761504567L;

    private final HttpStatus httpStatus;

    /**
     * @param error  class with details of error event
     * @param httpStatus status HTTP to returns
     */
    public CommonHttpException(Error error, HttpStatus httpStatus) {
        super(error);
        this.httpStatus = httpStatus;
    }

    /**
     * @param message error message description
     * @param httpStatus status HTTP to returns
     */
    public CommonHttpException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    /**
     * @param message error message description
     * @param httpStatus status HTTP to returns
     * @param cause exception causing of error
     */
    public CommonHttpException(String message, HttpStatus httpStatus, Throwable cause) {
        super(message, cause);
        this.httpStatus = httpStatus;
    }


}
