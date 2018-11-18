package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class InsufficientFundsException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.INSUFFICIENT_FUNDS;
    }

    public InsufficientFundsException() {
        super();
    }

    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsufficientFundsException(Throwable cause) {
        super(cause);
    }
}
