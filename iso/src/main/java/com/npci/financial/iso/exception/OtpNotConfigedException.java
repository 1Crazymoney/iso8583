package com.npci.financial.iso.exception;

import com.npci.financial.iso.ResponseCode;

public class OtpNotConfigedException extends FinancialTransactionException {
    @Override
    public ResponseCode getResponseCode() {
        return ResponseCode.OTP_NOT_CONFIGED
        ;
    }

    public OtpNotConfigedException() {
        super();
    }

    public OtpNotConfigedException(String message) {
        super(message);
    }

    public OtpNotConfigedException(String message, Throwable cause) {
        super(message, cause);
    }

    public OtpNotConfigedException(Throwable cause) {
        super(cause);
    }
}
