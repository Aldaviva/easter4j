package com.aldaviva.easter4j;

import com.aldaviva.easter4j.test.AbstractEaster4JTest;
import com.aldaviva.easter4j.test.TestDates;
import org.joda.time.LocalDate;

public class JodaEaster4JTest extends AbstractEaster4JTest<LocalDate> {

    protected LocalDate getActual(int year) {
        return Easter4J.getEaster(year);
    }

    protected LocalDate getExpected(TestDates.TestDate expectation) {
        return new LocalDate(expectation.getYear(), expectation.getMonth(), expectation.getDay());
    }
}
