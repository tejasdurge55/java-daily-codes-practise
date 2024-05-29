//https://leetcode.com/problems/plus-one/
//Example 1:
//
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//Example 3:
//
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].

package arrays_easy;

import java.util.*;

public class Plus_One {
    public static void main(String[] args) {
        int[] digits = { 8, 9, 9, 9 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne(int[] digits) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        // if(digits[digits.length-1]==9){
        // digits[digits.length-1]=1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 10) {
                if (i == 0) {
                    digits[i] = 0;
                    arr1.add(1);
                    break;
                }
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            } else {
                break;
            }
        }
        for (int i = 0; i < digits.length; i++) {
            arr1.add(digits[i]);
        }

        // arr1.add(0);
        int[] ans = new int[arr1.size()];
        for (int i = 0; i < arr1.size(); i++) {
            ans[i] = arr1.get(i);
        }
        return ans;
    }
    // else{
    // for (int i = 0; i < digits.length-1; i++) {
    // arr1.add(digits[i]);
    // }
    // arr1.add(digits[digits.length-1]+1);
    // int[] ans =new int[arr1.size()];
    // for (int i = 0; i < arr1.size(); i++) {
    // ans[i]=arr1.get(i);
    // }
    // return ans;
    // }
    // long sum=0;
    //
    // for (int i = 0; i < digits.length; i++) {
    // sum=sum+(digits[i]*((long)Math.pow(10, digits.length-1-i)));
    // //System.out.println(sum);
    // }
    // //System.out.println(sum);
    // sum=sum+1;
    // //System.out.println(sum);
    // double sum2=0;
    // while(sum>0){
    // //int a=(int)()
    // arr1.add((int)(sum%10));
    // //System.out.println(sum%10);
    // sum=sum/10;
    // //System.out.println(sum);
    // //System.out.println(arr1.toString());
    // }
    // //System.out.println(arr1.toString());
    // int[] ans =new int[arr1.size()];
    // for (int i = 0; i < arr1.size(); i++) {
    // ans[i]=arr1.get(arr1.size()-1-i);
    // }
    // return ans;
}
