package com.itv.talentpaymentskata;


import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DayRatePaymentCalculatorTest {

    private DayRatePaymentCalculator paymentCalculator;

    @Before
    public void setup() {
        paymentCalculator = new DayRatePaymentCalculator();
    }

    @Test
    public void test_singlePayment() {
        String timesheet = "13/05/2019,Actor,5";
        BigDecimal expected = BigDecimal.valueOf(100);

        BigDecimal actual = paymentCalculator.calculatePayment(timesheet);

        Assert.assertEquals(expected, actual);
    }
}