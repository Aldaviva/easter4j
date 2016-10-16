package com.aldaviva.computus4j;

import com.aldaviva.computus4j.algorithm.ComputusAlgorithm;
import com.aldaviva.computus4j.algorithm.IanTaylorComputusAlgorithm;

public abstract class AbstractComputus<DateType> implements IComputus<DateType> {

    protected final ComputusAlgorithm computusAlgorithm = new IanTaylorComputusAlgorithm();

}
