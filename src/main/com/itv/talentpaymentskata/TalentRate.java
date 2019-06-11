package com.itv.talentpaymentskata;

import java.math.BigDecimal;

public enum TalentRate {
    ACTOR(100),
    STUNTMAN(120),
    WRITER(140);

    private BigDecimal rate;

    public BigDecimal getRate() {
        return rate;
    }

    TalentRate(long rate) {
        this.rate = BigDecimal.valueOf(rate);
    }
}
