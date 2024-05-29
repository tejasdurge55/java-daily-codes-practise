import java.util.*;
public class interior_design_codechef {
    public static void main(String args[]){
        //System.out.println("Hello World");   
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int x1=in.nextInt();
            int y1=in.nextInt();

            int x2=in.nextInt();
            int y2=in.nextInt();
            if((x1+y1)<(x2+y2)){
                System.out.println(x1+y1);
            }
            else{System.out.println(x2+y2);}
            t=t-1;
        }
    }
    
}
