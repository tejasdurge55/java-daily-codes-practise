//https://leetcode.com/problems/reverse-string/

//Example 1:
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
//
//Example 2:
//Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]

package leetcode_strings_easy;
import java.util.*;
public class Reverse_String {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s); 
    }
    static  void reverseString(char[] s) {
        int len=s.length;
        int n=len-1;
        System.out.println(reversestrarr(s, n,len).toArray());
    }
    static ArrayList<Character> reversestrarr(char[] s,int n,int len){
        ArrayList<Character> lista=new ArrayList<>();
        if(n==0){
            lista.add(s[len-1]);
            return (lista);
        }
        lista=reversestrarr( s,n-1,len);
        lista.add(s[len-n-1]);
        return lista;
    }
}
