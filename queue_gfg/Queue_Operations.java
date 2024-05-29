
package queue_gfg;
import java.util.*;
public class Queue_Operations {
    public static void main(String args[]){
       Scanner in= new Scanner(System.in);
       int n=in.nextInt();
       int size1=n;
       Queue<Integer> q=new LinkedList<Integer>();
       while(n-->0){
           int a=in.nextInt();
           insert(q,a);
       
       }
       int k=in.nextInt();
       while(k-->0){
           int b=in.nextInt();
           int c=findFrequency(q,b);
           System.out.println(c);
       }
       
    
    }
    static void insert(Queue<Integer> q, int k){
        
        q.add(k);
        
    }
    
    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
        int count=0;
        int negative=-1;
        int size2=q.size();
        while(size2-->0){
            if(q.contains(k)){
                count=count+1;
                q.remove(k);
            }
            else if(!q.contains(k)&&count==0){
                return(-1);
            }
            else{
                return(count);
            }
            
        }
        return count;
    }
}
