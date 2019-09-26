
/*
题目描述
给定一个数组A[0,1,…,n-1],请构建一个数组B[0,1,…,n-1],其中B中的元素B[i]=A[0]A[1]…*A[i-1]A[i+1]…*A[n-1]。不能使用除法。
 */
import java.util.ArrayList;

public class Solution {
    public int[] multiply(int[] A) {
        if (A.length == 0) {
            return A;
        }
        int[] B = new int[A.length];
        B[0] = 1;
        // 第一部分，计算A[0]*A[1]*...*A[i-1]
        for (int i = 1; i < A.length; i++)
            B[i] = B[i - 1] * A[i - 1];
        int tmp = 1;
        // 第二部分，计算A[i+1]*...*A[n-1]
        for (int i = A.length - 2; i >= 0; i--) {
            tmp *= A[i + 1];
            B[i] *= tmp;
        }
        return B;
    }
}
