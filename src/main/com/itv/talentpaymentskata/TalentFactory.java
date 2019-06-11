package com.itv.talentpaymentskata;

public class TalentFactory {

    /**
     * Method to create appropriate {@code Talent} objects for work done
     * @param job the {@code String} detailing the work the talent did
     * @return the appropriate {@code Talent} object
     */
    public static Talent getTalent(String job) {
        return new Talent(new DayRatePaymentBehaviour(), TalentRate.valueOf(job.toUpperCase()));
    }
}
