
package stacks_gfg;
import java.util.*;

public class Clone_a_stack_without_using_extra_space {
    public static void main(String args[]){
        System.out.println("Hello World");
        int N = 4;
//        Stack<Integer> st, Stack<Integer> cloned
        

        Stack<Integer> st=new Stack<>();
        st.push(1);st.push(1);st.push(2);st.push(2);
        System.out.println(st);
//        st.s
        Stack<Integer> cloneda=new Stack<>();
        for (int i=0;i<N;i++){
        
        cloneda.push(st.pop());
//        System.out.println(st);
//        System.out.println(cloneda);
        }
        Stack<Integer> cloned=new Stack<>();
        for (int i=0;i<N;i++){
        
        cloned.push(cloneda.pop());
//        System.out.println(st);
//        System.out.println(cloneda);
        }
        System.out.println(st);
        System.out.println(cloned);
    }
    
    
    
}
