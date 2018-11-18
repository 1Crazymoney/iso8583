package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class AmountExceededException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.AMOUNT_EXCEEDED;
    }

    public AmountExceededException() {
        super();
    }

    public AmountExceededException(String message) {
        super(message);
    }

    public AmountExceededException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmountExceededException(Throwable cause) {
        super(cause);
    }
}
