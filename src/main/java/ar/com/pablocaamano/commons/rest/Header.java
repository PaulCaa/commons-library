package ar.com.pablocaamano.commons.rest;

import ar.com.pablocaamano.commons.util.IdGenerator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

/**
 * Basic header model of rest responses with request information
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
@Getter
public class Header {
    private String code;
    private String method;
    @JsonProperty(value = "uri_path")
    private String uriPath;
    private final String timestamp;

    @JsonProperty(value = "trace_id")
    private final String traceId;
    private List<Error> errors;

    public Header(){
        this.traceId = IdGenerator.getStringIdRadom();
        this.timestamp = LocalDateTime.now().toString();
        this.errors = new LinkedList<>();

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Error e : errors) sb.append(e.toString());
        return "{\"code\": \""+code+"\", " +
                "\"method\": \""+method+"\", " +
                "\"uriPath\": \""+uriPath+"\", " +
                "\"timestamp\": \""+timestamp+"\", " +
                "\"traceId\": \""+traceId+"\", " +
                "\"errors\": ["+sb.toString()+"]}";
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setUriPath(String uriPath) {
        this.uriPath = uriPath;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public void setError(Error error) {
        this.errors.add(error);
    }
}
