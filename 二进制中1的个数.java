/*
题目描述
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
*/
public class Solution {
    // 思想：用1（1自身左移运算，其实后来就不是1了）和n的每位进行位与，来判断1的个数
    public int NumberOf1(int n) {
        int result = 0;
        int index = 1;
        while (index != 0) {
            if ((n & index) != 0) {
                result++;
            }
            index = index << 1;
        }
        return result;
    }

    // 最优解
    public int NumberOf12(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
}