//  https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;
import java.util.List;

public class letter_combinations_of_a_phone_number {
    public static void main(String[] args) {
        String digits = "23";
         List<String> list=letterCombinations(digits);
         System.out.println(list);
    }

    public static void combo(String digits) {
        String up = "";
        String p = digits;
        combo2(up, p);
    }

    public static void combo2(String up, String p) {
        if(p.isEmpty()){
            System.out.println(up);
            return;
        }
        int a=(p.charAt(0)-'0')-2;
        //  System.out.println(a);
        for(int i =3*a;i<=((3*(a+1))-1);i++){
            String passnext=Character.toString((char)('a'+i));
            combo2(up+passnext,p.substring(1) );
        }

    }

    public static List<String> letterCombinations(String digits) {
        String up = "";
        String p = digits;
        
        List<String> listTwo=new ArrayList<String>();
        combo3(up, p,listTwo);
        return listTwo;

    }
    public static void combo3(String up, String p,List<String> arr) {
        if(p.isEmpty()){
            arr.add(up);
            return;
        }
        int a=(p.charAt(0)-'0')-2;
        //  System.out.println(a);
        for(int i =3*a;i<=((3*(a+1))-1);i++){
            String passnext=Character.toString((char)('a'+i));
            combo3(up+passnext,p.substring(1),arr );
        }

    }

}