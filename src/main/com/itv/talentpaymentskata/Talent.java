package com.itv.talentpaymentskata;

import java.math.BigDecimal;

public class Talent {

    private PaymentBehaviour paymentBehaviour;

    private TalentRate rate;

    Talent(PaymentBehaviour paymentBehaviour, TalentRate rate) {
        this.paymentBehaviour = paymentBehaviour;
        this.rate = rate;
    }

    /**
     * Method to calculate the money owed to talent for a days work
     * @param hoursWorked the {@code int} number of hours the talent worked in the day
     * @return the {@code BigDecimal} money owed
     */
    public BigDecimal calculateDayPayment(int hoursWorked) {
        return paymentBehaviour.calculateDayPayment(rate, hoursWorked);
    }
}
