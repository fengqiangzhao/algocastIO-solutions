package io.algocasts;

import java.util.HashSet;

/**
 * 单身数字
 * leetcode:136,82
 * Tag:哈希表、位操作
 * Level:易
 */
public class P6 {

    //Time:O(n), Space:O(1)
    public int singleNumberWithXOR(int[] nums) {
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }

    //Time:O(n), Space:O(n)
    public int singleNumberWithSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0, uniqueSum = 0;
        for (int num : nums) {
            if (!set.contains(num)) {
                uniqueSum += num;
                set.add(num);
            }
            sum += num;
        }
        return 2 * uniqueSum - sum;
    }
}
