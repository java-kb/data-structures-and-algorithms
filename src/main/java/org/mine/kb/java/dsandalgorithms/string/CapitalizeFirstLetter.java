package org.mine.kb.java.dsandalgorithms.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
 * Capitalize the first letter of each word in a string,
 */
public class CapitalizeFirstLetter {
    // Book Oswald Campesato - Data Structures in Java-Mercury Learning and
    // Information (2023) pp 32
    /*
     * how to use
     * the substring() method in order to capitalize the first letter of each word
     * in a string,
     * The method splits
     * (“tokenizes”) the contents of line1 into an array of words via the split()
     * method.
     * Next, a loop iterates through each word in the words array, and sets the
     * variable first equal
     * to the uppercase version of the first letter of the current word,
     * concatenated with the remaining
     * letters of the current word,
     */
    public static String capitalizeFirstAll(String input) {
        String[] words = input.split(" ");
        String line2 = "", first = "";
        for (String word : words) {
            first = word.substring(0, 1).toUpperCase() + word.substring(1);
            line2 = line2 + first + " ";
        }
        return line2.trim();
    }

    // https://prepinsta.com/java/program-to-capitalize-the-first-character-of-each-word-in-a-string/
    public static String capitalizeFirst(String input) {

        // splliting up words using split function
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {

            // taking letter individually from sentences
            String firstLetter = words[i].substring(0, 1);
            String restOfWord = words[i].substring(1);

            // making first letter uppercase using toUpperCase function
            firstLetter = firstLetter.toUpperCase();
            words[i] = firstLetter + restOfWord;
        }

        // joining the words together to make a sentence
        String capitalizedSentence = String.join(" ", words);
        return capitalizedSentence;
    }

    public static String Capital(String input) { // user-defined method
        // store each character to a char array
        char[] charAray = input.toCharArray();
        // for loop to capitalize first letter
        for (int i = 0; i < charAray.length; i++) {
            // capitalizing first letter of first word
            charAray[0] = Character.toUpperCase(charAray[0]);
            // loop to check if there is space between two letters
            if (charAray[i] == ' ') {
                // capitalizing first letter of rest of the word
                charAray[i + 1] = Character.toUpperCase(charAray[i + 1]);
            }
        }
        // converting the character array to the string
        input = String.valueOf(charAray);
        return input;
    }

