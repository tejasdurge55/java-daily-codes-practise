
package leetcode_strings_easy;
import java.util.*;


public class Long_Pressed_Name {
    public static void main(String args[]){
        //System.out.println("Hello World");
        String name = "vtkgn";
        String typed = "vttkgnn";
        int len1=name.length();
        String str1;
        String str2;
        int j=0;
        for(int i =0;i<len1;i++){
            str1=Character.toString(name.charAt(i));
            int len2=typed.length();
            if(typed.contains(str1)){
                
                System.out.println("inside if");
                int a=typed.indexOf(str1);
                String sub=typed.substring(a+1,len2);
                typed=sub;
            }
            else{
                
                System.out.println("false");
   
            }
            System.out.println(typed);
            System.out.println(str1);
            j=i;
            
            
        }
        
        if(typed.isEmpty()){
        System.out.println("true");
        }
        str1=Character.toString(name.charAt(j));
        if(typed.equals(str1)){
            System.out.println("true");
        }
        else{System.out.println("false");}
        

    }

}
