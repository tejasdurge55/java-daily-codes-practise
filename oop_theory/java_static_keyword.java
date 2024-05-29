
package oop_theory;
import java.util.*;

class first{
    int x;
    static int y=12;
    
    
}
public class java_static_keyword {
    public static void main(String args[]){
        //System.out.println("");
        first obj=new first();
        System.out.println("X= "+obj.x);
        System.out.println("Y= "+obj.y);
        System.out.println("Y= "+first.y);
    
    }
    
}
