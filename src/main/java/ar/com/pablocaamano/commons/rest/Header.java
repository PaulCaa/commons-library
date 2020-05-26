package ar.com.pablocaamano.commons.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Basic header model of rest responses with request information
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
public class Header {
    private String code = null;
    private String method = null;
    @JsonProperty(value = "uri_path")
    private String uriPath = null;
    private String timestamp = null;
    private List<Error> errors = null;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUriPath() {
        return uriPath;
    }

    public void setUriPath(String uriPath) {
        this.uriPath = uriPath;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}
