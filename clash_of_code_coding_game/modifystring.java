/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clash_of_code_coding_game;

import java.util.*;
import java.io.*;
import java.math.*;

public class modifystring {



    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String badText = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        if(badText.length()>0){
            String sb=badText;
            String str2="";
            
            for(int i=0;i<badText.length();i++){
                String sb1= sb.toLowerCase();
                //System.out.println(sb1);
                if(sb1.charAt(i)=='4'){str2+="a";}
                if(sb1.charAt(i)=='3'){str2+="e";}
                if(sb1.charAt(i)=='1'){str2+="i";}
                if(sb1.charAt(i)=='0'){str2+="0";}
                if(sb1.charAt(i)==' '){str2+=" ";}
                if((int)(sb1.charAt(i))>(int)('z') || (int)(sb1.charAt(i))<(int)('a')){
                }
                else{str2+=sb1.charAt(i);}
                
                


            }
            System.out.println(str2);
        }
        if(badText.length()==0){System.out.println("IRRECOVERABLE");}
        
    }
    

    
}
//import java.util.*;class Solution{public static void main(String args[]){String a=new Scanner(System.in).nextLine().replaceAll("[^a-zA-Z4310 ]",""),n="aeio4310",z="";for(char c:a.toCharArray()){int i=n.indexOf(c);z=z+(i>3?n.charAt(i-4):c);}System.out.print(z.isEmpty()?"IRRECOVERABLE":z);}}