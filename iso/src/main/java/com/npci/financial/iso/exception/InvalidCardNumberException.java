package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class InvalidCardNumberException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.INVALID_CARD_NUMBER;
    }

    public InvalidCardNumberException() {
        super();
    }

    public InvalidCardNumberException(String message) {
        super(message);
    }

    public InvalidCardNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCardNumberException(Throwable cause) {
        super(cause);
    }
}
