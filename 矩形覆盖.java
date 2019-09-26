/*
题目描述
我们可以用21的小矩形横着或者竖着去覆盖更大的矩形。请问用n个21的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
*/
public class Solution {
    // 递归
    public int RectCover(int target) {
        if (target < 3)
            return target;
        else
            return RectCover(target - 2) + RectCover(target - 1);
    }

    // 非递归
    public int RectCover2(int target) {
        if (target < 3)
            return target;
        int[] result = new int[target + 1];
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i <= target; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[target];
    }
}