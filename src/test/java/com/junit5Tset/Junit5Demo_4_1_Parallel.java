package com.junit5Tset;

import com.util.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Junit5Demo_4_1_Parallel {
    @RepeatedTest(10)
    @Execution(ExecutionMode.CONCURRENT)
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        System.out.println(result);
    }
    @RepeatedTest(10)
    public void countSynTest() throws InterruptedException {
        int result = Calculator.synCount(1);
        System.out.println(result);
    }
}
