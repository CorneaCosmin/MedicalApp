package springproject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class MeasureException extends RuntimeException {

    public MeasureException(String message) {
        super(message);
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public static class MeasureNotFound extends MeasureException {
        public MeasureNotFound(String message) {
            super(message);
        }
    }

}
