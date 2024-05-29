
package oop_theory;
import java.util.*;

class super_first{
    void add(int a,int b){
        int c=a+b;
        System.out.println(c);
        
    }
    
}
class super_second extends super_first{
    void add(int a,int b){
        System.out.println(a);
        System.out.println(b);
        super.add(a, b);
    }
    
}

public class java_super_keyword {
    public static void main(String args[]){
        //System.out.println();
        super_second ob= new super_second();
        ob.add(3,4);
    }
        
}
