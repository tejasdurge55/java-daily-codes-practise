package stacks_gfg;
import java.util.*;

public class Reversing_the_equation {
    public static void main(String[] args) {
       String S = "20-3+5*2"; 
       String a=reverseEqn(S);
        System.out.println(a);
    }
    static String reverseEqn(String S)
    {
        Stack<String> st=new Stack<>();
        int len1=S.length();
        int start=len1-1;
        int end=len1-1;
        S=S+" ";
        for (int i = len1-1; i >= 0; i--) {
            start=i;
            if (S.charAt(start)=='/' || S.charAt(start)=='*' || S.charAt(start)=='-' || S.charAt(start)=='+') {
                String str1= S.substring(start+1, end+1);
                end=start-1;
                st.add(str1);
                st.add(String.valueOf(S.charAt(start)));
            }
        }
        String str2=S.substring(start, end+1);
        st.add(str2);
        //System.out.println(st);
        String str3="";
        for (String i : st) {
            str3=str3+i;
        }
        return str3;
    }
}
