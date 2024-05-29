
package Hashset;
import java.util.*;
public class find_distinct_elements_in_an_array {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,4,4,5,5,6,7,3,1,9};
        HashSet<Integer> set=new HashSet<>();
        for (int value : arr1) {
            set.add(value);
        }
        System.out.println(set);
        
    }
}
