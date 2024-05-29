
package oop_theory;
import java.util.*;

abstract class abstract_first{
    static void show(){
        
        System.out.println("first class");
    
    }
    abstract void fun();
    
}
class abstract_second extends abstract_first{
    
    public void fun(){ 
    
        
        System.out.println("second class");
        
    }
    
}

public class java_abstract_class {
    public static void main(String args[]){
        //System.out.println();
        abstract_second ob2= new abstract_second();
        ob2.show();
        ob2.fun();
        
//        abstract_first ob1= new abstract_first();
//        ob1.show();
//        ob1.fun();
        abstract_first.show();
        
        
    }
             
}
