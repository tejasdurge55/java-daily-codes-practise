import java.util.*;
public class build_array_from_permutation {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // arr1= new int[];
        int[] nums = {5,0,1,2,3,4};
        int [] arr1=permutation(nums);
        System.out.println(Arrays.toString(arr1));
    }
    static int[] permutation(int[] arr2){
        int[] arr3= new int[arr2.length];
        for (int i =0;i<arr2.length;i++){
            arr3[i]=arr2[arr2[i]];
            
        }
        return arr3;
    
    }
}

