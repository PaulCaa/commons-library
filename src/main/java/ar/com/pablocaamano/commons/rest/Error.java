package ar.com.pablocaamano.commons.rest;

/**
 * Basic model of Error to add in rest responses of microservices
 * @author Pablo Caamaño
 * @since 20/11/2019
 */
public class Error {
    private String message = null;
    private String description = null;
    private Throwable cause = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }
}
