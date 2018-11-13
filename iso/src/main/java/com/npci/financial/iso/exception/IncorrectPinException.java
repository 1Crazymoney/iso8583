package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class IncorrectPinException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.INCORRECT_PIN;
    }

    public IncorrectPinException() {
        super();
    }

    public IncorrectPinException(String message) {
        super(message);
    }

    public IncorrectPinException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectPinException(Throwable cause) {
        super(cause);
    }
}
