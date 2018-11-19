package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class ExpiredCardException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.EXPIRED_CARD;
    }

    public ExpiredCardException() {
        super();
    }

    public ExpiredCardException(String message) {
        super(message);
    }

    public ExpiredCardException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExpiredCardException(Throwable cause) {
        super(cause);
    }
}
