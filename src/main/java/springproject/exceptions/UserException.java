package springproject.exceptions;

import springproject.dto.UserResponseDto;

public class UserException extends Exception {

    public UserException(String message) {
        super(message);
    }

    public static class UsernameNotFound extends UserException {
        public UsernameNotFound(String message) {
            super(message);
        }
    }

    public static class UsernameAlreadyExists extends UserException {
        public UsernameAlreadyExists(String message) {
            super(message);
        }
    }

    public static class UserUnauthorized extends UserException {
        public UserUnauthorized(String message) {
            super(message);
        }
    }
}
