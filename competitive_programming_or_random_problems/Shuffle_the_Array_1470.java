import java.util.*;
public class Shuffle_the_Array_1470 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] shuffled=shuffle(nums,n);
        System.out.println(Arrays.toString(shuffled));
    }
    
    static int[] shuffle(int[] nums, int n) {
        int[]arr1=new int[n*2];
        for(int i=0,j=0;i<n;i++){
            arr1[j]=nums[i];
            arr1[j+1]=nums[i+n];
            j=j+2;
        }
        return arr1;
        
    }
}
