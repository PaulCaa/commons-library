package ar.com.pablocaamano.commons.rest;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Basic header model of rest responses with request information
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
@Getter
@Setter
@ToString
@Builder
public class Metadata {
    private String code;
    private String method;
    private String timestamp;
}
