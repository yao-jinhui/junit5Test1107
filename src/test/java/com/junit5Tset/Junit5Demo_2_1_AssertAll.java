package com.junit5Tset;

import com.util.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Junit5Demo_2_1_AssertAll {
    @Test
    @Order(1)
    public void addTest(){
        int result01 = Calculator.add(4,2);
        System.out.println(result01);

        int result02 = Calculator.add(5,2);
        System.out.println(result02);

        int result03 = Calculator.add(6,2);
        System.out.println(result03);

        assertAll("计算结果校验",
                ()-> assertEquals(6,result01,"实际值与期望值结果不符！"),
                ()-> assertEquals(6,result02,"实际值与期望值结果不符！"),
                ()-> assertEquals(7,result03,"实际值与期望值结果不符！")
        );
    }
    @Test
    public void subTractTest(){
        int result = Calculator.subtract(4,2);
        System.out.println(result);
        assertEquals(2,result);

    }
    @Test
    @Order(2)
    public void multiplyTest(){
        int result = Calculator.multiply(4,2);
        System.out.println(result);
        assertEquals(8,result);

    }
    @Test
    @Order(3)
    public void divideTest(){
        int result = Calculator.divide(4,2);
        System.out.println(result);
        assertEquals(2,result);

    }
    @BeforeEach
    public void clear(){
        Calculator.clear();
    }
    @Test
    @Order(5)
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
        assertEquals(4,result);
    }
}
