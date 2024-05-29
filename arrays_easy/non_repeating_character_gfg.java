/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_easy;

import java.util.*;
//https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
public class non_repeating_character_gfg {
    
    public static void main(String args[]){
        
        String str1="hello";
        System.out.println(nonrepeatingCharacter( str1));
        
        
        
    }
    static char nonrepeatingCharacter(String str1)
    {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>(); 
       
        char [] arr1=new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            arr1[i]=str1.charAt(i);
            if (!hm.containsKey(str1.charAt(i))) {
                hm.put(str1.charAt(i), 1);
            }
            else{
                hm.put(str1.charAt(i), hm.get(str1.charAt(i))+1);
            }
            
        }
        System.out.println(hm);
        for (int i = 0; i < str1.length(); i++) {
            if(1==hm.get(str1.charAt(i))){ //hello //h
                return(str1.charAt(i));
                
            }
            
        }
        return '$';
    }
    
    
    
    
}
