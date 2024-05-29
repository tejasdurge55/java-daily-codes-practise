import java.util.*;
public class bullseye_tcs_bulb_steps {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
//        System.out.println(str1);    
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int add=n;
            int count=0;
            while(n>0){
                count=count+n;
                n=n-1;
            }
            add=add+count;
            System.out.println(add);
        }
    }
}
