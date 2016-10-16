package com.aldaviva.computus4j;

import com.aldaviva.computus4j.algorithm.ComputusAlgorithm;
import com.aldaviva.computus4j.algorithm.IanTaylorComputusAlgorithm;

public class IanTaylorComputusAlgorithmTest extends ComputusAlgorithmTest {

    @Override
    public ComputusAlgorithm getComputus(){
        return new IanTaylorComputusAlgorithm();
    }
}
