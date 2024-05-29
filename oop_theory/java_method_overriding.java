
package oop_theory;
class overriding1{
    void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
}
class overriding2 extends overriding1{
    void add(int a,int b){
        System.out.println("a="+a);
        System.out.println("b="+b);
        int c=a+b;
        System.out.println(c);
    }
}

public class java_method_overriding {
    public static void main(String args[]){
        //System.out.println();
        overriding1 ob=new overriding1();
        ob.add(10, 11);
        
        overriding2 ob5=new overriding2();
        ob5.add(10, 11);
        
    }    
    
}
