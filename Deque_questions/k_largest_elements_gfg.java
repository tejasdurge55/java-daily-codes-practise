package Deque_questions;
import java.util.*;
public class k_largest_elements_gfg {
    public static void main(String[] args) {
        int n = 5,k = 2;
        int arr[] = {12, 5, 787, 1, 23};
        int arr3[]=kLargest(arr,  n,  k); 
        System.out.println(Arrays.toString(arr3));
    }
    static int[] kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> q =new PriorityQueue<>();
        int arr2[]=new int[k];
        for (int i = 0; i < k; i++) {
            q.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            if(q.peek()<arr[i]){
                q.remove();
                q.add(arr[i]);
            }
        }
        System.out.println(q);
        for (int i = k-1; i >= 0; i--) {
            arr2[i]=q.peek();
            q.remove();
        }
       //System.out.println();
        return arr2;
    }
}
