package oop_theory;

class printsomething{

    printsomething(){
        System.out.println("something");
    }
    static void display(){
        System.out.println("displayed");
    }
     void printanything(){
        System.out.println("anything");
    }
}

public class java_print_from_a_class {
    public static void main(String[] args) {
        printsomething a = new printsomething();
        //a.printsomething();
        //printsomething.printsomething();
        
        printsomething.display();
        a.display();
        
        //printsomething.printanything();-----gives error
        a.printanything();
        
    }
}
