package org.mine.kb.java.dsandalgorithms.array.checkingforduplicates;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CheckingForDuplicatesTest {
    @Test
    void testAlgorithm1BestCase() {
        int[] numbers = new int[] { 1, 1, 3, 4, 5, 6, 7, 8 };
        assertEquals(CheckingForDuplicates.algorithm1(numbers), true);
    }

    @Test
    void testAlgorithm1WorstCase() {
        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        assertEquals(CheckingForDuplicates.algorithm1(numbers), false);
    }
}
