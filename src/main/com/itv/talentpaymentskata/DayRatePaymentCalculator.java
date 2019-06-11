package com.itv.talentpaymentskata;

import static java.lang.Integer.parseInt;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DayRatePaymentCalculator implements PaymentCalculator {

    @Override
    public BigDecimal calculatePayment(String timesheetContents) {
        if (timesheetContents.isBlank()) {
            return BigDecimal.ZERO;
        }


        List<String> days = Arrays.asList(timesheetContents.split("\n"));

        List<BigDecimal> dayPayments = days.stream().map(day->{
            String[] info  = day.split(",");
            return calculateDayPayment(TalentRate.valueOf(info[1].toUpperCase()), parseInt(info[2]));
        }).collect(Collectors.toList());

        return dayPayments.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
    }


    private BigDecimal calculateDayPayment(TalentRate rate, int hours) {
        if (hours > 8) {
            return rate.getRate().multiply(BigDecimal.valueOf(1.5));
        } else if (hours > 0) {
            return rate.getRate();
        }

        return BigDecimal.ZERO;
    }
}
