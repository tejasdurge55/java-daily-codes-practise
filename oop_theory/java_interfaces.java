
package oop_theory;

interface abc1{
    void show();
    
}
interface abc2 extends abc1{
    void fun();
    
}
class xyz implements abc2{
    public void show(){
        System.out.println("inside show");
}
    public void fun(){
        System.out.println("inside fun");
    }
}

public class java_interfaces {
    public static void main(String args[]){
        //System.out.println();
        xyz ob=new xyz();
        ob.show();
        ob.fun();
    }
}
