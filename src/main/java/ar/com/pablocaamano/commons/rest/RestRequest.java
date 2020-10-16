package ar.com.pablocaamano.commons.rest;

/**
 * Basic rest request model for microservices
 * @author Pablo Caamaño
 * @since 15/10/2020
 */
public class RestRequest {

    private Header header;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }
}
