package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class CardNotActiveException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.CARD_NOT_ACTIVE;
    }

    public CardNotActiveException() {
        super();
    }

    public CardNotActiveException(String message) {
        super(message);
    }

    public CardNotActiveException(String message, Throwable cause) {
        super(message, cause);
    }

    public CardNotActiveException(Throwable cause) {
        super(cause);
    }
}
