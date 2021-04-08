package io.algocasts;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class P7Test {

    private int[][] genTestCase() {
        return new int[][]{{1, 2, 3}, {4, 5, 6}, {5, 6, 8}, {7, 8, 9}, {10, 11, 12}};
    }

    @Test
    public void testSearchIn2DArray() {
        P7 p = new P7();
        int target = 7;
        int notFoundTarget = 13;

        int[] index = p.searchIn2DArray(this.genTestCase(), target);
        assertArrayEquals(new int[]{3, 0}, index);

        int[] notFound = p.searchIn2DArray(this.genTestCase(), notFoundTarget);
        assertArrayEquals(new int[]{-1, -1}, notFound);
    }
}