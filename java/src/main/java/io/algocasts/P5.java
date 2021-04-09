package io.algocasts;

/**
 * 不用+/-求两数之和
 * leetcode:371
 * Tag:位操作
 * Level:易
 */
public class P5 {
    //Time:O(m) Space:O(m)
    public int getSumRecursive(int a, int b) {
        return b == 0 ? a : getSumRecursive(a ^ b, (a & b) << 1);
    }

    //Time:O(m) Space:O(1)
    public int getSumIterative(int a, int b) {
        while (b != 0) {
            int sum = a ^ b;
            int carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return a;
    }
}
