package leetcode_strings_easy;
import java.util.*;
public class Implement_strStr {
    public static void main(String args[]){
        //System.out.println("Hello World");
        String haystack="aaaaa";
        String needle="bba";
        if(haystack.isEmpty()){
            System.out.println(0);
        }
//        if(haystack.contains(needle)){
//            //for (int i=0;i<haystack.length();i++){
//            int needleindex = haystack.indexOf(needle);
//            //}
//            System.out.println(needleindex);
//        }
//        else{
//            System.out.println(-1);
//        }
        int needleindex = haystack.indexOf(needle);
           
        System.out.println(needleindex);
    }
    
}
