package ar.com.pablocaamano.commons.builder;

import ar.com.pablocaamano.commons.rest.Error;
import ar.com.pablocaamano.commons.rest.Header;
import ar.com.pablocaamano.commons.rest.RestResponse;
import java.util.LinkedList;
import java.util.List;

/**
 * Class to build RestResponse class. This builder contains methods to set response attributes
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
public class ResponseBuilder {
    private Header header = null;
    private List<Object> data = null;
    private List<Error> errors = null;

    public ResponseBuilder(){
        this.header = new Header();
        this.data = new LinkedList<>();
        this.errors = new LinkedList<>();
    }

    public static ResponseBuilder init(){
        return new ResponseBuilder();
    }

    public ResponseBuilder addRequestCode(String code){
        this.header.setCode(code);
        return this;
    }

    public ResponseBuilder addRequestMethod(String method){
        this.header.setMethod(method);
        return this;
    }

    public ResponseBuilder addRequestUri(String uriPath){
        this.header.setUriPath(uriPath);
        return this;
    }

    public ResponseBuilder addTimestamp(String timestamp){
        this.header.setTimestamp(timestamp);
        return this;
    }

    public ResponseBuilder addData(Object object){
        this.data.add(object);
        return this;
    }

    public ResponseBuilder addError(Error error){
        this.errors.add(error);
        return this;
    }

    public RestResponse build(){
        RestResponse restResponse = new RestResponse();
        this.header.setErrors(errors);
        restResponse.setHeader(this.header);
        restResponse.setData(this.data);
        return restResponse;
    }
}
