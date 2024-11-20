package org.mine.kb.java.dsandalgorithms.array.findcommonelementstwoarrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FindCommonElementsAlgorithm1Test {
    /*
     * The best case is when we use the least amount of memory. This is when the
     * list is empty,
     * that is, when we have no common elements between the two arrays. Thus, this
     * method has
     * a best case space complexity of O(1), when there is no intersection.
     * 
     */
    @Test
    void testAlgorithm1BestCaseSpaceComplexity() {
        int[] numbers1 = new int[] { 1, 9, 3, 4 };
        int[] numbers2 = new int[] { 5, 6, 7, 8 };

        long start = System.currentTimeMillis();
        List<Integer> common = FindCommonElements.algorithm1(numbers1, numbers2);
        long end = System.currentTimeMillis();

        System.out.println("testAlgorithm1BestCaseSpaceComplexity in: " + (end - start));

        assertEquals(common.size(), 0);
    }

    /*
     * The worst case is just the opposite, when we have all the elements in both
     * arrays. This can
     * happen when the arrays are equal to each other, although the numbers may be
     * in a
     * different order. The memory in this case is equal to the size of one of our
     * input arrays. In
     * short, the worst space complexity of the method is O(n).
     * 
     */
    @Test
    void testAlgorithm1WorstCaseSpaceComplexity() {
        int[] numbers1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] numbers2 = new int[] { 8, 7, 6, 5, 4, 3, 2, 1 };

        long start = System.currentTimeMillis();
        List<Integer> common = FindCommonElements.algorithm1(numbers1, numbers2);
        long end = System.currentTimeMillis();
        System.out.println("testAlgorithm1WorstCaseSpaceComplexity in: " + (end - start));

        assertEquals(common.size(), 8);
    }
     @Test
    public void testInterstection() {
        int[] numbers1 = new int[] { 66, 24, 75, 22, 12, 87 };
        int[] numbers2 = new int[] { 32, 41, 98, 66, 39, 24 };

        List<Integer> result = FindCommonElements.algorithm1(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(66, 24);

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    @Test
    public void testFullInterstection() {
        int[] numbers1 = new int[] { 66, 24, 75, 22, 12, 87 };
        int[] numbers2 = new int[] { 66, 24, 75, 22, 12, 87 };

        List<Integer> result = FindCommonElements.algorithm1(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(66, 24, 75, 22, 12, 87);

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    // @Test
    // public void testEqualInterstection() {
    //     int[] numbers1 = new int[] { 2, 2, 2, 2 };
    //     int[] numbers2 = new int[] { 2, 2, 2, 2 };

    //     List<Integer> result = FindCommonElements.algorithm1(numbers1, numbers2);

    //     List<Integer> expected = Arrays.asList(2, 2, 2, 2);

    //     assertEquals(expected, result);
    // }

    @Test
    public void testEmptyInterstection() {
        int[] numbers1 = new int[] { 2, 4, 1, 3, 5 };
        int[] numbers2 = new int[] { 7, 6, 9, 0, 8 };

        List<Integer> result = FindCommonElements.algorithm1(numbers1, numbers2);

        List<Integer> expected = Arrays.asList();

        assertEquals(expected, result);
    }
}
