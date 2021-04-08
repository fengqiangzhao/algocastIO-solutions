package io.algocasts;

/**
 * 行列递增的二维数组搜索
 * leetcode:38,240
 * Tag:二分搜索、分治
 * Level:中
 */
public class P7 {
    //Time:O(m+n), Space:O(1)
    public int[] searchIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            if (target < matrix[i][j]) --j;
            else if (target > matrix[i][j]) ++i;
            else return new int[]{i, j};
        }
        return new int[]{-1, -1};
    }
}
