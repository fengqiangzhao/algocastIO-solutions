package io.algocasts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P6Test {
    public int[] genTestCase() {
        return new int[]{1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 5, 7, 6};
    }

    @Test
    public void testSingleNumberWithXOR() {
        P6 p = new P6();
        int singleNum = p.singleNumberWithXOR(this.genTestCase());
        assertEquals(7, singleNum);
    }


    @Test
    public void testSingleNumberWithSet() {
        P6 p = new P6();
        int singleNum = p.singleNumberWithSet(this.genTestCase());
        assertEquals(7, singleNum);
    }
}