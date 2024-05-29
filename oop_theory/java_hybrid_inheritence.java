
package oop_theory;
class hybrid1{
    int x=10;
}
class hybrid2 extends hybrid1{
    int y=20;
}
class hybrid3 extends hybrid1{
    int z=30;
}
class hybrid4 extends hybrid2{
    int w=40;
}

public class java_hybrid_inheritence {
    public static void main(String args[]){
        //System.out.println();
        hybrid4 ob=new hybrid4();
        hybrid3 ob1=new hybrid3();
        System.out.println(ob.x+" "+ob.y+" "+ob.w+" "
                +ob1.z+" "+ob1.x);
        
        
       
        
    }
}
