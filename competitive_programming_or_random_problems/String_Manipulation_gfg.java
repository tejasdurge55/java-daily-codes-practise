
package stacks_gfg;
import java.util.*;
public class String_Manipulation_gfg {
    public static void main(String[] args) {
        int n=5;
        //int n=4;
        Vector<String> v = new Vector<>();
        v.add("ab"); 
        v.add("aa");
        v.add("aa");
        v.add("bcd");
        v.add("ab");
        
//        v.add("tom"); // "tom", "jerry", "jerry", "tom"
//        v.add("jerry");
//        v.add("jerry");
//        v.add("tom");
        int c=removeConsecutiveSame(v);
        System.out.println(c);
        
    }
    static int removeConsecutiveSame(Vector <String > v) 
    {
        int len1=v.size();
        int a=len1;
        for (int i = 0; i < a; i++) {
            int len2=v.size();
            for (int j = 0; j < len2-1 ; j++) {
                if (v.get(j).equals(v.get(j+1))) {
                    //System.out.println(v);
                    v.remove(j);
                    v.remove(j);
                    len2=len2-2;
                    //System.out.println(v);
                }
            }
        }
        int len3=v.size();
        //System.out.println(v);

        return len3;
        
       
//        int len1=v.size();
//        for (int i = 0; i < len1/2; i++) {
//            for (int j = 0; j < len1-1; j++) {
//                if (v.get(j)==v.get(j+1)) {
//                    v.remove(j);
//                    v.remove(j+1);
//                    len1-=2;
//                    
//                }
//            }
//        }
//        int len2=v.size();
//        return len2;
    }
}

