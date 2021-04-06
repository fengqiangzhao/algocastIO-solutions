package io.algocasts;


/**
 * 回文字符串判断
 * leetcode:125,415
 * Tag: 双指针、字符串
 * Level: 易
 */
public class P1 {
    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    private boolean isEqualIgnoreCase(char a, char b) {
        if (a >= 'A' && a <= 'Z') a += 32;
        if (b >= 'A' && b <= 'Z') b += 32;
        return a == b;
    }

    //Time: O(n), Space: O(1)
    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) return true;

        int i = 0, j = s.length() - 1;
        for (; i < j; i++, j--) {
            while (i < j && !isAlphaNumeric(s.charAt(i))) i++;
            while (i < j && !isAlphaNumeric(s.charAt(j))) j--;
            if (i < j && !isEqualIgnoreCase(s.charAt(i), s.charAt(j))) return false;
        }
        return true;
    }
}
