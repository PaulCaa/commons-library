package ar.com.pablocaamano.commons.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Basic model of Error to add in rest responses of microservices
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Error {
    private String message = null;
    private String description = null;
    private Throwable cause = null;

    @Override
    public String toString() {
        return "{\"message\": \""+message+"\", " +
                "\"description\": \""+description+"\", " +
                "\"cause\": \""+cause.getMessage()+"\"}";
    }

}
