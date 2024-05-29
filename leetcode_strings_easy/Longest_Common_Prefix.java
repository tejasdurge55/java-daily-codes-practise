
package leetcode_strings_easy;
import java.util.*;

public class Longest_Common_Prefix {
    public static void main(String args[]){
        System.out.println("Hello World");
        String[] strs={"flower","flow","flight"};
        int[] aa={2,5,1,6,9};
        Arrays.sort(aa);
        System.out.println(Arrays.toString(aa));
        int len1=strs.length;
        String str1="";
        StringBuilder sb=new StringBuilder();
//        sb.append(strs);
//        sb.
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        
        int len2=strs[0].length();
        System.out.println(len2);
        int j=0;
        while(j<len2){
            for (int i=0;i<len1-1;i++){
                if(strs[i].charAt(j)==strs[i+1].charAt(j)){
                    //continue;
                }
                else{
                    System.out.println("else cond");
                    System.out.println(str1);
                }
                
            
            }
            str1=str1+(strs[0].charAt(j));
            j=j+1;
        
        
        }
        System.out.println("out of while");
        System.out.println(str1);
        
        
        
    }
}
