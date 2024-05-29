//https://practice.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1

//Input: str = "a+b*(c^d-e)^(f+g*h)-i"
//Output: abcd^e-fgh*+^*+i-
package stacks_gfg;  
import java.util.*;
public class Infix_to_Postfix {
    public static void main(String[] args) {
        String exp = "(a*b)-(c*d)+(e/f)";
        //int len2=exp.length();
        //System.out.println(*>+);
        System.out.println(infixToPostfix(exp));
    }
    static String infixToPostfix(String exp) {
        
        ArrayDeque<String> st=new ArrayDeque<>();
        String operands="+-/*^()"; // */=2,+-=1,^=3
        String str1="";
        int len1=exp.length();
        for (int i = 0; i < len1; i++) {
            if(operands.contains(exp.substring(i,i+1))){
                String currentoperend=exp.substring(i,i+1);
                if(st.isEmpty()){
                    st.push(currentoperend);
                    continue;
                }
                if(currentoperend.equals("(")){
                    st.push(currentoperend);
                    continue;
                }
                if(currentoperend.equals(")")){
                    while(!st.peek().equals("(")){
                        str1=str1+st.peek();
                        st.pop();
                    }
                    st.pop();
                    continue;
                }
                //Input: str = "a+b*(c^d-e)^(f+g*h)-i"
                //Output: abcd^e-fgh*+^*+i-
                if(operandvalue(currentoperend)>operandvalue(st.peek())){
                    st.push(currentoperend);
                    continue;
                }
                if(operandvalue(currentoperend)<=operandvalue(st.peek())){
                    str1=str1+st.peek();
                    st.pop();
                    //st.push(currentoperend);
                    while(!st.isEmpty() && operandvalue(currentoperend)<=operandvalue(st.peek()) && operandvalue(st.peek())>0){
                        str1=str1+st.peek();
                        st.pop();
                        if(st.isEmpty()){
                            
                            break;
                        }
                        
                    }
                    st.push(currentoperend);
                    //str1=str1+st.peek();
                }
            }
            else{
                str1=str1+exp.substring(i,i+1);
            }
            
        }
        while(!st.isEmpty()){
            str1=str1+st.peek();
            st.pop();
        }
        
        return str1;
    }
    static int operandvalue(String ov){
        int operandvalue=0;
        switch (ov) {
            case "+":
                operandvalue=1;
                break;
            case "-":
                operandvalue=1;
                break;
            case "*":
                operandvalue=2;
                break;
            case "/":
                operandvalue=2;
                break;
            case "^":
                operandvalue=3;
                break;
            case "(":
                operandvalue=-1;
                break;    
            default:
                throw new AssertionError();
        }
        return operandvalue;
    }
}
