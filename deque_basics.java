
package Deque_questions;
import java.util.*;
public class deque_basics {
    public static void main(String[] args) {
        /*------very important---------stack working in original Stack class is different than in ArrayDeque stack implementation--------*/  
        
        //ArrayDeque as stack with operations
        //push() - adds an element at the beginning of deque
        //pop() - removes an element from the beginning of deque
        //peek() - returns an element from the beginning of deque
       
        System.out.println("Stack with ArrayDeque starts here------------------------------------------");
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        
        dq.add(5);dq.add(6);dq.add(7);dq.add(9);dq.add(3);dq.add(1);dq.add(12);//add-Adds element to last of arrayDeque(addLast) 
        System.out.println(dq);
        
        //stack operations with deque
        
        //push-as stack. Adds to front of arraydeque (addFront)
        dq.push(10);dq.push(11);
        System.out.println(dq);

        //pop-as stack. Removes from front of arraydeque (removeFront)
        dq.pop();
        System.out.println(dq); 

        //peek-as stack
        System.out.println(dq.peek());
        
        //isEmpty as stack
        System.out.println(dq.isEmpty());
        
        
        
        //not every method of Stack is available in ArrayDeque
        //for example the search method is available only in the Stack class
        System.out.println("actual stack datatype starts here------------------------------------------");
        Stack<Integer> st= new Stack<>();
        
        st.push(5);st.push(6);st.push(7);st.push(9);st.push(3);st.push(1);st.push(12);
        System.out.println(st);
        System.out.println("element at the top of the stack: "+st.peek());//element at the top of the stack
        System.out.println(st.search(7));//returns element located from the top of the stack
        System.out.println(st);
        st.pop();//element at the top of the stack is popped out
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        
        ArrayDeque<String> stack = new ArrayDeque<>();

        // Add elements to stack
        stack.push("Dog");
        stack.push("Cat");
        stack.push("Horse");
        System.out.println("Stack: " + stack);

        // Access element from top of stack
        String element = stack.peek();
        System.out.println("Accessed Element: " + element);

        // Remove elements from top of stack
        String remElement = stack.pop();
        System.out.println("Removed element: " + remElement);
    
        //----------------------------------------------------------------------------------------------------------
        
        //ArrayDeque as queue with operations
        System.out.println("Queue with ArrayDeque starts here------------------------------------------");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        
        //add operation to add elements to the queue
        //add() - inserts the specified element at the end of the array deque
        queue.add(20);queue.add(22);queue.add(24);queue.add(28);queue.add(23);queue.add(19);queue.add(29);//add-Adds element to last of arrayDeque(addLast)
        System.out.println(queue);
        
        //remove() - returns and removes an element from the first element of the array deque
        queue.remove();queue.remove(); //remove-Removes first element of ArrayDeque(removeFirst)
        System.out.println(queue);
        //remove(value) - returns and removes an element of that value
        queue.remove(28);
        System.out.println(queue);
        System.out.println(queue.peek());
        
        System.out.println("actual queue datatype starts here------------------------------------------");
        Queue<Integer> queue2 = new ArrayDeque<>();
        queue2.add(30);queue2.add(32);queue2.add(34);queue2.add(38);queue2.add(33);queue2.add(29);queue2.add(39); //add-Adds element to last of arrayDeque(addLast)
        //remove() - returns and removes an element from the first element of the array deque
        System.out.println(queue2);
        queue2.remove();  //remove-Removes first element of ArrayDeque(removeFirst)
        System.out.println(queue2); 
        queue2.remove();
        System.out.println(queue2);
        //remove(value) - returns and removes an element of that value
        queue2.remove(33);
        System.out.println(queue2);
        System.out.println(queue2.peek());
        
        System.out.println("actual ArrayDeque starts here------------------------------------------");
        
        //Insert Elements to Deque
        //1. Add elements using add(), addFirst() and addLast()

        //add() - inserts the specified element at the end of the array deque
        //addFirst() - inserts the specified element at the beginning of the array deque
        //addLast() - inserts the specified at the end of the array deque (equivalent to add())
        
        ArrayDeque<String> animals= new ArrayDeque<>();

        // Using add()
        animals.add("Dog");

        // Using addFirst()
        animals.addFirst("Cat");
        
        animals.add("Cow");
        // Using addLast()
        animals.addLast("Horse");
        System.out.println("ArrayDeque: " + animals);
        
        
        
        //2. Access elements using peek(), peekFirst() and peekLast() method
        //
        //peek() - returns the first element of the array deque
        //peekFirst() - returns the first element of the array deque (equivalent to peek())
        //peekLast() - returns the last element of the array deque

        // Using peek()
        
        String ele = animals.peek();
        System.out.println("Head Element: " + ele);

        // Using peekFirst()
        String firstElement = animals.peekFirst();
        System.out.println("First Element: " + firstElement);

        // Using peekLast
        String lastElement = animals.peekLast();
        System.out.println("Last Element: " + lastElement);
        
        //Remove ArrayDeque Elements
        //1. Remove elements using the remove(), removeFirst(), removeLast() method
        //remove() - returns and removes an element from the first element of the array deque
        //remove(element) - returns and removes the specified element from the head of the array deque
        //removeFirst() - returns and removes the first element from the array deque (equivalent to remove())
        //removeLast() - returns and removes the last element from the array deque
        
        // Using remove()
        ele = animals.remove();
        System.out.println("Removed Element: " + ele);

        System.out.println("New ArrayDeque: " + animals);

        // Using removeFirst()
        firstElement = animals.removeFirst();
        System.out.println("Removed First Element: " + firstElement);

        // Using removeLast()
        lastElement = animals.removeLast();
        System.out.println("Removed Last Element: " + lastElement);
        
//Other Methods
//Methods               Descriptions
//element()             Returns an element from the head of the array deque.
//contains(element)	Searches the array deque for the specified element.If the element is found, it returns true, if not it returns false.
//size()                Returns the length of the array deque.
//toArray()             Converts array deque to array and returns it.
//clone()               Creates a copy of the array deque and returns it.
        
        
    }
}
