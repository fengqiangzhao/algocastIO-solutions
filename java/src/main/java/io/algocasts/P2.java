package io.algocasts;

import java.util.HashMap;
import java.util.Map;


/**
 * 求和为给定值的两个数
 * leetcode:1,65
 * Tag:数组、哈希表
 * level:易
 */
public class P2 {
    //Time:O(n^2), Space:O(1)
    public int[] getTwoNumSumToGivenValueBruteForce(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    //Time:O(n), Space:O(n)
    public int[] getTwoNumSumToGivenValueHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int numNeeded = target - nums[i];
            if (map.containsKey(numNeeded)) {
                return new int[]{map.get(numNeeded), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
