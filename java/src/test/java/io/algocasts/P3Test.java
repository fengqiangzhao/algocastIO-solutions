package io.algocasts;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class P3Test {

    private int[] genTestCase() {
        return new int[]{1, 2, 3, 6, 8, 11};
    }

    @Test
    public void testGetTwoNumSumToGivenValue() {
        P3 p = new P3();
        assertArrayEquals(p.getTwoNumSumToGivenValue(this.genTestCase(), 10), new int[]{2, 5});
    }
}