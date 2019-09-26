/*
题目描述
请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        String str1 = str.toString();
        char[] str2 = str1.toCharArray();
        StringBuilder str3 = new StringBuilder();
        for (int i = 0; i < str2.length; i++) {
            if (str2[i] == ' ') {
                str3.append("%20");
            } else {
                str3.append(str2[i]);
            }
        }
        return str3.toString();
    }
}