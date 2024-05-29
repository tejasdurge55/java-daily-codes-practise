//https://practice.geeksforgeeks.org/problems/valid-expression1025/1
package stacks_gfg;
import java.util.*;
public class Valid_Expression {
    public static void main(String[] args) {
        String s = "())({}";
        System.out.println(valid(s)); 
    }
    static boolean valid(String s) 
    { 
        ArrayDeque<Character> stack=new ArrayDeque<>();
        int len1=s.length();
        if(len1%2!=0){
            return false;
        }
        for (int i = 0; i < len1; i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i)==')'){
                if(stack.isEmpty() || stack.peek()!='('){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            if(s.charAt(i)=='}'){
                if(stack.isEmpty() || stack.peek()!='{'){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            if(s.charAt(i)==']'){
                if(stack.isEmpty() || stack.peek()!='['){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            
        }
        return true;
    }
}
