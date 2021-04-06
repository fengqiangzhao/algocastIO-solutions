package io.algocasts;

/**
 * 数值的n次方
 * leetcode: 50,428
 * Tag:数学,二分搜索
 */
public class P10 {
    //Time:O(n), Space:O(1)
    public double pow(double x, int n) {
        double result = 1;
        long N = Math.abs((long) n);
        for (int i = 0; i < N; ++i)
            result *= x;
        return n < 0 ? 1 / result : result;
    }

    //Time:O(log(n)), Space:O(1)
    public double powFast(double x, int n) {
        double result = 1;
        long N = Math.abs((long) n);

        while (N != 0) {
            if ((N & 1) == 1) result *= x;
            x *= x;
            N >>= 1;
        }
        return n < 0 ? 1 / result : result;
    }

    //Time:O(log(n)), Space:O(log(n))
    public double powRecursive(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n < 0) return 1 / powRecursive(x, -n);
        if (n % 2 == 0) {
            return powRecursive(x * x, n / 2);
        } else {
            return powRecursive(x * x, n / 2) * x;
        }
    }

}
