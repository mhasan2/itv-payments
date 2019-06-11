package com.itv.talentpaymentskata;

import java.math.BigDecimal;

public interface PaymentBehaviour {

    /**
     * Method to calculate the money owed to talent for a days work
     * @param rate the {@code TalentRate} used to calculate money owed
     * @param hoursWorked the {@code int} number of hours worked
     * @return the {@code BigDecimal} money owed
     */
    BigDecimal calculateDayPayment(TalentRate rate, int hoursWorked);
}
