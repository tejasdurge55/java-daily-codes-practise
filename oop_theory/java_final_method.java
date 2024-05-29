
package oop_theory;
import java.util.*;

class final_first{
    final void show(){
        
        System.out.println("first class");
        
    }
    
}
class final_second extends final_first{
    //cannot override final method
    /*
    void show(){ 
    
        
        System.out.println("second class");
        
    }
    */
}
public class java_final_method {
    public static void main(String args[]){
        //System.out.println();
        final_second ob= new final_second();
        ob.show();
    }
          
}
