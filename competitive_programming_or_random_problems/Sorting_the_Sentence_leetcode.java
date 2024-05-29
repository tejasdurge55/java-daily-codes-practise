import java.util.*;
public class Sorting_the_Sentence_leetcode {
    public static void main(String[] args){
//        System.out.println("Hello World");
        String s = "is2 sentence4 This1 a3";
        StringBuilder builder=new StringBuilder();
        builder.append(s);
        String[] strarr=s.split(" ");
        int n=strarr.length;
        String[] arr2=new String[n]; 
        String str3="";
//        System.out.println(Arrays.toString(strarr));
//        String str1="  HIII   ";
//        String strip = str1.strip();
//        System.out.println(strip);
//        String str2=strip.substring(0, 2);
//        System.out.println(str2);
        
        int length1=strarr.length;
        for(int i=0;i<length1;i++){
//            int len2=strarr[i].length();
//            String str1=strarr[i];
//            for(int j=0;j<len2;i++){
//                
//            }
            int len2=strarr[i].length();
//            char ch=(char)(i);
            String str1=strarr[i];
            char ch=str1.charAt(len2-1);
            int index=Character.getNumericValue(ch);
            arr2[index-1]=str1.substring(0,len2-1 );
            
        
            
        
        
        }
//        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<n;i++){
            str3=str3+arr2[i] +" " ;
        }
        String strip2 = str3.strip();
        System.out.println(strip2);
        
        

    }
    
}
