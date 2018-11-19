package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class InvalidPaymentIdException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.INVALID_PAYMENT_ID;
    }

    public InvalidPaymentIdException() {
        super();
    }

    public InvalidPaymentIdException(String message) {
        super(message);
    }

    public InvalidPaymentIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPaymentIdException(Throwable cause) {
        super(cause);
    }
}
