import java.util.*;
public class Running_Sum_of_1d_Array_1480 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] arr3=sumofarray(nums);
        System.out.println(Arrays.toString(arr3));

    }
    static int[] sumofarray(int[]nums){
        int sum=0;
        int[] arr2=new int[nums.length];
        for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        arr2[i]=sum;
        
        }
    return arr2;
    
    }
    
}
