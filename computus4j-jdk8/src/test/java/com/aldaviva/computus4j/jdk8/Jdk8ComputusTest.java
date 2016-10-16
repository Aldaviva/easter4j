package com.aldaviva.computus4j.jdk8;

import com.aldaviva.computus4j.test.AbstractComputusTest;
import com.aldaviva.computus4j.test.TestDates;

import java.time.LocalDate;

public class Jdk8ComputusTest extends AbstractComputusTest<LocalDate> {

    private final Computus computus = new Computus();

    @Override
    protected LocalDate getActual(int year) {
        return computus.getEaster(year);
    }

    @Override
    protected LocalDate getExpected(TestDates.TestDate expectation) {
        return LocalDate.of(expectation.getYear(), expectation.getMonth(), expectation.getDay());
    }
}
