import java.util.Scanner;
public class defanging_an_ip_adress_leetcode {
    public static void main(String argsp[]){
    //System.out.println("hello");
    Scanner in=new Scanner(System.in);
    String address=in.next();
    String str1=defangIPaddr(address);
    System.out.println(str1);
    }
     static String defangIPaddr(String address) {
        
        StringBuilder builder=new StringBuilder();
        int lenstr=address.length();
        for (int i=0;i<lenstr;i++){
            if(address.charAt(i)=='.'){
                builder.append("[.]");
            }
            else{
                builder.append(address.charAt(i));
            }
        }
        return (builder.toString());
        
        
        
        
        
    }
    
    
}
