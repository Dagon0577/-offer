/*题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
*/
public class Solution {
    public double Power(double base, int exponent) {
        double result = 1.0;
        
        if(exponent > 0){
            for(int i = 1; i <= exponent; ++i){
                result *= base;
            }
        }else if(exponent == 0){
            return result;
        }else{
            if(base ==0)
                throw new RuntimeException("分母不能为零");
            for(int i = 1; i <= -exponent; ++i){
                result *= base;
            }
            result = 1 / result;
        }
        return result;
  }
}