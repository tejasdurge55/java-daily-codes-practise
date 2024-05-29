
package leetcode_strings_easy;
import java.util.*;

public class Valid_Palindrome_II {
    public static void main(String args[]){
        //System.out.println("Hello World");
        String s = "abc";
        int len1=s.length();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        String str3="";
        String reverse  = sb.reverse().toString();
        if(s.equals(reverse)){
            System.out.println("true");
        }
        for (int i=0;i<len1;i++){
            if(s.charAt(i)!=reverse.charAt(i)){
                String str1=s.substring(0, i);
                String str2=s.substring(i+1, len1);
                str3=str3+str1+str2;
                break;
            }

        }
        StringBuilder sb1=new StringBuilder();
        sb1.append(str3);
        String reverse2  = sb1.reverse().toString();
        if(str3.equals(reverse2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
                
    }
}
