package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class TransactionNotAllowedToCardholderException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.TRANSACTION_NOT_ALLOWED_TO_CARDHOLDER;
    }

    public TransactionNotAllowedToCardholderException() {
        super();
    }

    public TransactionNotAllowedToCardholderException(String message) {
        super(message);
    }

    public TransactionNotAllowedToCardholderException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransactionNotAllowedToCardholderException(Throwable cause) {
        super(cause);
    }
}
