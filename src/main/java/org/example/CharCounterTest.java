package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharCounterTest {

    @Test
    void simpleTest() {
        Assertions.assertEquals("h-1;e-1;l-2;o-1;", CharCounter.countChars("hello"));
    }

    @Test
    void repeatTest() {
        Assertions.assertEquals("a-3;", CharCounter.countChars("aaa"));
    }

    @Test
    void numbersTest() {
        Assertions.assertEquals("1-1;2-1;3-1;", CharCounter.countChars("123"));
    }

    @Test
    void emptyTest() {
        Assertions.assertEquals("", CharCounter.countChars(""));
    }

    @Test
    void spaceTest() {
        Assertions.assertEquals("a-2; -1;", CharCounter.countChars("a a"));
    }

    @Test
    void symbolsTest() {
        Assertions.assertEquals("!-2;?-2;", CharCounter.countChars("!!??"));
    }

    @Test
    void mixedCaseTest() {
        Assertions.assertEquals("A-2;a-2;", CharCounter.countChars("AaAa"));
    }

    @Test
    void nullTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CharCounter.countChars(null);
        });
    }
}