package com.aldaviva.computus4j.calendar;

import com.aldaviva.computus4j.AbstractComputus;
import com.aldaviva.computus4j.algorithm.IanTaylorComputusAlgorithm;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Figure out, for a given year, when Easter occurs.
 * Returns JDK1.1 {@link java.util.Calendar} instances.
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
public class Computus extends AbstractComputus<Calendar> {

    /**
     * Figure out, for a given year, when Easter occurs.
     *
     * <h3>Usage</h3>
     * <pre>
     * Calendar easter = new Computus().getEaster(2016);
     * assert easter.get(Calendar.MONTH) == Calendar.MARCH;
     * assert easter.get(Calendar.DAY_OF_MONTH) == 27;</pre>
     *
     * @param year Non-negative integer representing the Gregorian year <em>e.g.</em> <code>2016</code>.
     * @return JDK1.1 {@link java.util.Calendar} for the day that Easter occurs on the given year
     * @throws IllegalArgumentException if {@code year} is negative
     */
    @Override
    public Calendar getEaster(final int year) {
        final int dayOfMarch = computusAlgorithm.getEaster(year);
        final Calendar easter = new GregorianCalendar(year, Calendar.MARCH, 1);
        easter.add(Calendar.DAY_OF_YEAR, dayOfMarch - 1);
        return easter;
    }
}
