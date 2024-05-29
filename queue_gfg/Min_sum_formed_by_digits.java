
package queue_gfg;
import java.util.*;

public class Min_sum_formed_by_digits {
     public static void main(String args[]){
        //System.out.println("");
        int n = 5;
        int []arr = {5, 3, 0, 7, 4};
        Arrays.sort(arr);
        long a=arr[0];
        long b=arr[1];
        long c;
        for(int i=2;i<n;i++){
            if(i%2==0){
                a=((a*10)+arr[i]);
            }
            if(i%2==1){
                b=((b*10)+arr[i]);
            }
   
        }
        c=a+b;
        System.out.println(c);
     
     }
}
