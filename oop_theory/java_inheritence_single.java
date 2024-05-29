
package oop_theory;
import java.util.*;

class inheritence_first{
    int x=10;
    void show(){
        System.out.println("x="+x);
    }

}
class inheritence_second extends inheritence_first{
    int y=20;
    void disp(){
        System.out.println("x="+x);
    }

}

public class java_inheritence_single {
    public static void main(String args[]){
        inheritence_second ob=new inheritence_second();
        ob.show();
        ob.disp();
        
    }
}
