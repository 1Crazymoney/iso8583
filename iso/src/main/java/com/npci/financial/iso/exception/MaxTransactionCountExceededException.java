package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class MaxTransactionCountExceededException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.MAX_TRANSACTION_COUNT_EXCEEDED;
    }

    public MaxTransactionCountExceededException() {
        super();
    }

    public MaxTransactionCountExceededException(String message) {
        super(message);
    }

    public MaxTransactionCountExceededException(String message, Throwable cause) {
        super(message, cause);
    }

    public MaxTransactionCountExceededException(Throwable cause) {
        super(cause);
    }
}
