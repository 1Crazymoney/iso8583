package com.npci.financial.iso.base;

import com.npci.financial.iso.exception.FinancialTransactionException;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public abstract class MasterTest {

    protected ResourceBundle root = ResourceBundle.getBundle("messages",
            new ResourceBundle.Control() {
                @Override
                public List<Locale> getCandidateLocales(String name, Locale locale) {
                    return Collections.singletonList(Locale.ROOT);
                }
            });

    protected ResourceBundle english = ResourceBundle.getBundle("messages", new Locale("en", "US"));

    protected ResourceBundle persian = ResourceBundle.getBundle("messages", new Locale("fa", "IR"));

    protected void print(FinancialTransactionException e) {
        System.out.println(String.format("%s: %s", "exception", e.getClass().getSimpleName()));
        System.out.println(String.format("%s: %s", "message", e.getMessage()));
        System.out.println(String.format("%s: %s", "default", root.getString(e.getResponseCode().getDescription())));
        System.out.println(String.format("%s: %s", "english", english.getString(e.getResponseCode().getDescription())));
        System.out.println(String.format("%s: %s", "persian", persian.getString(e.getResponseCode().getDescription())));
    }
}
