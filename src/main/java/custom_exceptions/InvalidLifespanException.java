package custom_exceptions;

public class InvalidLifespanException extends RuntimeException {

    private String message = "Invalid lifespan";

    @Override
    public String getMessage() {
        return message;
    }
}
