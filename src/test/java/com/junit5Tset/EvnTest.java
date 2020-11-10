package com.junit5Tset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvnTest {
    @Test
    void addTest() {
        assertEquals(  3, 2, "实际值与期望值结果不符！");
    }

}
