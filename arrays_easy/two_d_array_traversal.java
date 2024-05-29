
package arrays_easy;
import java.util.*;

public class two_d_array_traversal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][] arr1={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16},
                        {17,18,19,20}};
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
            }
        }
    }
}
