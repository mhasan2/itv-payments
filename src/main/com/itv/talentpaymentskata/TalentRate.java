package com.itv.talentpaymentskata;

import java.math.BigDecimal;

public enum TalentRate {
    ACTOR(100),
    STUNTMAN(120),
    WRITER(140);

    private BigDecimal dayRate;

    public BigDecimal getDayRate() {
        return dayRate;
    }

    TalentRate(long dayRate) {
        this.dayRate = BigDecimal.valueOf(dayRate);
    }
}
