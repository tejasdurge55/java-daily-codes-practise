import java.util.*;
import java.lang.*;

public class Round_Down_Price {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //System.out.println("hii");
        int t=in.nextInt();
        while(t>0){
            int s1=in.nextInt();
            int c=round_down(s1);
            System.out.println(c);
            
            t=t-1;
        
        }
    }
    static int round_down(int s1){
        
        int a=(int)(Math.log10(s1));
        
        //System.out.println(a);
        int d=(int)(Math.pow(10,a));
        int b=s1-d;
        
        return b;
                
    
    }
}
