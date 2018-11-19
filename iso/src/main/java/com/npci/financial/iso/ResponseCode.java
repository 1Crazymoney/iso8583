package com.npci.financial.iso;

public enum ResponseCode {


    EXPIRED_CARD(1001, 54, 101, 1001, false){
        /**
         *Restricted card (for example, in country exclusion table)
         * @return
         */
        @Override
        public String getDescription() {
            return "expired.card";
        }
    },
    FRAUD_TRANSACTION(1002, 59, 102, 1002, false) {
        /**
         *
         * @return
         */
        @Override
        public String getDescription() {
            return "fraud.transaction";
        }
    },
    RESTRICTED_CARD(1004, 62, 104, 1004, false) {
        /**
         *
         * @return
         */
        @Override
        public String getDescription() {
            return "restricted.card";
        }
    },
    MAX_PIN_RETRY_EXCEEDED(1006, 75, 106, 1006, false) {
        /**
         * 	Allowable number of PIN-entry tries exceeded
         * @return
         */
        @Override
        public String getDescription() {
            return "max.pin.retry.exceeded";
        }
    },
    INVALID_AMOUNT(1010, 13, 110, 1010, false) {
        /**
         * Invalid amount (currency conversion field overflow) or amount exceeds maximum for card program
         * @return
         */
        @Override
        public String getDescription() {
            return "invalid.amount";
        }
    },
    INVALID_CARD_NUMBER(1011, 14, 111, 1011, false) {
        /**
         * Invalid account number (no such number)
         * @return
         */
        @Override
        public String getDescription() {
            return "invalid.card.number";
        }
    },
    INVALID_PAYMENT_ID(1014, 44, 114, 1014, false) {
        /**
         *
         * @return
         */
        @Override
        public String getDescription() {
            return "invalid.payment.id";
        }
    },
    INSUFFICIENT_FUNDS(1016, 51, 116, 1016, false) {
        /**
         *
         * @return
         */
        @Override
        public String getDescription() {
            return "insufficient.funds";
        }
    },
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
    TRANSACTION_NOT_ALLOWED_TO_CARDHOLDER(1019, 57, 119, 1019, false) {
        /**
         *
         * @return
         */
        @Override
        public String getDescription() {
            return "transaction.not.allowed.to.cardholder";
        }
    },
    TRANSACTION_NOT_ALLOWED_TO_TERMINAL(1020, 58, 120, 1020, false) {
        /**
         *
         * @return
         */
        @Override
        public String getDescription() {
            return "transaction.not.allowed.to.terminal";
        }
    },
    AMOUNT_EXCEEDED(1021, 61, 121, 1021, false) {
        /**
         * 	Activity amount limit exceeded
         * @return
         */
        @Override
        public String getDescription() {
            return "amount.exceeded";
        }
    },
    SECURITY_VIOLATION(1022, 63, 122, 1022, false) {
        /**
         *
         * @return
         */
        @Override
        public String getDescription() {
            return "security.violation";
        }
    },
    MAX_TRANSACTION_COUNT_EXCEEDED(1023, 65, 123, 1023, false) {
        /**
         *
         * @return
         */
        @Override
        public String getDescription() {
            return "max.transaction.count.exceeded";
        }
    },
    CARD_NOT_ACTIVE(1025, 78, 125, 1025, false) {
        /**
         * ’Blocked, first used’—The transaction is from a new cardholder, and the card has not been properly unblocked.
         * @return
         */
        @Override
        public String getDescription() {
            return "card.not.active";
        }
    };

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
