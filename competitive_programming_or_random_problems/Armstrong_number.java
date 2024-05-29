import java.util.Scanner;

public class Armstrong_number {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        String b=isArmstrong(a);
        System.out.println(b);
        
    }
    
    static String isArmstrong(int n){
        int num2=n;
        int sum=0;
        while(num2>0){
            int c=num2%10;
            int ccube=c*c*c;
            sum=sum+ccube;
            num2=num2/10;      
        }
        System.out.println(sum);
        if(sum==n){
            return "is an armstrong number";
        }
        else{

            return "is not an armstrong number";
        }
        
        
    }
    
}
