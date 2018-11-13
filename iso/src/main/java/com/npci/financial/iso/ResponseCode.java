package com.npci.financial.iso;

public enum ResponseCode {

    INCORRECT_PIN(1017, 55, 117, 1017, false) {
        /**
         *
         * @return
         */
        @Override
        public String getDescription() {
            return "incorrect.pin";
        }
    },
    INVALID_AMOUNT(1010, 13, 110, 1010, false) {
        /**
         * Invalid amount (currency conversion field overflow) or amount exceeds maximum for card program
         * @return
         */
        public String getDescription() {
            return "invalid.amount";
        }
    },;

    private final int value;
    private final int iso1987;
    private final int iso1993;
    private final int iso2003;
    private final boolean successful;
    private final String description;

    ResponseCode(int value, int iso1987, int iso1993, int iso2003, boolean successful) {
        this.value = value;
        this.iso1987 = iso1987;
        this.iso1993 = iso1993;
        this.iso2003 = iso2003;
        this.successful = successful;
        this.description = getDescription();
    }

    public abstract String getDescription();


}
