package com.itv.talentpaymentskata;

import static java.lang.Integer.parseInt;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DayPaymentCalculator implements PaymentCalculator {

    @Override
    public BigDecimal calculatePayment(String timesheetContents) {
        if (timesheetContents.isBlank()) {
            return BigDecimal.ZERO;
        }


        List<String> days = Arrays.asList(timesheetContents.split("\n"));

        List<BigDecimal> dayPayments = days.stream().map(day->{
            String[] info  = day.split(",");
            Talent talent = TalentFactory.getTalent(info[1]);
            return talent.calculateDayPayment(parseInt(info[2]));
        }).collect(Collectors.toList());

        return dayPayments.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
