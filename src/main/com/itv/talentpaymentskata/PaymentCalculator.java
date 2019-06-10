package com.itv.talentpaymentskata;

import java.math.BigDecimal;

/**
 * Please implement this interface.
 * <p>
 * The week's timesheet information will be presented in a comma-separated format, one row per day, and each row will have 3 columns:
 * date, the role being performed (Actor/Stuntman/Writer), and the number of hours worked
 * <p>
 * For example:
 * 13/05/2019,Actor,5
 * 14/05/2019,Writer,8
 * 16/05/2019,Actor,7
 * 17/05/2019,Actor,10
 * <p>
 * Note that there is no entry for 15/05/2019 as no hours were logged.
 * Assume the person will only be performing one role on a given day, i.e. they won't be both Actor and Writer
 */
public interface PaymentCalculator
{
	BigDecimal calculatePayment(final String timesheetContents);
}
