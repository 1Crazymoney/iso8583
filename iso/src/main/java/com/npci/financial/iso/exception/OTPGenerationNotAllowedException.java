package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class OTPGenerationNotAllowedException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.OTP_GENERATION_NOT_ALLOWED
        ;
    }

    public OTPGenerationNotAllowedException() {
        super();
    }

    public OTPGenerationNotAllowedException(String message) {
        super(message);
    }

    public OTPGenerationNotAllowedException(String message, Throwable cause) {
        super(message, cause);
    }

    public OTPGenerationNotAllowedException(Throwable cause) {
        super(cause);
    }
}
