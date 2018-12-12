/*
题目描述
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
    	//判断数组是否为null、[]、[[]]
        if((array==null || array.length==0)||(array.length==1 && array[0].length==0))
            return false;
        int col=array.length-1;
        int row=0;
        //数组从array最左下角开始，值比target大就往上走，值比target小就往右走
        while(col>=0 && row <array[0].length){
            if(array[col][row]>target)
                col--;
            else if(array[col][row]<target)
                row++;
            else
                return true;
        }
        //没找到即返回false
        return false;
    }
}
