package com.aldaviva.computus4j.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public abstract class AbstractComputusTest<DateType> {

    protected abstract DateType getActual(int year);

    protected abstract DateType getExpected(TestDates.TestDate expectation);

    @Test(dataProvider = "dataProvider")
    public void isCorrectJodaDateReturned(final TestDates.TestDate expectation) {
        final DateType actual = getActual(expectation.getYear());
        final DateType expected = getExpected(expectation);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "dataProvider")
    public Object[][] dataProvider() {
        return TestDates.provideTestDateData();
    }
}
