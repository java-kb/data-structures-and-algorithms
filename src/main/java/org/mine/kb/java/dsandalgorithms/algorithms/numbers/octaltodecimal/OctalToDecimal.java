package org.mine.kb.java.dsandalgorithms.algorithms.numbers.octaltodecimal;

public class OctalToDecimal {
    public static int algorithm1(String octal) {
        double conversion = 1;
        int result = 0;
        for (int i = 1; i <= octal.length(); i++) {
            int octDigit = Integer.parseInt(octal.charAt(octal.length() - i) + "");
            conversion = Math.pow(8, i - 1);
            
            result += octDigit * conversion;
        }
        return result;
    }

    public static int algorithm2(String oct) {
        int result = 0;
        for (int i = 1; i <= oct.length(); i++) {
            int octDigit = Integer.parseInt(oct.charAt(oct.length() - i) + "");
            result += Math.pow(8, i - 1) * octDigit;
        }
        return result;
    }
}
