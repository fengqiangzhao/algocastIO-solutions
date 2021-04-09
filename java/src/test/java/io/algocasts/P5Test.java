package io.algocasts;

import org.junit.Test;

import static org.junit.Assert.*;

public class P5Test {
    @Test
    public void testGetSumIterative() {
        P5 p = new P5();
        int sum = p.getSumIterative(3, 5);
        assertEquals(8, sum);

        sum = p.getSumIterative(14, 5);
        assertEquals(19, sum);
    }

    @Test
    public void testGetSumRecursive() {
        P5 p = new P5();
        int sum = p.getSumRecursive(3, 5);
        assertEquals(8, sum);

        sum = p.getSumRecursive(14, 5);
        assertEquals(19, sum);
    }
}