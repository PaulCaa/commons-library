package ar.com.pablocaamano.commons.handler;

import ar.com.pablocaamano.commons.exception.*;
import ar.com.pablocaamano.commons.rest.CommonResponse;
import ar.com.pablocaamano.commons.rest.Error;
import ar.com.pablocaamano.commons.rest.Metadata;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;

import java.time.LocalDateTime;
import java.util.List;

@ControllerAdvice
public class CommonErrorHandler {
    @ExceptionHandler(InternalError.class)
    public ResponseEntity<CommonResponse> handleInternalError(InternalError error, ServletWebRequest request) {
        return new ResponseEntity<>(buildErrorResponse(error.getMessage(), request, HttpStatus.INTERNAL_SERVER_ERROR),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<CommonResponse> handleResourceNotFound(ResourceNotFoundException error, ServletWebRequest request) {
        return new ResponseEntity<>(buildErrorResponse(error.getMessage(), request, HttpStatus.NOT_FOUND),
                HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<CommonResponse> handleUnauthorized(UnauthorizedException error, ServletWebRequest request) {
        return new ResponseEntity<>(buildErrorResponse(error.getMessage(), request, HttpStatus.UNAUTHORIZED),
                HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(ForbiddenException.class)
    public ResponseEntity<CommonResponse> handleForbidden(ForbiddenException error, ServletWebRequest request) {
        return new ResponseEntity<>(buildErrorResponse(error.getMessage(), request, HttpStatus.FORBIDDEN),
                HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<CommonResponse> handleBadRequest(BadRequestException error, ServletWebRequest request) {
        return new ResponseEntity<>(buildErrorResponse(error.getMessage(), request, HttpStatus.BAD_REQUEST),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CommonException.class)
    public ResponseEntity<CommonResponse> handleCommonException(CommonException error, ServletWebRequest request) {
        return new ResponseEntity<>(buildErrorResponse(error.getMessage(), request, HttpStatus.INTERNAL_SERVER_ERROR),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CommonResponse> handleException(Exception error, ServletWebRequest request) {
        String message = error.getMessage() == null || error.getMessage().isEmpty() ?
                "An execution error occurred": error.getMessage();
        return new ResponseEntity<>(buildErrorResponse(message, request, HttpStatus.SERVICE_UNAVAILABLE),
                HttpStatus.SERVICE_UNAVAILABLE);
    }

    private CommonResponse buildErrorResponse(String message, ServletWebRequest request, HttpStatus status) {
        return CommonResponse.builder()
                .head(Metadata.builder()
                        .code(status.toString())
                        .method(request.getHttpMethod() + " " + request.getContextPath())
                        .timestamp(LocalDateTime.now().toString())
                        .build())
                .errors(List.of(Error.builder()
                                .message(status.name())
                                .description(message)
                        .build()))
                .build();
    }
}
