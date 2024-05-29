//https://practice.geeksforgeeks.org/problems/prime-number2314/1

//Input:
//N = 5
//Output:
//1
//Explanation:
//5 has 2 factors 1 and 5 only.
package recursion_basics;
import java.util.*;
public class prime_numbers_recursive {
    public static void main(String[] args) {
        int N=514;
        System.out.println(isPrime(N));
    }
    
    static int isPrime(int N){
        return divide(N-1,N);
        
    }
    static int divide(int N,int num){
        if (N==1) {
            return 1;
        }
        if(num%N==0){return 0;}
        return divide(N-1,num);
    }
}
