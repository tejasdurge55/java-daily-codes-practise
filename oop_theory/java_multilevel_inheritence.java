
package oop_theory;
import java.util.*;

class multilevel1{
    int x=10;
}
class multilevel2 extends multilevel1{
    int y=20;
}
class multilevel3 extends multilevel2{
    int z=30;
}

public class java_multilevel_inheritence {
    
    public static void main(String args[]){
        //System.out.println();
        multilevel3 ob=new multilevel3();
        System.out.println(ob.x);
        
        
        System.out.println(ob.y); 
        
        
        System.out.println(ob.z);
        
    }
    
}
