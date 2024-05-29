//https://leetcode.com/problems/lucky-numbers-in-a-matrix/

//Example 1:
//
//Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
//Output: [15]
//Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
//Example 2:
//
//Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
//Output: [12]
//Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
//Example 3:
//
//Input: matrix = [[7,8],[1,2]]
//Output: [7]
//Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

package arrays_easy;
import java.util.*;
public class Lucky_Numbers_in_a_Matrix {
    public static void main(String[] args) {
        
        int [][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers (matrix) );
    }
    static List<Integer> luckyNumbers (int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        List<Integer> arr=new ArrayList<>();
        List<Integer> min=new ArrayList<>();
        List<Integer> max=new ArrayList<>();
        
        for (int i = 0; i < rows; i++) {
            int min1=matrix[i][0];
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j]<min1) {
                    min1=matrix[i][j];
                }
            }
            min.add(min1);
        }
        for (int i = 0; i < cols; i++) {
            int max1=matrix[0][i];
            for (int j = 0; j < rows; j++) {
                if (matrix[j][i]>max1) {
                    max1=matrix[j][i];
                }
            }
            max.add(max1);
        }
        //System.out.println(min);
        //System.out.println(max);
        for (Integer integer : max) {
            if(min.contains(integer)){
                arr.add(integer);
            }
        }
        //System.out.println(arr);
        return arr;
    }
}
