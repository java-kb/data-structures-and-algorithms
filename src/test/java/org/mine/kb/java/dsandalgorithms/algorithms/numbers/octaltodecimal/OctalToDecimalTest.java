package org.mine.kb.java.dsandalgorithms.algorithms.numbers.octaltodecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OctalToDecimalTest {
    @Test
    public void testZeroOctal() {
        assertEquals(OctalToDecimal.algorithm1("0"), 0);
    }

    @Test
    public void testOneOctal() {
        assertEquals(OctalToDecimal.algorithm1("1"), 1);
    }

    @Test
    public void testFiveOctal() {
        assertEquals(OctalToDecimal.algorithm1("5"), 5);
    }

    @Test
    public void test17Octal() {
        assertEquals(OctalToDecimal.algorithm1("17"), 15);
    }

    @Test
    public void test72625Octal() {
        assertEquals(OctalToDecimal.algorithm1("72625"), 30101);
    }

    @Test
    public void test55142Octal() {
        assertEquals(OctalToDecimal.algorithm1("55142"), 23138);
    }

    @Test
    public void testZeroOctal1() {
        assertEquals(OctalToDecimal.algorithm2("0"), 0);
    }

    @Test
    public void testOneOctal1() {
        assertEquals(OctalToDecimal.algorithm2("1"), 1);
    }

    @Test
    public void testFiveOctal1() {
        assertEquals(OctalToDecimal.algorithm2("5"), 5);
    }

    @Test
    public void test17Octal1() {
        assertEquals(OctalToDecimal.algorithm2("17"), 15);
    }

    @Test
    public void test72625Octal1() {
        assertEquals(OctalToDecimal.algorithm2("72625"), 30101);
    }

    @Test
    public void test55142Octal1() {
        assertEquals(OctalToDecimal.algorithm2("55142"), 23138);
    }
}
