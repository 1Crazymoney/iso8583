package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class FraudTransactionException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.FRAUD_TRANSACTION;
    }

    public FraudTransactionException() {
        super();
    }

    public FraudTransactionException(String message) {
        super(message);
    }

    public FraudTransactionException(String message, Throwable cause) {
        super(message, cause);
    }

    public FraudTransactionException(Throwable cause) {
        super(cause);
    }
}
