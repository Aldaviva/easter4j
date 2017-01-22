package com.aldaviva.easter4j.computus;

public interface Computus {

    /**
     * When does Easter happen in a given year?
     * @param year Which year do you want to know about Easter? <em>e.g.</em> 2016
     * @return the day of March. 1 = March 1st, 2 = March 2nd, 31 = March 31st, 32 = April 1st, 33 = April 2nd, et cetera.
     */
    int getEaster(int year) throws IllegalArgumentException;
}
