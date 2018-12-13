public class Solution {
    public String replaceSpace(StringBuffer str) {
    	String str1=str.toString();
        char[] str2=str1.toCharArray();
        StringBuilder str3=new StringBuilder();
        for(int i=0;i<str2.length;i++){
            if(str2[i]==' '){
                str3.append("%20");
            }else{
                str3.append(str2[i]);
            }
        }
        return str3.toString();
    }
}