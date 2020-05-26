package ar.com.pablocaamano.commons.rest;

import java.util.List;

/**
 * Basic model of rest Response for all microservices
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
public class RestResponse {
    private Header header = null;
    private List<Object> data = null;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
