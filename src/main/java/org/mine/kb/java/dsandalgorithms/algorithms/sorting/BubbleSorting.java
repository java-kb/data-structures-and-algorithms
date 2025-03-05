package org.mine.kb.java.dsandalgorithms.algorithms.sorting;

import java.util.Arrays;

import org.mine.kb.java.dsandalgorithms.utils.ConsoleUtil;

public class BubbleSorting {
    public static void main(String[] args) {
        ConsoleUtil.Title("Original Sort");
        int[] numbers1 = new int[] { 4, 3, 2, 1 };

        ConsoleUtil.Title("Bubble Sort");
        sortSteps(numbers1);
        System.out.println(Arrays.toString(numbers1));

        numbers1 = new int[] { 1, 2, 3, 4 };
        sortSteps(numbers1);
        System.out.println(Arrays.toString(numbers1));

        numbers1 = new int[] { 3, 1, 2, 4 };
        sortSteps(numbers1);
        System.out.println(Arrays.toString(numbers1));

        ConsoleUtil.Title("Sort Imporvment 1");
        numbers1 = new int[] { 4, 3, 2, 1 };
        sortImprovement1Steps(numbers1);
        System.out.println(Arrays.toString(numbers1));

        numbers1 = new int[] { 1, 2, 3, 4 };
        sortImprovement1Steps(numbers1);
        System.out.println(Arrays.toString(numbers1));

        numbers1 = new int[] { 3, 1, 2, 4 };
        sortImprovement1Steps(numbers1);
        System.out.println(Arrays.toString(numbers1));

        ConsoleUtil.Title("Sort Imporvment 2");
        numbers1 = new int[] { 4, 3, 2, 1 };
        sortImprovement2Steps(numbers1);
        System.out.println(Arrays.toString(numbers1));

        numbers1 = new int[] { 1, 2, 3, 4 };
        sortImprovement2Steps(numbers1);
        System.out.println(Arrays.toString(numbers1));

        ConsoleUtil.Title("bubbleSort");
        numbers1 = new int[] { 4, 3, 2, 1 };
        sortImprovement2Steps(numbers1);
        System.out.println(Arrays.toString(numbers1));
        numbers1 = new int[] { 3, 1, 2, 4 };
        sortImprovement2Steps(numbers1);
        System.out.println(Arrays.toString(numbers1));
    }

    public static void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void sortImprovement1(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void sortImprovement2(int[] numbers) {
        int i = 0;
        boolean swapOccured = true;
        while (swapOccured) {
            swapOccured = false;
            i++;
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapOccured = true;
                }
            }
        }
    }

    static void sortImprovement3(int numbers[]) {
        boolean swapped;
        for (int i = 0; i < numbers.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    public static void sortSteps(int[] numbers) {
        ConsoleUtil.Title("Sorting: " + Arrays.toString(numbers));
        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Current loop: " + i + ", item: " + numbers[i]);
            System.out.println(Arrays.toString(numbers));
            for (int j = 0; j < numbers.length - 1; j++) {
                System.out.println(
                        "    Current loop: " + (j + 1) + ", numbers[" + j + "]: " + numbers[j] + ", numbers[" + (j
                                + 1) + "]: " + numbers[j + 1]);
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
                System.out.println("    " + Arrays.toString(numbers));
            }
        }
    }

    public static void sortImprovement1Steps(int[] numbers) {
        ConsoleUtil.Title("Sorting: " + Arrays.toString(numbers));
        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Current loop: " + i + ", item: " + numbers[i]);
            System.out.println(Arrays.toString(numbers));
            for (int j = 0; j < numbers.length - i; j++) {
                System.out.println(
                        "    Current loop: " + (j + 1) + ", numbers[" + j + "]: " + numbers[j] + ", numbers[" + (j
                                + 1) + "]: " + numbers[j + 1]);
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
                System.out.println("    " + Arrays.toString(numbers));
            }
        }
    }

    public static void sortImprovement2Steps(int[] numbers) {
        ConsoleUtil.Title("Sorting: " + Arrays.toString(numbers));
        int i = 0;
        boolean swapOccured = true;
        while (swapOccured) {
            swapOccured = false;
            System.out.println("Current loop: " + i + ", item: " + numbers[i]);
            System.out.println(Arrays.toString(numbers));
            i++;
            for (int j = 0; j < numbers.length - i; j++) {
                System.out.println(
                        "    Current loop: " + (j + 1) + ", numbers[" + j + "]: " + numbers[j] + ", numbers[" + (j
                                + 1) + "]: " + numbers[j + 1]);
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapOccured = true;
                }
                System.out.println("    " + Arrays.toString(numbers));
            }
        }
    }

    static void bubbleSortSteps(int numbers[]) {
        ConsoleUtil.Title("Sorting: " + Arrays.toString(numbers));
        boolean swapped;
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("Current loop: " + i + ", item: " + numbers[i]);
            System.out.println(Arrays.toString(numbers));
            swapped = false;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                System.out.println(
                        "    Current loop: " + (j + 1) + ", numbers[" + j + "]: " + numbers[j] + ", numbers[" + (j
                                + 1) + "]: " + numbers[j + 1]);
                if (numbers[j] > numbers[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
                System.out.println("    " + Arrays.toString(numbers));
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }
}
