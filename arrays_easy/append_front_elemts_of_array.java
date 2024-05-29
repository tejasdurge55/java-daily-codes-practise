
package arrays_easy;
import java.util.*;
public class append_front_elemts_of_array {
    public static void main(String[] args){
        //System.out.println("hello world");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1= new int[n];
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int[] arr2= new int[n];
        int j=0;
        for (int i=b;i<n;i++){
            arr2[j]=arr1[i];
            j=j+1;
        }
        
        int[] arr3= new int[b];
        for (int i=0;i<b;i++){
            arr3[i]=arr1[i];   
        }
        int k=0;
        for (int i=j;i<n;i++){
            arr2[i]=arr3[k];
            k=k+1;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
