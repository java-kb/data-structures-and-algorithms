package org.mine.kb.java.dsandalgorithms.algorithms.numbers.binarytodecimal;

public class BinaryToDecimal {
    public static int algorithm1(String binary) {
        int conversion = 1;
        int result = 0;
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += conversion;

            conversion *= 2;
        }
        return result;
    }
    public static int algorithm2(String binary) {
        int result = 0;
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += Math.pow(2, i - 1);
        }
        return result;
    }
}
