import java.util.*;
public class concatenation_of_array_1929 {
    public static void main(String[] args){
        int[] nums = {1,2,1};
        int[] arr3=concatenation(nums);
        System.out.println(Arrays.toString(arr3));
        
    
    }
    static int[] concatenation(int[] arr1){
        int j=0;
        int[] arr2=new int[(arr1.length)*2];
        for(int i=0;i<2;i++){
            int k=0;
            for (;k<arr1.length;j++,k++){
                arr2[j]=arr1[k];           
            }
            
        }
        return arr2;
    }
    
}
