package io.algocasts;

import org.junit.Test;

import static org.junit.Assert.*;

public class P10Test {
    @Test
    public void testPow() {
        P10 p = new P10();
        assertEquals(p.pow(3, 6), Math.pow(3, 6), 0.0);
        assertEquals(p.pow(3, 5), Math.pow(3, 5), 0.0);
        assertEquals(p.pow(3, 10), Math.pow(3, 10), 0.0);
    }

    @Test
    public void testPowFast() {
        P10 p = new P10();
        assertEquals(p.powFast(3, 6), Math.pow(3, 6), 0.0);
        assertEquals(p.powFast(3, 5), Math.pow(3, 5), 0.0);
        assertEquals(p.powFast(3, 10), Math.pow(3, 10), 0.0);
    }

    @Test
    public void testPowRecursive() {
        P10 p = new P10();
        assertEquals(p.powRecursive(3, 6), Math.pow(3, 6), 0.0);
        assertEquals(p.powRecursive(3, 5), Math.pow(3, 5), 0.0);
        assertEquals(p.powRecursive(3, 10), Math.pow(3, 10), 0.0);
    }
}