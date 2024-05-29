import java.util.Scanner;
// fibonnaci series: 0,1,1,2,3,5,8,13,21
// find the 7th fibonnaci element
//here 0th element is 0,1st is 1,2nd is 1,3rd is 2,4th is 3,...so 7th will be 13
public class fibbonaci_series {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the element number: ");
        
        int a=0;
        int b=1;
        int n=input.nextInt();
        int c=0;
        for(int i=1;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            
        
        }
        System.out.println(c);
    }
    
}
