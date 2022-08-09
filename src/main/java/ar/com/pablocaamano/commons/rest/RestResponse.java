package ar.com.pablocaamano.commons.rest;

import lombok.Data;

import java.util.List;

/**
 * Basic model of rest Response for all microservices
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
@Data
public class RestResponse {

    private Header header = null;

    private List<Object> data = null;

}
