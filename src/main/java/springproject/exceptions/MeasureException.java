package springproject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class HospitalException extends RuntimeException {

    public HospitalException(String message) {
        super(message);
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public static class HospitalNotFound extends HospitalException {
        public HospitalNotFound(String message) {
            super(message);
        }
    }

    @ResponseStatus(code = HttpStatus.CONFLICT)
    public static class HospitalAlreadyExists extends HospitalException {
        public HospitalAlreadyExists(String message) {
            super(message);
        }
    }

}
