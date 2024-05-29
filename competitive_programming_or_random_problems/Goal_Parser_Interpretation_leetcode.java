import java.util.*;
public class Goal_Parser_Interpretation_leetcode {
     public static void main(String[] args){
        String command = "G()()()()(al)";
        int length1=command.length();
        String str2="";
        for (int i=0;i<length1;i++){
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                str2=str2+"o";
                i=i+1;
                continue;
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                str2=str2+"al";
                i=i+3;
                continue;
            }
            if(command.charAt(i)=='G'){
                str2=str2+"G";
                
                continue;
            }
        }
        System.out.println(str2);
     }
    
}
