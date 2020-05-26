package ar.com.pablocaamano.commons.exception.http;

import org.springframework.http.HttpStatus;

public interface ICommonHttpException {
    HttpStatus getStatus();
}
