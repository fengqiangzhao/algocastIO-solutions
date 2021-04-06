package io.algocasts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P15Test {
    private int[] getTestCase() {
        return new int[]{0, 1, 2, 3, 4, 6};
    }

    @Test
    public void testMissingNumber() {
        int[] nums = this.getTestCase();
        P15 p = new P15();
        assertEquals(5, p.missingNumber(nums));
    }
}