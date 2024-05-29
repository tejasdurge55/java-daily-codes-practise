import java.util.Scanner;
public class prime_number {
    public static void main(String args[]){
//        System.out.println("hello world");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
//        System.out.println(n);
        String c=isPrime(n);
        System.out.println(c);
        
    
    }
    
    static String isPrime(int a){
        if(a<=1){
            return "not prime";
        }
        int b=2;
        while(b*b<=a){
            if(a%b==0){
                return "not prime";
            }
            b=b+1;
        }
        return "prime";
    
    }
    
}
