//https://www.geeksforgeeks.org/find-union-and-intersection-of-two-unsorted-arrays/
package Hashset;
import java.util.*;
public class Intersection_of_two_arrays {
    public static void main(String[] args) {
        int n=5,m=3;
        int a[]={ 7, 1, 5, 2, 3, 6 };
        int b[]={ 3, 8, 6, 20, 7 };
        System.out.println(doIntersection( a,  n,  b,  m));
    }
    public static int doIntersection(int a[], int n, int b[], int m) 
    {
        ArrayList<Integer> lista=new ArrayList<> ();
        HashSet<Integer> set =new HashSet<> ();
        for (int i : b) {
            set.add(i);
        }
        for (int i : a) {
            if (set.contains(i)) {
                lista.add(i);
                set.remove(i);
            }
        }
        System.out.println(lista);
        return lista.size();
    }
}
