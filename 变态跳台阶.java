/*
题目描述
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution {
    //递归
    public int JumpFloor(int target) {
        if(target < 3)
            return target;
        else{
            int result = 0;
            for(int i = 1; i < target; i++){
                result += JumpFloorII(i);
            }
            return result + 1;
        }
    }
    //非递归
    public int JumpFloor2(int target) {
       if (target < 3)
            return target;
        int[] result=new int[target+1];
        result[1] = 1;
        result[2] = 2;
        for(int i = 3; i <= target; i++){
            for(int j = 1;j < i;j++){
                result[i] += result[j];
            }
            result[i] += 1;
        }
        return result[target];
    }
}