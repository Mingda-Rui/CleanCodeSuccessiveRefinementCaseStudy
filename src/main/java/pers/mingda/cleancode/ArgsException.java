package pers.mingda.cleancode;

public class ArgsException extends Exception {
    public ArgsException(ErrorCode errorCode, char errorArgumentId, String errorParameter) {

    }

    public void setErrorArgumentId(char errorArgumentId) {

    }

    public String errorMessage() {
        // TODO implementation
        return "";
    }

    public enum ErrorCode {
        OK, INVALID_ARGUMENT_FORMAT, UNEXPECTED_ARGUMENT, INVALID_ARGUMENT_NAME,
        MISSING_STRING,
        MISSING_INTEGER, INVLID_INTEGER,
        MISSING_DOUBLE, INVALIDE_DOUBLE
    }
}
