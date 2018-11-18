package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class FruadTransactionException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.FRUAD_TRANSACTION;
    }

    public FruadTransactionException() {
        super();
    }

    public FruadTransactionException(String message) {
        super(message);
    }

    public FruadTransactionException(String message, Throwable cause) {
        super(message, cause);
    }

    public FruadTransactionException(Throwable cause) {
        super(cause);
    }
}
