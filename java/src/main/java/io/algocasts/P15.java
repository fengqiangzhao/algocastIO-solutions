package io.algocasts;

/**
 * 缺失的数字
 * leetcode:196,268
 * Tag:数组、数学、位操作
 * Level:易
 * 相同的数字【异或】的结果为0
 */
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
