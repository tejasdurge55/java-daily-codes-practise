/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_easy;

import java.util.*;
//https://practice.geeksforgeeks.org/problems/second-largest3735/1?page=1&difficulty[]=-2&sortBy=submissions       
public class second_largest_gfg {
    public static void main (String args[]){
        int n=6;
        int arr1[]={12,35,1,10,34,1};
        System.out.println(print2largest( arr1, n));
        
    }
    public static int print2largest(int arr1[], int n) {
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr1[i]>largest){  
                second=largest;
                largest=arr1[i];
            }
            if(arr1[i]>second && arr1[i]<largest){                
                second=arr1[i];
            }
        }
        if(second==Integer.MIN_VALUE || second==largest)
            {
                return(-1);
            }
        else{return(second);}
    }
}
