package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public abstract class FinancialTransactionException extends RuntimeException {

public abstract ResponseCode getResponseCode();

    public FinancialTransactionException() {
        super();
    }

    public FinancialTransactionException(String message) {
        super(message);
    }

    public FinancialTransactionException(String message, Throwable cause) {
        super(message, cause);
    }

    public FinancialTransactionException(Throwable cause) {
        super(cause);
    }
}
