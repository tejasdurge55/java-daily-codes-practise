
package recursion_basics;
import java.util.*;

public class Recursively_find_sum_of_digits {
    public static void main(String[] args) {
        int A = 191487, B = 382;
        //191487 382
        System.out.println(SumofDigits( A,B));
    }
    static int SumofDigits(int A, int B)
    {
        long c=(long)Math.pow(A, B);
        return (int)recursivefunc(c);
        
    }
    static long recursivefunc(long num){
        if(num<10){
            return num;
        }
        long n=num;
        long sum=0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        return recursivefunc(sum);
    }
}
