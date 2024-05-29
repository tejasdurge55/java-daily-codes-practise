
package Deque_questions;
import java.util.*;
public class Queue_Reversal {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(4);q.add(3);q.add(1);q.add(10);q.add(2);q.add(6);
        System.out.println(rev(q));
    }
    static Queue<Integer> rev(Queue<Integer> q){
        ArrayDeque<Integer> q2=new ArrayDeque<>();
        Queue<Integer> q3=new ArrayDeque<>();
        int len1=q.size();
        for (int i = 0; i < len1; i++) {
            q2.add(q.peek());
            q.remove();
        }
        for (int i = 0; i < len1; i++) {
            q3.add(q2.peekLast());
            q2.removeLast();
        }
        return q3;
    }
    
}
