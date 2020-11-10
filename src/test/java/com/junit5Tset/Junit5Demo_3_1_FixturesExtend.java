package com.junit5Tset;

import org.junit.jupiter.api.*;

public class Junit5Demo_3_1_FixturesExtend {
    @BeforeAll
    public static void beforeChildAll(){
        System.out.println("Child beforeAll 执行！");
    }
    @AfterAll
    public static void afterChildAll(){
        System.out.println("Child afterAll 执行！");
    }
    @BeforeEach
    public void beforChildEach(){
        System.out.println("Child BeforeEach 执行！");
    }
    @AfterEach
    public void afterChildEach(){
        System.out.println("Child AfterEach 执行！");
    }
    @Test
    public void testChildMethod01() {
        System.out.println("Child testMethod01 执行！");
    }
    @Test
    public void testChildMethod02() {
        System.out.println("Child testMethod02 执行！");
    }
    @Test
    public void testChildMethod03() {
        System.out.println(" Child  testMethod03 执行！");
    }
}
