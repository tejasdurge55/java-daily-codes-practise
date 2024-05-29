
package queue_gfg;
import java.util.*;

public class ReverseFirstKelementsofQueue {
    public static void main(String args[]){
        //System.out.println("");

        int n=5;
        int k=3;
        int[] arr1={1,2,3,4,5};
        Queue<Integer> q=new LinkedList<Integer>();
        for (int i=0;i<n;i++){
            q.add(arr1[i]);
        }
        Queue<Integer> ans=modifyQueue(q,k);
        System.out.println(ans);
                
    
    
    
    }
    static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> s2=new Stack<>();
        Queue<Integer> q2=new LinkedList<>();
        for (int i=0;i<k;i++){
            int a=q.remove();
            s2.push(a);
        }
        System.out.println(s2);
        for (int i=0;i<k;i++){
            q2.add(s2.pop());
        }
        System.out.println(q2);
        int len1=q.size();
        for (int i=0;i<len1;i++){
            q2.add(q.remove());
        }
        return(q2);
        
        
    }
}
