
package Deque_questions;
import java.util.*;
public class priority_queue_basics {
    public static void main(String[] args) {
         // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println("PriorityQueue: " + numbers);

        // Using the remove() method
        boolean result = numbers.remove(2);
        System.out.println("PriorityQueue: " + numbers);        
        System.out.println("Is the element 2 removed? " + result);

        // Using the poll() method
        int number = numbers.poll();
        System.out.println("PriorityQueue: " + numbers);        
        System.out.println("Removed Element Using poll(): " + number);
    }
}
