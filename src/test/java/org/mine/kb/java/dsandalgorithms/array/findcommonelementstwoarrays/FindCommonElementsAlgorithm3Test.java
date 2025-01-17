package org.mine.kb.java.dsandalgorithms.array.findcommonelementstwoarrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FindCommonElementsAlgorithm3Test {
    @Test
    public void testInterstection() {
        int[] numbers1 = new int[] { 66, 24, 75, 22, 12, 87 };
        int[] numbers2 = new int[] { 32, 41, 98, 66, 39, 24 };

        List<Integer> result = FindCommonElements.algorithm3(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(66, 24);

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    @Test
    public void testFullInterstection() {
        int[] numbers1 = new int[] { 66, 24, 75, 22, 12, 87 };
        int[] numbers2 = new int[] { 66, 24, 75, 22, 12, 87 };

        List<Integer> result = FindCommonElements.algorithm3(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(66, 24, 75, 22, 12, 87);

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    @Test
    public void testEqualInterstection() {
        int[] numbers1 = new int[] { 2, 2, 2, 2 };
        int[] numbers2 = new int[] { 2, 2, 2, 2 };

        List<Integer> result = FindCommonElements.algorithm3(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(2, 2, 2, 2);

        assertEquals(expected, result);
    }

    @Test
    public void testEmptyInterstection() {
        int[] numbers1 = new int[] { 2, 4, 1, 3, 5 };
        int[] numbers2 = new int[] { 7, 6, 9, 0, 8 };

        List<Integer> result = FindCommonElements.algorithm3(numbers1, numbers2);

        List<Integer> expected = Arrays.asList();

        assertEquals(expected, result);
    }
}
