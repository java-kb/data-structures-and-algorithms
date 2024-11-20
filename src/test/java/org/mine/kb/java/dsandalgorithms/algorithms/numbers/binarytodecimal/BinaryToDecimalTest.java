package org.mine.kb.java.dsandalgorithms.algorithms.numbers.binarytodecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryToDecimalTest {
    @Test
    void testAlgorithm1() {
        int decimal = BinaryToDecimal.algorithm1("10110");
        assertEquals(22, decimal);
    }
    @Test
    void testAlgorithm2() {
        int decimal = BinaryToDecimal.algorithm2("10110");
        assertEquals(22, decimal);
    }
}
