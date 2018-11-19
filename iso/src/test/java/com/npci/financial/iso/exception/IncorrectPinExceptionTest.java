package com.npci.financial.iso.exception;

import com.npci.financial.iso.base.MasterTest;
import com.npci.financial.iso.localization.Localization;
import org.junit.Test;

public class IncorrectPinExceptionTest extends MasterTest implements Localization {

    @Test
    public void message() throws Exception {
        try {
            throw new SecurityViolationException("Security violation detected");
        } catch (FinancialTransactionException e) {
            print(e);
        }
    }

}