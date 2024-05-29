
package leetcode_strings_easy;
import java.util.*;

public class Valid_Palindrome {
    public static void main(String args[]){
        //System.out.println("Hello World");
        String s = "0P";
        String str2="";
        
        String alpha="abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb1.append(s);
        String s1 = s.toLowerCase();
        
        for (int i=0;i<s1.length();i++){
            String str1=Character.toString(s1.charAt(i));
            if(alpha.contains(str1)){
                str2=str2.concat(str1);
            }
        }
        //System.out.println(str2);
        sb.append(str2);
        String str4 =sb.reverse().toString();
        //System.out.println(str4);
        if(str2.equals(str4)){
        System.out.println("true");

        }
        else{
        System.out.println("false");

        }
        
        

    }

    
}
