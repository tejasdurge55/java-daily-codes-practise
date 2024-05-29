
package queue_gfg;

import java.util.*;
public class Queue_Push_and_Pop {
    public static void main(String args[]){
    Scanner in= new Scanner(System.in);
    //System.out.println(c);
    int[] arr={1,2,3,4,5};
    int n=5;
    Queue<Integer> q=push(arr,n);
    _pop(q);
  }
 
    static Queue<Integer> push(int arr[], int n)
    {
        Queue<Integer> q1=new LinkedList<>() ;
        for (int i=0;i<n;i++){
            q1.add(arr[i]);
        }
        return q1;
    }
    
    static void _pop(Queue<Integer> q)
    {   
        int n1=q.size();
        for (int i=0;i<n1;i++){
        System.out.println(q.remove());
        }
    }
    
}
