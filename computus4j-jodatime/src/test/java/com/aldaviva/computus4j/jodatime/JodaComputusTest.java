package com.aldaviva.computus4j.jodatime;

import com.aldaviva.computus4j.test.AbstractComputusTest;
import com.aldaviva.computus4j.test.TestDates;
import org.joda.time.LocalDate;

public class JodaComputusTest extends AbstractComputusTest<LocalDate> {

    private Computus computus = new Computus();

    @Override
    protected LocalDate getActual(int year) {
        return computus.getEaster(year);
    }

    @Override
    protected LocalDate getExpected(TestDates.TestDate expectation) {
        return new LocalDate(expectation.getYear(), expectation.getMonth(), expectation.getDay());
    }
}
