package com.aldaviva.easter4j;

import com.aldaviva.easter4j.test.AbstractEaster4JTest;
import com.aldaviva.easter4j.test.TestDates;

import java.time.LocalDate;

public class Jdk8Easter4JTest extends AbstractEaster4JTest<LocalDate> {

    @Override
    protected LocalDate getActual(int year) {
        return Easter4J.getEaster(year);
    }

    @Override
    protected LocalDate getExpected(TestDates.TestDate expectation) {
        return LocalDate.of(expectation.getYear(), expectation.getMonth(), expectation.getDay());
    }
}
