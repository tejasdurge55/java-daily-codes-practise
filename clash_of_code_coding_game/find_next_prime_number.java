
package clash_of_code_coding_game;
import java.util.*;

public class find_next_prime_number {
    

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        int ans=x;
        
        while(true){
            int flag=1;
            //System.out.println(flag+" in while");
            ans=ans+1;
            //System.out.println(ans);
            for(int i=2;i<=ans-1;i++){
                
                if(ans%i==0){
                    flag=0;
                    //System.out.println(flag+" in break-----");
                    break;
                    
                }
                
            }
            if(flag==1){break;}

        }
        System.out.println(ans);
    }
    
       
    }

    

