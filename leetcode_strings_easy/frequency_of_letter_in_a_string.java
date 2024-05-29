/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode_strings_easy;
import java.util.*;


public class frequency_of_letter_in_a_string {
        public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    //System.out.println(str2);
    char[] ch=str1.toCharArray();

    int len1=ch.length;
    int[] arr1=new int[len1];

    //int lencount=0; 
    for(int i=0;i<len1;i++){
            int charcount=1;


            for(int j=i+1;j<len1;j++){
                    if(ch[j]==ch[i]){
                            charcount+=1;
                            ch[j]='_';
                    }

            }
            arr1[i]=charcount;
            //lencount=+1;


    }
    System.out.println("Frequency of characters :");
    for(int i=0;i<len1;i++){
            if(ch[i]!='_'){
                    System.out.println(ch[i]+"->"+arr1[i]);
            }

    }
    
}
        









}

