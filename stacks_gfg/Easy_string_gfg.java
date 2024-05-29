
package stacks_gfg;

import java.util.*;
public class Easy_string_gfg {
    public static void main(String[] args) {
        String S = "aaABBb";
        String ans=transform( S);
        System.out.println(ans);
    }
    static String transform(String S) 
    {   
        S=S+" ";
        S=S.toLowerCase();
        //System.out.println("");
        ArrayList<String> lista=new ArrayList<>(); 
        lista.add(S.substring(0, 1));
        int count=0;
        int count2=0;
        String str1="";
        for (int i = 0; i < S.length(); i++) {
            if (S.substring(i, i+1).equals(lista.get(count))) {
                count2=count2+1;
            }
            else{
                lista.add(S.substring(i, i+1));
                str1=str1+Integer.toString(count2);
                str1=str1+lista.get(count);
                count=count+1;
                count2=1;
                
            }
        }
        
        return str1;
    }
}
