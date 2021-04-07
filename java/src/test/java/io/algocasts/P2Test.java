package io.algocasts;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class P2Test {

    private int[] genTestCase() {
        return new int[]{10, 2, 3, 4, 25, 90};
    }

    @Test
    public void testGetTwoNumSumToGivenValueBruteForce() {
        P2 p = new P2();
        assertArrayEquals(p.getTwoNumSumToGivenValueBruteForce(this.genTestCase(), 35), new int[]{0, 4});
        assertArrayEquals(p.getTwoNumSumToGivenValueBruteForce(this.genTestCase(), 350), new int[]{-1, -1});
    }

    @Test
    public void testGetTwoNumSumToGivenValueHashMap() {
        P2 p = new P2();
        assertArrayEquals(p.getTwoNumSumToGivenValueHashMap(this.genTestCase(), 35), new int[]{0, 4});
        assertArrayEquals(p.getTwoNumSumToGivenValueHashMap(this.genTestCase(), 350), new int[]{-1, -1});
    }
}