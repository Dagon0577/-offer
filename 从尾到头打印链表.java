/*
 题目描述
输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。 
 */
import java.util.Stack;
import java.util.ArrayList;
public class Solution {
    
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        //利用栈先进后出的思想
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
}