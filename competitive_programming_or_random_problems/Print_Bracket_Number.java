
package stacks_gfg;
import java.util.*;


public class Print_Bracket_Number {
    public static void main(String[] args) {
        String S = "(((ezj)f())())t(";
        ArrayList<Integer> a=barcketNumbers( S);
        for (Integer i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    static ArrayList<Integer> barcketNumbers(String S) {
        
        int len1=S.length();
        Stack<Integer> st=new Stack<>();
        int bopen=0;
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < len1; i++) {
            if(S.charAt(i)=='('){
                bopen+=1;
                st.push(bopen);
                lista.add(bopen);
                
            }
            if(S.charAt(i)==')'){
                int b=st.pop();
                lista.add(b);
            }
            
        }
        return lista;
        
        

    }
}
