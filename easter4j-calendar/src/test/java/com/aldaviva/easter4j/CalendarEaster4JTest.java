package com.aldaviva.easter4j;

import com.aldaviva.easter4j.test.AbstractEaster4JTest;
import com.aldaviva.easter4j.test.TestDates;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEaster4JTest extends AbstractEaster4JTest<Calendar> {

    @Override
    protected Calendar getActual(int year) {
        return Easter4J.getEaster(year);
    }

    @Override
    protected Calendar getExpected(TestDates.TestDate expectation) {
        return new GregorianCalendar(expectation.getYear(), expectation.getMonth() - 1, expectation.getDay());
    }
}
