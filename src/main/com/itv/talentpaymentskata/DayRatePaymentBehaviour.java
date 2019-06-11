package com.itv.talentpaymentskata;

import java.math.BigDecimal;

public class DayRatePaymentBehaviour implements PaymentBehaviour {

    @Override
    public BigDecimal calculateDayPayment(TalentRate rate, int hoursWorked) {
        if (hoursWorked > 8) {
            return rate.getDayRate().multiply(BigDecimal.valueOf(1.5));
        } else if (hoursWorked > 0) {
            return rate.getDayRate();
        }

        return BigDecimal.ZERO;
    }
}
