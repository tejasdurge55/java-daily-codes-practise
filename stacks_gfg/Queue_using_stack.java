
package stacks_gfg;
import java.util.*;


public class Queue_using_stack {
    public static void main(String args[]){
    System.out.println("Hello World");
    Stack<Integer> input = new Stack<Integer>(); 
    
    
    Stack<Integer> output = new Stack<Integer>();
    input.push(1);input.push(1);input.push(2);input.push(3);input.push(5);
    System.out.println(input);
    
    enqueue(input,6);
    enqueue(input,7);
    System.out.println(input);
    dequeue(input);
    dequeue(input);
    dequeue(input);
    System.out.println(input);
    }
    static int dequeue(Stack<Integer> input)
    {
        Stack<Integer> input2 = new Stack<Integer>();
        int len1=input.size();
        for (int i=0;i<len1-1;i++){
            input2.push(input.pop());
        }
        int a=input.pop();
        for (int i=0;i<len1-1;i++){
            input.push(input2.pop());
        }
        return a;
                
	    
    }
	
    /* The method push to push element into the stack */
    static void enqueue(Stack<Integer> output,int x)
    {
        output.push(x);
	    	
    }
    
    
}
