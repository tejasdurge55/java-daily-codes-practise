
package oop_theory;
import java.util.*;

/*class first1{
int x,y;
void set(int x,int y){
this.x=x;
this.y=y;
}
}*/


class Address{
    
    String city,state,country;
    
    public Address(String city,String state,String country ){
        this.city=city;
        this.state=state;
        this.country=country;
    }

}


public class java_this_keyword {
    
    int id;
    String name;
    Address address;
    
    public java_this_keyword(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    
    void display(){
        System.out.println(id +" "+ name+" "
                + address.city+" "+ address.state+" "+ address.country );
    }
    
    public static void main(String args[]){
        /*
        //System.out.println("");
        first1 ob=new first1();
        ob.set(5,7);
        System.out.println("x= "+ob.x);
        System.out.println("y= "+ob.y);
        */
        
        Address ad1=new Address("pune","Maharashtra","India");
        Address ad2=new Address("panaji","goa","India");
        
        java_this_keyword student1=new java_this_keyword(1,"tejas",ad1);
        java_this_keyword student2=new java_this_keyword(2,"sanket",ad2);
        
        student1.display();
        student2.display();
        
        
    }
    
}
