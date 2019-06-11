package com.itv.talentpaymentskata;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

public class DayRatePaymentBehaviourTest {

    private DayRatePaymentBehaviour dayRatePaymentBehaviour;

    @Before
    public void setUp() {
        dayRatePaymentBehaviour = new DayRatePaymentBehaviour();
    }

    @Test
    public void test_simplePayment() {
        BigDecimal expected = BigDecimal.valueOf(100);

        BigDecimal actual = dayRatePaymentBehaviour.calculateDayPayment(TalentRate.ACTOR, 6);

        assertEquals(0, expected.compareTo(actual));
    }

    @Test
    public void test_overtimePayment() {
        BigDecimal expected = BigDecimal.valueOf(180);

        BigDecimal actual = dayRatePaymentBehaviour.calculateDayPayment(TalentRate.STUNTMAN, 9);

        assertEquals(0, expected.compareTo(actual));
    }

    @Test
    public void test_zeroPayment() {
        BigDecimal expected = BigDecimal.valueOf(0);

        BigDecimal actual = dayRatePaymentBehaviour.calculateDayPayment(TalentRate.WRITER, 0);

        assertEquals(0, expected.compareTo(actual));
    }
}