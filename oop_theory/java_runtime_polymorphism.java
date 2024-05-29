
package oop_theory;
import java.util.*;

class grandpa{
    void show(){
        
        System.out.println("i am grandpa");
    
    }
  
    
}
class father extends grandpa{
    
    void show(){
        
        System.out.println("i am father");
    
    }
}

class son extends father{
    
    void show(){
        
        System.out.println("i am son");
    
    }
}
public class java_runtime_polymorphism {
    public static void main(String args[]){
        //System.out.println();
        grandpa a;
        a=new grandpa();
        a.show();
        a=new father();
        a.show();
        a=new son();
        a.show();
        
        
        
    }
}