    // https://www.programiz.com/java-programming/examples/capitalize-first-character-of-string
    public static String capitalizeWordsUsingCharArray(String input) {
        // stores each characters to a char array
        char[] charArray = input.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {

            // if the array element is a letter
            if (Character.isLetter(charArray[i])) {

                // check space is present before the letter
                if (foundSpace) {

                    // change the letter into uppercase
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }

            else {
                // if the new character is not character
                foundSpace = true;
            }
        }

        // convert the char array to the string
        input = String.valueOf(charArray);
        return input;
    }

    // https://docs.vultr.com/java/examples/capitalize-the-first-character-of-each-word-in-a-string
    public static String capitalizeWordsUsingStringBuffer(String input) {
        StringBuffer result = new StringBuffer();
        char prevChar = ' '; // Start with a space to capitalize the first word
        for (char ch : input.toCharArray()) {
            if (prevChar == ' ') {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
            prevChar = ch;
        }
        return result.toString();
    }

    // https://www.geeksforgeeks.org/java-program-to-capitalize-the-first-letter-of-each-word-in-a-string/
    // function to capitalize the first letter of each word
    public static String capitalizeWords(String input) {
        // split the input string into an array of words
        String[] words = input.split("\\s");

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // iterate through each word
        for (String word : words) {
            // capitalize the first letter, append the rest of the word, and add a space
            result.append(Character.toTitleCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }

        // convert StringBuilder to String and trim leading/trailing spaces
        return result.toString().trim();
    }

    // Capitalize the First Letter of a String in Java Using Regex
    // https://www.geeksforgeeks.org/first-character-of-each-word-in-uppercase-using-regex
    /*
     * it converted the first character of each word to
     * uppercase in a given input string using regex.
     * It uses a regular expression (\\b\\w) to identify the first letter of each
     * word.
     * The program then iterates through the matches, replacing each first letter
     * with its uppercase equivalent.
     * Finally, it prints the modified string.
     * In simple, it transforms a sentence so that the first letter of each word is
     * in uppercase.
     */
    public static String capitalizeWordsUsingRegex(String input) {
        // regular expression for finding the first letter
        // of string
        Pattern pat = Pattern.compile("\\b\\w");
        Matcher Match = pat.matcher(input);

        StringBuilder result = new StringBuilder();

        // replace the first character with it's uppercase
        while (Match.find()) {
            Match.appendReplacement(
                    result, Match.group().toUpperCase());
        }
        Match.appendTail(result);

        // convert StringBuilder to String and trim leading/trailing spaces
        return result.toString().trim();
    }

    // https://www.baeldung.com/java-string-initial-capital-letter-every-word
    /*
     * Using Character#toUpperCase
     * toUpperCase() provides the easiest way to achieve our goal. As the name
     * indicates, this method converts a given character to uppercase.
     * So here, we’ll be using it to convert the first character of each word of our
     * string:
     * As we can see, we started by checking if our string is null or empty to avoid
     * potential NullPointerException. Then, we used the split() method to divide
     * our input string into multiple words.
     * 
     * Furthermore, we used charAt(0) to get the first character of each word. Then,
     * we applied toUpperCase() to the returned character. Afterward, we
     * concatenated the uppercase character with the rest of the word using the +
     * operator and substring(1).
     * Finally, we used Collectors#joining to join each capitalized word in a single
     * string back again.
     */
    static String usingCharacterToUpperCaseMethod(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        return Arrays.stream(input.split("\\s+"))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));
    }

    /*
     * Using String#toUpperCase
     * The String class provides its own version of the toUpperCase() method
     * we used substring(0, 1) to extract the first character of each word as a
     * String. Then, we called the toUpperCase() method to convert it to uppercase.
     * Subsequently, we used the same mechanism as before to concatenate and join
     * the returned words.
     * Please bear in mind that, unlike String#toUpperCase, Character#toUpperCase is
     * a static method. Another key difference is that String#toUpperCase produces a
     * new String, whereas Character#toUpperCase returns a new char primitive.
     */
    static String usingStringToUpperCaseMethod(String input) {
        return Arrays.stream(input.split("\\s+"))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }

    /*
     * Using StringUtils From Apache Commons Lang3
     * This library provides the StringUtils class to manipulate and handle strings
     * in a null-safe manner.
     */
    static String usingStringUtilsClass(String input) {
        return Arrays.stream(input.split("\\s+"))
                .map(CapitalizeFirstLetter::capitalize)
                .collect(Collectors.joining(" "));
    }

    /**
     * Capitalizes a String changing the first character to title case as
     * per {@link Character#toTitleCase(int)}. No other characters are changed.
     *
     * <p>
     * For a word based algorithm, see
     * {@link org.apache.commons.text.WordUtils#capitalize(String)}.
     * A {@code null} input String returns {@code null}.
     * </p>
     *
     * <pre>
     * StringUtils.capitalize(null)    = null
     * StringUtils.capitalize("")      = ""
     * StringUtils.capitalize("cat")   = "Cat"
     * StringUtils.capitalize("cAt")   = "CAt"
     * StringUtils.capitalize("'cat'") = "'cat'"
     * </pre>
     *
     * @param str the String to capitalize, may be null
     * @return the capitalized String, {@code null} if null String input
     * @see org.apache.commons.text.WordUtils#capitalize(String)
     * @see #uncapitalize(String)
     * @since 2.0
     */
    public static String capitalize(final String str) {
        final int strLen = length(str);
        if (strLen == 0) {
            return str;
        }

        final int firstCodepoint = str.codePointAt(0);
        final int newCodePoint = Character.toTitleCase(firstCodepoint);
        if (firstCodepoint == newCodePoint) {
            // already capitalized
            return str;
        }

        final int[] newCodePoints = new int[strLen]; // cannot be longer than the char array
        int outOffset = 0;
        newCodePoints[outOffset++] = newCodePoint; // copy the first code point
        for (int inOffset = Character.charCount(firstCodepoint); inOffset < strLen;) {
            final int codePoint = str.codePointAt(inOffset);
            newCodePoints[outOffset++] = codePoint; // copy the remaining ones
            inOffset += Character.charCount(codePoint);
        }
        return new String(newCodePoints, 0, outOffset);
    }

    public static int length(final CharSequence cs) {
        return cs == null ? 0 : cs.length();
    }

    /*
     * Using WordUtils From Apache Commons Text
     * Typically, this library comes with a set of ready-to-use classes and methods
     * for string operations. Among these classes, we find WordUtils.
     * 
     * The WordUtils#capitalizeFully method offers the most concise and
     * straightforward way to tackle our problem. This method converts all the
     * whitespace-separated words into capitalized words.
     * 
     * Please note that this method handles null input gracefully. So, we don’t need
     * to check whether our input string is null or not.
     * 
     * 
     */
    /**
     * Converts all the whitespace separated words in a String into capitalized
     * words,
     * that is each word is made up of a titlecase character and then a series of
     * lowercase characters.
     *
     * <p>
     * Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A {@code null} input String returns {@code null}.
     * Capitalization uses the Unicode title case, normally equivalent to
     * upper case.
     * </p>
     *
     * <pre>
     * WordUtils.capitalizeFully(null)        = null
     * WordUtils.capitalizeFully("")          = ""
     * WordUtils.capitalizeFully("i am FINE") = "I Am Fine"
     * </pre>
     *
     * @param str the String to capitalize, may be null
     * @return capitalized String, {@code null} if null String input
     */
    public static String capitalizeFully(final String str) {
        return capitalizeFully(str, null);
    }

    // https://www.baeldung.com/java-string-initial-capital-letter-every-word
    // https://github.com/apache/commons-text/blob/master/src/main/java/org/apache/commons/text/WordUtils.java#L170
    /**
     * Converts all the delimiter separated words in a String into capitalized
     * words,
     * that is each word is made up of a titlecase character and then a series of
     * lowercase characters.
     *
     * <p>
     * The delimiters represent a set of characters understood to separate words.
     * The first string character and the first non-delimiter character after a
     * delimiter will be capitalized.
     * </p>
     *
     * <p>
     * A {@code null} input String returns {@code null}.
     * Capitalization uses the Unicode title case, normally equivalent to
     * upper case.
     * </p>
     *
     * <pre>
     * WordUtils.capitalizeFully(null, *)            = null
     * WordUtils.capitalizeFully("", *)              = ""
     * WordUtils.capitalizeFully(*, null)            = *
     * WordUtils.capitalizeFully(*, new char[0])     = *
     * WordUtils.capitalizeFully("i aM.fine", {'.'}) = "I am.Fine"
     * </pre>
     *
     * @param str        the String to capitalize, may be null
     * @param delimiters set of characters to determine capitalization, null means
     *                   whitespace
     * @return capitalized String, {@code null} if null String input
     */
    public static String capitalizeFully(String str, final char... delimiters) {
        if (isEmpty(str)) {
            return str;
        }
        str = str.toLowerCase();
        final Predicate<Integer> isDelimiter = generateIsDelimiterFunction(delimiters);
        final int strLen = str.length();
        final int[] newCodePoints = new int[strLen];
        int outOffset = 0;

        boolean capitalizeNext = true;
        for (int index = 0; index < strLen;) {
            final int codePoint = str.codePointAt(index);

            if (isDelimiter.test(codePoint)) {
                capitalizeNext = true;
                newCodePoints[outOffset++] = codePoint;
                index += Character.charCount(codePoint);
            } else if (capitalizeNext) {
                final int titleCaseCodePoint = Character.toTitleCase(codePoint);
                newCodePoints[outOffset++] = titleCaseCodePoint;
                index += Character.charCount(titleCaseCodePoint);
                capitalizeNext = false;
            } else {
                newCodePoints[outOffset++] = codePoint;
                index += Character.charCount(codePoint);
            }
        }
        return new String(newCodePoints, 0, outOffset);
    }

    /**
     * Given the array of delimiters supplied; returns a function determining
     * whether a character code point is a delimiter.
     * The function provides O(1) lookup time.
     * Whitespace is defined by {@link Character#isWhitespace(char)} and is used as
     * the defaultvalue if delimiters is null.
     *
     * @param delimiters set of characters to determine delimiters, null means
     *                   whitespace
     * @return Predicate<Integer> taking a code point value as an argument and
     *         returning true if a delimiter.
     */
    private static Predicate<Integer> generateIsDelimiterFunction(final char[] delimiters) {
        final Predicate<Integer> isDelimiter;
        if (delimiters == null || delimiters.length == 0) {
            isDelimiter = delimiters == null ? Character::isWhitespace : c -> false;
        } else {
            final Set<Integer> delimiterSet = new HashSet<>();
            for (int index = 0; index < delimiters.length; index++) {
                delimiterSet.add(Character.codePointAt(delimiters, index));
            }
            isDelimiter = delimiterSet::contains;
        }

        return isDelimiter;
    }

    /**
     * Tests if a CharSequence is empty ("") or null.
     *
     * <pre>
     * StringUtils.isEmpty(null)      = true
     * StringUtils.isEmpty("")        = true
     * StringUtils.isEmpty(" ")       = false
     * StringUtils.isEmpty("bob")     = false
     * StringUtils.isEmpty("  bob  ") = false
     * </pre>
     *
     * <p>
     * NOTE: This method changed in Lang version 2.0.
     * It no longer trims the CharSequence.
     * That functionality is available in isBlank().
     * </p>
     *
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is empty or null
     * @since 3.0 Changed signature from isEmpty(String) to isEmpty(CharSequence)
     */
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
}
