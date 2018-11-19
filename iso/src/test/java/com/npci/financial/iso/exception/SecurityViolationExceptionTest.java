package com.npci.financial.iso.exception;

import com.npci.financial.iso.base.MasterTest;
import com.npci.financial.iso.localization.Localization;
import org.junit.Test;

public class SecurityViolationExceptionTest extends MasterTest implements Localization {

    @Test
    public void message() throws Exception {
        try {
            throw new SecurityViolationException("The pin is incorrect");
        } catch (FinancialTransactionException e) {
            print(e);
        }
    }

}