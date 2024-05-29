import java.util.Scanner;
public class classesinjava {
    public static void main(String args[]){
        System.out.println("Hello World");
        Student tejas=new Student();
        tejas.rollno=53;
        tejas.name="tejas durge";
        tejas.marks=80.8f;
        
        Student Sanket=new Student();
        Sanket.rollno=5;
        Sanket.name="sanket joshi";
        Sanket.marks=68.3f;
        
        System.out.println(tejas.rollno);
        System.out.println(tejas.name);
        System.out.println(tejas.marks);
        
        System.out.println(Sanket.rollno);
        System.out.println(Sanket.name);
        System.out.println(Sanket.marks);
    }
    
    
}
class Student{
    int rollno;
    String name;
    float marks;
    
    
    
}
 