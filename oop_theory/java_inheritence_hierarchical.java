
package oop_theory;
import java.util.*;

class hierarchical1{
    int x=10;
}
class hierarchical2 extends hierarchical1{
    int y=20;
}
class hierarchical3 extends hierarchical1{
    int z=30;
}

public class java_inheritence_hierarchical {
    public static void main(String args[]){
        //System.out.println();
        hierarchical3 ob=new hierarchical3();
        System.out.println(ob.x);
        
        /*
        gives error as class2 is not part of class 3
        System.out.println(ob.y); 
        */
        
        System.out.println(ob.z);
        
    }
}
