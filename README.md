# ITV Interview Coding Exercise

This kata is intended to be used as part of the ITV recruitment process for engineers.

## The Requirement

We are building a system to pay the talent that work on our productions. Your team 
leader has asked you to write the calculation engine. This will take in a timesheet 
(in the form of a comma-separated string) detailing what days a talent has worked 
that week, what they were doing, and for how long. An example can be found in
[example-timesheet.csv](src/main/resources/example-timesheet.csv).
The engine must calculate how much the talent should get paid for that week, based 
on the following rules:
* The day rate for an Actor is £100
* The day rate for a Stuntman is £120
* The day rate for a Writer is £140
* We don’t pay partial days, so even if they only turn up for one hour they still 
  get paid the full day rate amount
* However, if they work more than 8 hours in a day they are entitled to overtime, and
  are paid 1.5 times their normal day rate

## Your solution

We’re not looking for a full-blown service, or the use of any frameworks. Your 
solution can be implemented in plain old Java, by implementing the
[PaymentCalculator](src/main/java/com/itv/talentpaymentskata/PaymentCalculator.java) 
interface. 

Please create your own branch and raise a pull request once complete. Note that it
must be possible to run your implementation from a unit test - we will be running a
test suite against it.

As a rough guide, we recommend spending around 2 hours on your solution. There is no
need for perfection - but feel free to add comments where you feel you would have 
liked to spend more time. If we invite you in for a face-to-face interview you will 
be given an opportunity to talk through what you would have improved and how.
