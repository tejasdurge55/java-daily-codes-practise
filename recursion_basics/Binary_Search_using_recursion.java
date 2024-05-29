//https://leetcode.com/problems/binary-search/

 

//Example 1:
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
//
//Example 2:
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1
 
package recursion_basics;

import java.util.*;
public class Binary_Search_using_recursion {
    public static void main(String[] args) {
       int[] nums ={-1,0,3,5,9,12}; 
       int target =12; 
        System.out.println(search( nums,  target));
    }
    static int search(int[] nums, int target) {
        int start=0;
        int len=nums.length;
        int end=len-1;
        return(binsearch( nums,  target, start, end));
    }
    static int binsearch(int[] nums, int target,int start,int end){
        int mid=(int)(start+end)/2;
        //System.out.println(Arrays.toString(nums));
        if(end<start){return -1;}
        if(nums[mid]==target){return mid;}
        //Input: nums = [-1,0,3,5,9,12], target = 9
        //Output: 4
        else if(nums[mid]<target){
            
            return binsearch( nums,  target,mid+1 , end);
        }
        else if(nums[mid]>target){
            
            return  binsearch( nums,  target,start , mid-1);
        }
        
        return -1;
    }
}
