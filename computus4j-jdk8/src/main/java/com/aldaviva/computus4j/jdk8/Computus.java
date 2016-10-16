package com.aldaviva.computus4j.jdk8;

import com.aldaviva.computus4j.AbstractComputus;
import com.aldaviva.computus4j.algorithm.IanTaylorComputusAlgorithm;

import java.time.LocalDate;

/**
 * Figure out, for a given year, when Easter occurs.
 * Returns JDK8 {@link java.time.LocalDate} instances.
 *
 * <h3>Usage</h3>
 * <pre>
 * new Computus().{@link #getEaster(int) getEaster}(2016);</pre>
 *
 * <h3>Lifecycle</h3>
 * You can create an instance (or multiple instances) of {@code Computus} and hold on to them for as long as you want.
 * Instances are stateless, thread-safe, and do not take a lot of time or memory to create.
 *
 * @see IanTaylorComputusAlgorithm IanTaylorComputusAlgorithm for the underlying implementation
 */
public class Computus extends AbstractComputus<LocalDate> {

    /**
     * Figure out, for a given year, when Easter occurs.
     *
     * <h3>Usage</h3>
     * <pre>
     * LocalDate easter = new Computus().getEaster(2016);
     * assert easter.getMonth() == 3;
     * assert easter.getDayOfMonth() == 27;</pre>
     *
     * @param year Non-negative integer representing the Gregorian year <em>e.g.</em> <code>2016</code>.
     * @return JDK8 {@link java.time.LocalDate} for the day that Easter occurs on the given year
     * @throws IllegalArgumentException if {@code year} is negative
     */
    @Override
    public LocalDate getEaster(final int year) {
        final int dayOfMarch = computusAlgorithm.getEaster(year);
        return LocalDate.of(year, 3, 1).plusDays(dayOfMarch - 1);
    }
}
