package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class SecurityViolationException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.SECURITY_VIOLATION;
    }

    public SecurityViolationException() {
        super();
    }

    public SecurityViolationException(String message) {
        super(message);
    }

    public SecurityViolationException(String message, Throwable cause) {
        super(message, cause);
    }

    public SecurityViolationException(Throwable cause) {
        super(cause);
    }
}
