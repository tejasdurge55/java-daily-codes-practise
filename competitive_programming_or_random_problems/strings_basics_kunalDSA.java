import java.util.*;
public class strings_basics_kunalDSA {
    public static void main(String[] args){
        System.out.println("hello world");
        String name="Tejas Durge";
        System.out.println(name);
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3)) ;
        System.out.println("a" + 1);
        // integer will, be converted to Integer that wilt call toString()
        
        String series="";
        for (int i=0;i<26;i++) {
        char ch= (char)('a'+i);
        //System.out.println(ch);
        series=series+ch;
        }
        System.out.println(series);
        
        
        //better complexity code for adding char to string
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<26;i++) {
        char ch = (char)('a' + i);
        builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder);
        
    
    }
}
