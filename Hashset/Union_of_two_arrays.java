//https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
package Hashset;
import java.util.*;
public class Union_of_two_arrays {
    public static void main(String[] args) {
        int n=5,m=3;
        int a[]={ 7, 1, 5, 2, 3, 6 };
        int b[]={ 3, 8, 6, 20, 7 };
        System.out.println(doUnion( a,  n,  b,  m));
    }
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> set =new HashSet<> ();
        for (int i : b) {
            set.add(i);
        }
        for (int i : a) {
            set.add(i);
        }
        return set.size();
    }
}
