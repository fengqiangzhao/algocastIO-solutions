package io.algocasts;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class P13Test {
    @Test
    public void testIsPalindrome() {
        P13 t = new P13();
        assertTrue(t.isPalindrome(12321));
        assertTrue(t.isPalindrome(232));
        assertTrue(t.isPalindrome(99999));
        assertTrue(t.isPalindrome(123454321));
        assertFalse(t.isPalindrome(-232));
        assertFalse(t.isPalindrome(1234));
        assertFalse(t.isPalindrome(23431));
    }

    @Test
    public void testIsPalindromeStr() {
        P13 t = new P13();
        assertTrue(t.isPalindromeStr(12321));
        assertTrue(t.isPalindromeStr(232));
        assertTrue(t.isPalindromeStr(99999));
        assertTrue(t.isPalindromeStr(123454321));
        assertFalse(t.isPalindromeStr(-232));
        assertFalse(t.isPalindromeStr(1234));
        assertFalse(t.isPalindromeStr(23431));
    }
}