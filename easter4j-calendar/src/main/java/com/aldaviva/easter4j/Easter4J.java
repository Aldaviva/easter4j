package com.aldaviva.easter4j;

import com.aldaviva.easter4j.computus.IanTaylorComputus;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Figure out, for a given year, when Easter occurs.
 * Returns JDK1.1 {@link java.util.Calendar} instances.
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
     * Calendar easter = Easter4J.getEaster(2016);
     * assert easter.get(Calendar.MONTH) == Calendar.MARCH;
     * assert easter.get(Calendar.DAY_OF_MONTH) == 27;</pre>
     *
     * You can also get the result as a {@link java.util.Date} with
     * <pre>
     * Date easter = Easter4J.getEaster(2016).getTime();</pre>
     *
     * @param year Non-negative integer representing the Gregorian year <em>e.g.</em> <code>2016</code>.
     * @return JDK1.1 {@link java.util.Calendar} for the day that Easter occurs on the given year
     * @throws IllegalArgumentException if {@code year} is negative
     */
    public static Calendar getEaster(final int year) {
        final int dayOfMarch = getEasterAsDayOfMarch(year);
        final Calendar easter = new GregorianCalendar(year, Calendar.MARCH, 1);
        easter.add(Calendar.DAY_OF_YEAR, dayOfMarch - 1);
        return easter;
    }
}
