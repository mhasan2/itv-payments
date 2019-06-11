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

        Assert.assertEquals(0, expected.compareTo(actual));
    }

    @Test
    public void test_singlePaymentWithOvertime() {
        String timesheet = "13/05/2019,Stuntman,9";
        BigDecimal expected = BigDecimal.valueOf(180);

        BigDecimal actual = paymentCalculator.calculatePayment(timesheet);

        Assert.assertEquals(0, expected.compareTo(actual));
    }

    @Test
    public void test_multiplePayments() {
        String timesheet = "13/05/2019,Actor,5\n"
                + "14/05/2019,Writer,8\n"
                + "16/05/2019,Actor,7\n"
                + "17/05/2019,Actor,6";
        BigDecimal expected = BigDecimal.valueOf(440);

        BigDecimal actual = paymentCalculator.calculatePayment(timesheet);

        Assert.assertEquals(0, expected.compareTo(actual));
    }

    @Test
    public void test_multiplePaymentsWithOvertime() {
        String timesheet = "13/05/2019,Actor,5\n"
                + "14/05/2019,Writer,9\n"
                + "16/05/2019,Actor,7\n"
                + "17/05/2019,Actor,10";
        BigDecimal expected = BigDecimal.valueOf(560);

        BigDecimal actual = paymentCalculator.calculatePayment(timesheet);

        Assert.assertEquals(0, expected.compareTo(actual));
    }

    @Test
    public void test_noPayments() {
        String timesheet = "";
        BigDecimal expected = BigDecimal.ZERO;

        BigDecimal actual = paymentCalculator.calculatePayment(timesheet);

        Assert.assertEquals(0, expected.compareTo(actual));
    }
}