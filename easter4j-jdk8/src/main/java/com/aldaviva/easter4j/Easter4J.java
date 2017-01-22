package com.aldaviva.easter4j;

import com.aldaviva.easter4j.computus.IanTaylorComputus;

import java.time.LocalDate;

/**
 * Figure out, for a given year, when Easter occurs.
 * Returns JDK8 {@link java.time.LocalDate} instances.
 *
 * <h3>Usage</h3>
 * <pre>
 * Easter4J.{@link #getEaster(int) getEaster}(2016);</pre>
 *
 * @see IanTaylorComputus IanTaylorComputus for the underlying implementation
 */
public class Easter4J extends Easter4JBase {

    private Easter4J(){}

    /**
     * Figure out, for a given year, when Easter occurs.
     *
     * <h3>Usage</h3>
     * <pre>
     * LocalDate easter = Easter4J.getEaster(2016);
     * assert easter.getMonth() == 3;
     * assert easter.getDayOfMonth() == 27;</pre>
     *
     * @param year Non-negative integer representing the Gregorian year <em>e.g.</em> <code>2016</code>.
     * @return JDK8 {@link java.time.LocalDate} for the day that Easter occurs on the given year
     * @throws IllegalArgumentException if {@code year} is negative
     */
    public static LocalDate getEaster(final int year) {
        final int dayOfMarch = getEasterAsDayOfMarch(year);
        return LocalDate.of(year, 3, 1).plusDays(dayOfMarch - 1);
    }
}
