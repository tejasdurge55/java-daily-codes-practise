package leetcode_strings_easy;
import java.util.*;
public class Reverse_Words_in_a_String_III {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        //System.out.println("Hello World");
        String s = "Let's take LeetCode contest";
        //StringBuilder builder = new StringBuilder();
        //String str1=in.nextLine();
        //builder.append(s);
        String[] arr1=s.split(" ");
        int len1=arr1.length;
        String str4="";
        for (int i=0;i<len1;i++){
            String str3=palin(arr1[i]);
            str4=str4+(str3 + " ");
        }
        String strip=str4.strip();
        System.out.println(strip);
        
        
    }
    static String palin(String str2){
        int len2=str2.length();
        char[] ch=new char[len2];
        int j=0;
        for (int i=len2-1;i>=0;i--){
            ch[j]=(str2.charAt(i));
            j=j+1;
        }
        return(new String(ch));
        
        
    }
}
