package io.algocasts;

import java.util.*;

/**
 * 数组的全排列
 * leetcode:15,46
 * Tag:回溯
 * Level:中
 * 一种通过探索所有可能的候选解来找出所有的解的算法。如果候选解被确认不是一个解（或者至少不是最后一个解），
 * 回溯算法会通过在上一步进行一些变化抛弃该解，即回溯并且再次尝试。
 * 这个地方写得头痛!!!
 */
public class P11 {

    //Time:O(n*n!) Time:O(n*n!)
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;

        Deque<Integer> path = new ArrayDeque<>();
        int len = nums.length;
        boolean[] used = new boolean[len];
        dfs(nums, len, 0, path, used, res);
        return res;
    }

    private void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (used[i]) {
                continue;
            }

            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, len, depth + 1, path, used, res);
            path.removeLast();
            used[i] = false;
        }
    }

    //Time:O(n*n!) Space:O(n)
    public List<List<Integer>> permuteTwo(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;

        int len = nums.length;
        List<Integer> path = new ArrayList<>();
        for (int num : nums) path.add(num);
        backTrack(len, path, res, 0);
        return res;
    }

    void backTrack(int len, List<Integer> path, List<List<Integer>> res, int start) {
        if (start == len) {
            res.add(new ArrayList<>(path));
        }
        for (int i = start; i < len; i++) {
            Collections.swap(path, start, i);
            backTrack(len, path, res, start + 1);
            Collections.swap(path, start, i);
        }
    }
}
