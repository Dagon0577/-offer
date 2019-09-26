/*
题目描述
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39
*/

public class Solution {
    // 递归
    public int Fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    // 非递归 打表
    public int Fibonacci2(int n) {
        int[] result = new int[40];
        result[1] = 1;
        result[2] = 1;
        for (int i = 3; i <= n; i++)
            result[i] = result[i - 2] + result[i - 1];
        return result[n];
    }
}