package ar.com.pablocaamano.commons.rest;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

/**
 * Basic model of rest Response for all microservices
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
@Getter
@Setter
@ToString
@Builder
public class CommonResponse {
    private Metadata head;
    private List<Error> errors;

    public CommonResponse() {
        this.errors = new LinkedList<>();
    }

    public CommonResponse(Metadata head, List<Error> errors) {
        this.head = head;
    }

    public void addError(Error error) {
        this.errors.add(error);
    }
}
