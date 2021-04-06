package io.algocasts;

public class P15 {
    //Time:O(n) Space(O(1))
    public int missingNumber(int[] nums) {
        int n = nums.length, result = n;
        for (int i = 0; i < n; ++i) {
            result = result ^ i ^ nums[i];
        }
        return result;
    }
}
