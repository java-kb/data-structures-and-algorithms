package org.mine.kb.java.dsandalgorithms.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CapitalizeFirstLetterTest {
    @Test
    void givenString_whenUsingCapitalizeFirstAllMethod_thenCapitalizeFirstCharacter() {
        String input = "hello baeldung visitors";

        assertEquals("Hello Baeldung Visitors", CapitalizeFirstLetter.capitalizeFirstAll(input));
    }
    @Test
    void givenString_whenUsingCapitalizeFirstMethod_thenCapitalizeFirstCharacter() {
        String input = "hello baeldung visitors";

        assertEquals("Hello Baeldung Visitors", CapitalizeFirstLetter.capitalizeFirst(input));
    }
    @Test
    void givenString_whenUsingCapitalMethod_thenCapitalizeFirstCharacter() {
        String input = "hello baeldung visitors";

        assertEquals("Hello Baeldung Visitors", CapitalizeFirstLetter.Capital(input));
    }
    @Test
    void givenString_whenUsingCapitalizeWordsUsingCharArrayMethod_thenCapitalizeFirstCharacter() {
        String input = "hello baeldung visitors";

        assertEquals("Hello Baeldung Visitors", CapitalizeFirstLetter.capitalizeWordsUsingCharArray(input));
    }
    @Test
    void givenString_whenUsingCapitalizeWordsUsingStringBufferMethod_thenCapitalizeFirstCharacter() {
        String input = "hello baeldung visitors";

        assertEquals("Hello Baeldung Visitors", CapitalizeFirstLetter.capitalizeWordsUsingStringBuffer(input));
    }
    @Test
    void givenString_whenUsingCapitalizeWordsMethod_thenCapitalizeFirstCharacter() {
        String input = "hello baeldung visitors";

        assertEquals("Hello Baeldung Visitors", CapitalizeFirstLetter.capitalizeWords(input));
    }
    @Test
    void givenString_whenUsingCapitalizeWordsUsingRegexMethod_thenCapitalizeFirstCharacter() {
        String input = "hello baeldung visitors";

        assertEquals("Hello Baeldung Visitors", CapitalizeFirstLetter.capitalizeWordsUsingRegex(input));
    }
    @Test
    void givenString_whenUsingCharacterToUpperCaseMethod_thenCapitalizeFirstCharacter() {
        String input = "hello baeldung visitors";

        assertEquals("Hello Baeldung Visitors", CapitalizeFirstLetter.usingCharacterToUpperCaseMethod(input));
    }

    @Test
    void givenString_whenUsingSubstringMethod_thenCapitalizeFirstCharacter() {
        String input = "Hi, my name is azhrioun";

        assertEquals("Hi, My Name Is Azhrioun",
                CapitalizeFirstLetter.usingStringToUpperCaseMethod(input));
    }

    @Test
    void givenString_whenUsingStringUtilsClass_thenCapitalizeFirstCharacter() {
        String input = "life is short the world is wide";

        assertEquals("Life Is Short The World Is Wide", CapitalizeFirstLetter.usingStringUtilsClass(input));
    }

    @Test
    void givenString_whenUsingWordUtilsClass_thenCapitalizeFirstCharacter() {
        String input = "smile sunshine is good for your teeth";

        assertEquals("Smile Sunshine Is Good For Your Teeth", CapitalizeFirstLetter.capitalizeFully(input));
    }
}
