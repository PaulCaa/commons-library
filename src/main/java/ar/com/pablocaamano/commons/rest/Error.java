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

    public Error(){}

    /**
     * Generate error with message
     * @param message
     */
    public Error(String message){
        this.message = message;
    }

    /**
     * Generate error with cause
     * @param cause Throwable or Exception
     */
    public Error(Throwable cause){
        this.cause = cause;
    }

    /**
     * Generate error with message and description
     * @param message error message
     * @param description error description
     */
    public Error(String message, String description){
        this.message = message;
        this.description = description;
    }

    /**
     * Generate error with message and cause
     * @param message error message
     * @param cause Throwable or Exception
     */
    public Error(String message, Throwable cause){
        this.message = message;
        this.cause = cause;
    }

    /**
     * Generate error with message, description and cause
     * @param message error message
     * @param description error description
     * @param cause Throwable or Exception
     */
    public Error(String message, String description, Throwable cause){
        this.message = message;
        this.description = description;
        this.cause = cause;
    }

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
