import java.util.Scanner;

public class reversing_numbers {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int b,c=0,i=0;
        int a=input.nextInt();
        while(true){
            b=a%10;
            a=a/10;
            c=(c+b);
            if(a<=0){break;}
            c=c*10;
            
            
        
        }
        System.out.println(c);
        
    
    }
    
}
