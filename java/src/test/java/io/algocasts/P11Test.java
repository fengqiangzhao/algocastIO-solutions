package io.algocasts;

import org.junit.Test;

import java.util.List;

public class P11Test {
    @Test
    public void testPermuteDFS() {
        P11 p = new P11();
        int[] nums = new int[]{2, 3, 4};
        List<List<Integer>> res = p.permute(nums);
        System.out.println(res);
    }

    @Test
    public void testPermuteDFSTwo() {
        P11 p = new P11();
        int[] nums = new int[]{3, 4, 5};
        List<List<Integer>> res = p.permuteTwo(nums);
        System.out.println(res);
    }
}