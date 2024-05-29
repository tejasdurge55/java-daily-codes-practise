
package queue_gfg;
import java.util.*;

public class Maximum_Diamonds {
    public static void main(String args[]){
        //System.out.println("Hello World");
        int N= 5; 
        int K = 3;
        int[] A = {2, 1, 7, 4, 2};
//        
//        int sum=0;
//        for (int i=0;i<K;i++){
//            int ind=maxindex(A,N);
//            int a=A[ind];
//            sum=sum+a;
//            a=a/2;
//            A[ind]=a;
//        }
//        
//        System.out.println(sum);

        LinkedList<Integer> q = new LinkedList<>();
        for (int i=0;i<N;i++){
            q.add(A[i]);
        }
        //System.out.println(q);
        int sum=0;
        for (int i=0;i<K;i++){
            int ind=maxindex(q,N);
            int a=q.get(ind);
            sum=sum+a;
            a=a/2;
            q.set(ind, a);
            //System.out.println(q);
        }
        System.out.println(sum);
        
         
    }
    static int maxindex(LinkedList<Integer> q,int N){
        
//        int max=arr1[0];
//        int maxindex=0;
//        for (int i=0;i<N;i++){
//            if(arr1[i]>max){
//                max=arr1[i];
//                maxindex=i;
//            }
//        }
        int max=q.get(0);
        int maxindex=0;
        for (int i=0;i<N;i++){
            if(q.get(i)>max){
                max=q.get(i);
                maxindex=i;
            }
        }
        
        return maxindex;
    }
}
