package io.algocasts;

/**
 * 有序数组中求和为给定值的两个数
 * leetcode:167,608
 * Tag:数组、双指针、二分搜索
 * Level:易
 */
public class P3 {
    //Time:O(n), Space:O(1)
    public int[] getTwoNumSumToGivenValue(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] > target) --j;
            else if (numbers[i] + numbers[j] < target) ++i;
            else return new int[]{i + 1, j + 1};
        }
        return new int[]{-1, -1};
    }
}
