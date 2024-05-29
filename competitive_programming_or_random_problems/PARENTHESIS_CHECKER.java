import java.util.*;
public class PARENTHESIS_CHECKER {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
        
        String str1=in.next();
        int len1=str1.length();
//        System.out.println(str1);
//        System.out.println(len1);
        
        String str2=balanced(str1,len1);
        System.out.println(str2);
        t=t-1;
        }
    
    }
    static String balanced(String str1, int len1){
        //System.out.println(str1);
        //System.out.println(len1);
        String str2="balanced";
        String str3="not balanced";
        
        if(len1%2==1){
            return("not balanced");
        }
        for (int i=0;i<len1/2;i++){
//            System.out.println(str1.charAt(i));
//            System.out.println(str1.charAt(len1-i-1));
            if(str1.charAt(i)=='(' && str1.charAt(len1-i-1)!=')' ){
                return(str3);
            }
            if(str1.charAt(i)=='{' && str1.charAt(len1-i-1)!='}' ){
                return(str3);
            }
            if(str1.charAt(i)=='[' && str1.charAt(len1-i-1)!=']' ){
                return(str3);
            }
            
        }
        return(str2);
    
    }
}
