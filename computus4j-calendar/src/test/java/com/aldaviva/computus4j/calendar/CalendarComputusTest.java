package com.aldaviva.computus4j.calendar;

import com.aldaviva.computus4j.IComputus;
import com.aldaviva.computus4j.test.AbstractComputusTest;
import com.aldaviva.computus4j.test.TestDates;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.testng.Assert.assertEquals;

public class CalendarComputusTest extends AbstractComputusTest<Calendar> {

    private final IComputus<Calendar> computus = new Computus();

    @Override
    protected Calendar getActual(int year) {
        return computus.getEaster(year);
    }

    @Override
    protected Calendar getExpected(TestDates.TestDate expectation) {
        return new GregorianCalendar(expectation.getYear(), expectation.getMonth() - 1, expectation.getDay());
    }
}
