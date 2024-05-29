
package oop_theory;

import java.util.*;

class box{
    int len1,breadth,height;
    
    void get(){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the length :");
    len1=in.nextInt();
    System.out.print("Enter the breadth :");
    breadth=in.nextInt();
    System.out.print("Enter the height :");
    height=in.nextInt();
    
    }
    
    int volume(){
    
    int volume1=(len1*breadth*height);
    return(volume1);
    }

}
public class java_class_volume {
    public static void main(String args[]){
        // java code for finding volume
        /*
        box b=new box();
        b.get();
        int volume2=b.volume();
        System.out.println(volume2);
        */
      //----------------------------------------------------------------
        // java code for displaying record for n boxes,array of objects
        /*
        Scanner in=new Scanner(System.in);
        System.out.print("Enter total boxes: ");
        int n=in.nextInt();
        box a[]=new box[n];
        int v;
        for (int i=0;i<n;i++){
            a[i]=new box();
            a[i].get();
            v=a[i].volume();
            System.out.println("volume is: "+v);
        }
        v=a[1].volume();
        System.out.println("volume is: "+v);
        */
        //----------------------------------------------------------------
        Scanner in=new Scanner(System.in);
        System.out.print("Enter total boxes: ");
        int n=in.nextInt();
        int len2=0,bre1=0,hig1=0;
        box a[]=new box[n];
        int max=0;
        for (int i=0;i<n;i++){
            a[i]= new box();
            a[i].get();
            int v=a[i].volume();
            if(v>max){
                max=v;
                len2=a[i].len1;
                bre1=a[i].breadth;
                hig1=a[i].height;
                
            }
        }
        System.out.println("max volume is "+max);
        System.out.println("max length is "+ len2);
        System.out.println("max breadth is "+ bre1);
        System.out.println("max height is "+ hig1);
        
        
      
      
    }
    
    
    
}
