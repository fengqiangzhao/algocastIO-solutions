package io.algocasts;

/**
 * 回文数字判断
 * leetcode:9,491
 * Tag: 数学
 * Level: 易
 */
public class P13 {
    //Time:O(m), Space:O(1)
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int tmp = x;
        long y = 0;
        while (tmp != 0) {
            int num = tmp % 10;
            y = y * 10 + num;
            tmp = tmp / 10;
        }
        return y == x;
    }

    //Time:O(m), Space:O(1)
    public boolean isPalindromeStr(int x) {
        String str = String.valueOf(x);
        int i = 0, j = str.length() - 1;
        for (; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }
}
