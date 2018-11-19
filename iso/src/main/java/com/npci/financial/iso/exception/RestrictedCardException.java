package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class RestrictedCardException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.RESTRICTED_CARD;
    }

    public RestrictedCardException() {
        super();
    }

    public RestrictedCardException(String message) {
        super(message);
    }

    public RestrictedCardException(String message, Throwable cause) {
        super(message, cause);
    }

    public RestrictedCardException(Throwable cause) {
        super(cause);
    }
}
