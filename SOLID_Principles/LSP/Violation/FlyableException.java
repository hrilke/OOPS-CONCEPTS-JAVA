package SOLID_Principles.LSP.Violation;

public class FlyableException extends RuntimeException {
    public FlyableException() {
    }

    public FlyableException(String message) {
        super(message);
    }

    public FlyableException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlyableException(Throwable cause) {
        super(cause);
    }

    public FlyableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
