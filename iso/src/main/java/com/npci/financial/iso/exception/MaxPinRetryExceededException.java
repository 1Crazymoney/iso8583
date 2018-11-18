package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class MaxPinRetryExceededException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.MAX_PIN_RETRY_EXCEEDED;
    }

    public MaxPinRetryExceededException() {
        super();
    }

    public MaxPinRetryExceededException(String message) {
        super(message);
    }

    public MaxPinRetryExceededException(String message, Throwable cause) {
        super(message, cause);
    }

    public MaxPinRetryExceededException(Throwable cause) {
        super(cause);
    }
}
