package org.mine.kb.java.dsandalgorithms.string.counting_number_of_occurrences_of_character_in_string;

/*
 * counting the number of occurrences of a particular character in a string.
 */
public class CountingNumberOfOccurrencesOfCharacterInString {
    /*
     * The algorithm is linear because its runtime is directly proportional to the
     * string length. If we take the string length to be n, the runtime complexity
     * of this Java method is O(n). Notice the single loop varying according to
     * the input size. This is very typical of linear runtime complexity
     * algorithms, where a constant number of operations are performed for
     * each input unit. The input unit in this example is each character in the
     * string.
     * 
     */
    public static int algorithm1(char c, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }
        return count;
    }

}
