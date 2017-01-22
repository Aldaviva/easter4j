package com.aldaviva.easter4j.computus;

/**
 * Algorithm by Ian Taylor<br>
 * Source: <a href="http://chilliant.blogspot.com/2010/12/computus-1.html">Computus 1</a>
 *
 * <h3>Works Cited</h3>
 * Taylor, Ian. "Computus 1." Blog. <em>chilliant.</em> Blogger, 10 Dec. 2010. Web. 16 Oct. 2016.
 */
public class IanTaylorComputus implements Computus {

    public static final IanTaylorComputus INSTANCE = new IanTaylorComputus();

    private IanTaylorComputus(){}

    public int getEaster(final int year) {
        if(year < 0){
            throw new IllegalArgumentException("getEaster: year must be non-negative, but was called with year = " + year);
        }

        final int a = year % 19;
        final int b = year >> 2;
        final int c = b / 25 + 1;
        final int d = (c * 3) >> 2;
        int e = ((a * 19) - ((c * 8 + 5) / 25) + d + 15) % 30;
        e += (29578 - a - e * 32) >> 10;
        e -= ((year % 7) + b - d + e + 2) % 7;
        return e;
    }
}
