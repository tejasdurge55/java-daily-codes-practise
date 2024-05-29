//https://leetcode.com/problems/next-greater-element-i/
package leetcode_stacks_and_queues;
import java.util.*;
public class Next_Greater_Element_1 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        nextGreaterElement( nums1,  nums2);
    }
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayDeque<Integer> st=new ArrayDeque<>();
        int len1=nums2.length; 
        int arr2[]=new int[len1];
        
        for (int i=len1-1;i>=0;i--) {
            while(!st.isEmpty()){
                if(st.peek()>nums2[i]){
                    arr2[i]=st.peek();
                    st.push(nums2[i]);
                    break;
                }
                else{
                    st.pop();
                }
            }
            if(st.isEmpty()){
                arr2[i]=-1;
                st.push(nums2[i]);
            }    
        }
        int arr3[]=new int[nums1.length];
        int k=0;
        for (int i : nums1) {
            
            for(int j=0;j<len1;j++){
                if(i==nums2[j]){
                    arr3[k]=arr2[j];
                    k=k+1;
                }
            }
        }
        //System.out.println(Arrays.toString(arr3));
        return arr3;
    }
}
