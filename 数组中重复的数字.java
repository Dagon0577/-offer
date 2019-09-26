
/*
题目描述
在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
import java.util.HashSet;

public class Solution {
    // Parameters:
    // numbers: an array of integers
    // length: the length of array numbers
    // duplication: (Output) the duplicated number in the array number,length of
    // duplication array is 1,so using duplication[0] = ? in implementation;
    // Here duplication like pointor in C/C++, duplication[0] equal *duplication in
    // C/C++
    // 这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value: true if the input is valid, and there are some duplications in
    // the array number
    // otherwise false
    // 方法1
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (length < 2 || numbers == null)
            return false;
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!result.add(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }

    // 方法2
    public boolean duplicate2(int numbers[], int length, int[] duplication) {
        if (length < 2 || numbers == null)
            return false;
        for (int i = 0; i < length; i++) {
            // 取得numbers[i]的值
            int index = numbers[i];
            // 如果大于length，则需要减去length获得numbers[i]的值
            if (index >= length)
                index -= length;
            // 若已经大于length，说明已经有过访问
            if (numbers[index] >= length) {
                duplication[0] = index;
                return true;
            }
            // numbers[i]对应位置上的数字+length
            numbers[index] = numbers[index] + length;
        }
        return false;
    }
}