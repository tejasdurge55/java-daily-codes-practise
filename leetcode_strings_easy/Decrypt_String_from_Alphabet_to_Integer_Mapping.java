package leetcode_strings_easy;
import java.util.*;
public class Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static void main(String args[]){
        String  s = "1326#";
        int len1=s.length();
        String strf="";
        int a='a';
        int num=1;
//        System.out.println(a);
        char[] alpha=new char[26];
        
        for(int i=0;i<26;i++){
            alpha[i]=(char)(a);
            a=a+1;
        
        }
//        System.out.println(Arrays.toString(alpha));
       
        for(int i=0;i<len1;i++){
            
            if(i<len1-2 && s.charAt(i+2)=='#'){
                num=2;
            }
            else{
                num=1;
            }
            if(num==2){
                String str1=s.substring(i, i+2);
                int b = Integer.parseInt(str1);
                strf=strf+alpha[b-1];
                i=i+2;
            }
             if(num==1){
                String str2=s.substring(i, i+1);
                int c = Integer.parseInt(str2);
                strf=strf+alpha[c-1];
            }
        }
        System.out.println(strf);
        
        
    
    }
    
}
