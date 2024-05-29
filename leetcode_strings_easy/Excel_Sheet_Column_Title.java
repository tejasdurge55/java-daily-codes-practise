
package leetcode_strings_easy;

import java.util.*;
public class Excel_Sheet_Column_Title {
    public static void main(String args[]){
        //Scanner in=new Scanner(System.in);
        int n=1355;
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            n--;
            int curr = n%26;
            n /= 26;
            sb.append((char)(curr+'A'));
        }
        System.out.println(sb.reverse().toString());
    
    
    
    
    }
}
