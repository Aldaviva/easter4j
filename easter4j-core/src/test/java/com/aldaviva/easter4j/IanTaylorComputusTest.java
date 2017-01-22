package com.aldaviva.easter4j;

import com.aldaviva.easter4j.computus.Computus;
import com.aldaviva.easter4j.computus.IanTaylorComputus;

public class IanTaylorComputusTest extends ComputusTest {

    @Override
    public Computus getComputus(){
        return IanTaylorComputus.INSTANCE;
    }
}
