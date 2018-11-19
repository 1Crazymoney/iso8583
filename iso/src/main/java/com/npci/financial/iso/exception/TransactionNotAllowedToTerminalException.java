package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class TransactionNotAllowedToTerminalException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.TRANSACTION_NOT_ALLOWED_TO_TERMINAL;
    }

    public TransactionNotAllowedToTerminalException() {
        super();
    }

    public TransactionNotAllowedToTerminalException(String message) {
        super(message);
    }

    public TransactionNotAllowedToTerminalException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransactionNotAllowedToTerminalException(Throwable cause) {
        super(cause);
    }
}
