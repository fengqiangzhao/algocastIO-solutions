package io.algocasts;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class P1Test {
    @Test
    public void testIsPalindrome() {
        P1 t = new P1();
        assertTrue(t.isPalindrome("aba"));
        assertTrue(t.isPalindrome("10000000001"));
        assertTrue(t.isPalindrome("Fish hsif"));
        assertTrue(t.isPalindrome("pennep"));
        assertFalse(t.isPalindrome("..b-a-b-a.a..."));
        assertTrue(t.isPalindrome("a-a-b-a.a..."));
    }
}