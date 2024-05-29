package leetcode_strings_easy;

import java.util.*;
public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String args[]){
//        System.out.println("Hello World");
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
//        char[] ch={'a','m'};
//        String str1=new String(ch);
//        System.out.println(str1);
//        String str2="";
//        String str3="";
//        for (int i=0;i<word1.length;i++){
//            str2=str2+word1[i];
//        
//        }
//        for (int i=0;i<word2.length;i++){
//            str3=str3+word2[i];
//        
//        }
//        if(str2.equals(str3)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }



//        String join = String.join("", word1);
//        System.out.println(join);
//        String join2 = String.join("", word2);
//        System.out.println(join2);
//        if(join.equals(join2)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
//    
         StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();
        for(String word: word1)
            sb1.append(word);
        
        for(String word: word2)
            sb2.append(word);
        
        
        System.out.println(sb1);
        System.out.println(sb2);
        String str4=sb1.toString();
        String str5=sb2.toString();
        if(str4.equals(str5)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
    
}
