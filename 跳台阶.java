/*
题目描述
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
*/
public class Solution {
    //递归
    public int JumpFloor(int target) {
        if (target <3)
        	return target;
        else 
            return JumpFloor(target-1)+JumpFloor(target-2);
    }
    //非递归
    public int JumpFloor2(int target) {
        if (target <3)
            return target;
        int[] result=new int[target+1];
        result[1]=1;
        result[2]=2;
        for(int i=3;i<=target;i++){
            result[i]=result[i-1]+result[i-2];
        }
        return result[target];
    }
}