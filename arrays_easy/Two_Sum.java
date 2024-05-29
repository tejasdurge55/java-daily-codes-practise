//https://leetcode.com/problems/two-sum/

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]

package arrays_easy;

import java.util.*;
public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        
        System.out.println(Arrays.toString(twoSum(nums, target) ));
    }
    static int[] twoSum(int[] nums, int target) {
        int t=(target);
        int a=0;
        int b=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(i, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            
                if (arr.contains(t-arr.get(i))) {
                    a=arr.indexOf(t-arr.get(i));
                    b=i;
                    if(a==b){
                        continue;
                    }
                    break;

                }
            
        }
        int[] arr2={a,b};
        return arr2;
    }
}
