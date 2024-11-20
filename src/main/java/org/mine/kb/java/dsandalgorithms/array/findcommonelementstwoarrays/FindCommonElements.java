package org.mine.kb.java.dsandalgorithms.array.findcommonelementstwoarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * finding the common elements contained in two arrays, producing the intersection of the two inputs.
 */
public class FindCommonElements {
    public static void main(String[] args) {
        List<Integer> result;
        int[] numbers1 = new int[] { 66, 24, 75, 22, 24, 66 };
        int[] numbers2 = new int[] { 32, 66, 24, 66, 39, 24 };

        long start = System.currentTimeMillis();
        result = algorithm1(numbers1, numbers2);
        long end = System.currentTimeMillis();
        System.out.println("algorithm1 in: " + (end - start));
        System.out.println(result);

        start = System.currentTimeMillis();
        result = algorithm2(numbers1, numbers2);
        end = System.currentTimeMillis();
        System.out.println("algorithm2 in: " + (end - start));
        System.out.println(result);

        start = System.currentTimeMillis();
        result = algorithm3(numbers1, numbers2);
        end = System.currentTimeMillis();
        System.out.println("algorithm3 in: " + (end - start));
        System.out.println(result);
        System.err.println("Tests:");
        run();
    }

    private static void run() {
        final int MAXZIP = 99999;
        List<Integer> result;
        int[] sizes = new int[] { 10, 100, 1000, 10000, 100000/* , 1000000 */ };

        for (int sizei = 0; sizei < sizes.length; sizei++) {
            System.err.println("Trial for array size= " + sizes[sizei]);
            int[] numbers1 = new int[sizes[sizei]];
            int[] numbers2 = new int[sizes[sizei]];
            for (int i = 0; i < numbers1.length; i++) {
                numbers1[i] = (int) (Math.random() * (sizes[sizei] + 1));
            }
            for (int i = 0; i < numbers1.length; i++) {
                numbers2[i] = (int) (Math.random() * (sizes[sizei] + 1));
            }
            long start = System.currentTimeMillis();
            result = algorithm1(numbers1, numbers2);
            long end = System.currentTimeMillis();
            // System.err.println("algorithm1: avg time = "
            // + (end - start) + "ms"+", found = "+result.size());

            // System.out.println(result);

            start = System.currentTimeMillis();
            result = algorithm2(numbers1, numbers2);
            end = System.currentTimeMillis();
            System.err.println("algorithm2:  avg time = "
                    + (end - start) + "ms" + ", found = " + result.size());
            // System.out.println(result);

            start = System.currentTimeMillis();
            result = algorithm3(numbers1, numbers2);
            end = System.currentTimeMillis();
            System.err.println("algorithm3:  avg time = "
                    + (end - start) + "ms" + ", found = " + result.size());
            // System.out.println(result);
        }
    }

    /*
     * finding the common elements contained in two arrays (assuming no
     * duplicate values exist in each array), producing the intersection of the two
     * inputs.
     * a runtime complexity of O(mn) , where m and n are the sizes of the first and
     * second input arrays.
     * The amount of memory we use is dictated by the size of our result listed in
     * our method.
     * The bigger this list, the more memory we're using.
     * 
     * The best case is when we use the least amount of memory. This is when the
     * list is empty, that is, when we have no common elements between the two
     * arrays. Thus, this method has a best case space complexity of O(1), when
     * there is no intersection.
     * 
     * The worst case is just the opposite, when we have all the elements in both
     * arrays. This can happen when the arrays are equal to each other, although the
     * numbers may be in a different order. The memory in this case is equal to the
     * size of one of our input arrays. In short, the worst space complexity of the
     * method is O(n).
     */
    public static List<Integer> algorithm1(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>(a.length);
        for (int x : a) {
            for (int y : b) {
                if (x == y)
                    result.add(x);
            }
        }
        return result;
    }

    /*
     * 1. Assume that we have a way to sort the inputs in O(n log n). This is
     * provided
     * in the following method mergeSort
     * We can use this method to sort one input array, or both, and make the
     * intersection easier.
     * 2. To sort one input array, we can use a binary search on it. The runtime
     * complexity
     * is O(n log n) for the merge sort plus O(n log n) for the binary search
     * per item in the first list. This is nlog+ nlog n which results in a final O(n
     * log n).
     * 
     */
    public static List<Integer> algorithm2(int[] a, int[] b) {
        List<Integer> result = new LinkedList<>();
        mergeSort(b);
        for (int x : a) {
            if (binarySearch(x, b))
                result.add(x);
        }
        return result;
    }

    /*
     * 1. Sort both arrays, and have two pointers, one for each array.
     * 2. Go through the input arrays in a linear fashion.
     * 3. Advance a pointer if the other pointer is pointing to a larger value.
     * 4. If the values at both pointers are equal, both pointers are incremented.
     * The
     * runtime complexity for this algorithm is 2 * (n log n) for the two merge
     * sorts plus
     * the n for the linear pass after the sorting. This results in 2 * (n log n) +
     * n with a
     * final O(n log n).
     * 
     */
    public static List<Integer> algorithm3(int[] a, int[] b) {
        List<Integer> result = new LinkedList<>();
        mergeSort(a);
        mergeSort(b);
        int ptrA = 0, ptrB = 0;
        while (ptrA < a.length && ptrB < b.length) {
            if (a[ptrA] == b[ptrB]) {
                result.add(a[ptrA]);
                ptrA++;
                ptrB++;
            } else if (a[ptrA] > b[ptrB])
                ptrB++;
            else
                ptrA++;
        }
        return result;
    }

    public static boolean binarySearch(int x, int[] sortedNumbers) {
        int end = sortedNumbers.length - 1;
        int start = 0;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (sortedNumbers[mid] == x)
                return true;
            else if (sortedNumbers[mid] > x)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }

    private static void mergeSort(int[] input) {
        Arrays.sort(input);
    }
}
