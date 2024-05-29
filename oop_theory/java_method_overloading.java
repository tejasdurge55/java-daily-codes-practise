
package oop_theory;

class overloading1{
    void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
}
class overloading2 extends overloading1{
    void add(float a,float b){
        float c=a+b;
        System.out.println(c);
    }
}
        
public class java_method_overloading {
    public static void main(String args[]){
        //System.out.println();
        overloading2 ob=new overloading2();
        ob.add(10, 11);
        ob.add(2.2f, 3.3f);
    }
    
}
