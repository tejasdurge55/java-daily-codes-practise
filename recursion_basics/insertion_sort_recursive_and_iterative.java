//https://practice.geeksforgeeks.org/problems/insertion-sort/1

//Input:
//N = 5
//arr[] = { 4, 1, 3, 9, 7}
//Output:
//1 3 4 7 9


package recursion_basics;

import java.util.*;
public class insertion_sort_recursive_and_iterative {
    
    public static void main(String[] args) {
        int N = 10;
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort(arr,N);
    }
    static void insert(int arr[],int a)
  {
        if(a==0){return;}
        
            for (int j = 0; j < a-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    j=j-1;
                }
                //System.out.println(Arrays.toString(arr));
                
            }
            insert(arr, a-1);
            
            
        
       
    }
  
  //Function to sort the array using insertion sort algorithm.
  static void insertionSort(int arr[], int n)
  {
        System.out.println(Arrays.toString(arr));
        insert(arr,n);
        System.out.println(Arrays.toString(arr));
        
  }
}
