package com.aldaviva.easter4j;

import com.aldaviva.easter4j.computus.IanTaylorComputus;

public abstract class Easter4JBase {

    protected static int getEasterAsDayOfMarch(int year){
        return IanTaylorComputus.INSTANCE.getEaster(year);
    }

}
