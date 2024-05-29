import java.util.*;
public class DetermineifStringHalvesAreAlike {
    public static void main(String args[]){
//        System.out.println("Hello World");
        String s="textbook";
        int length1=s.length();
        char[] vowels={'a', 'e', 'i', 'o', 'u'};
        
        String lower=s.toLowerCase();
        int count1=0;
        int count2=0;
        int nby2=length1/2;
        for(int i=0;i<nby2;i++){
            if(lower.charAt(i)=='a'||lower.charAt(i)=='e'||lower.charAt(i)=='i'||lower.charAt(i)=='o'||lower.charAt(i)=='u'){
                count1=count1+1;
            }
        }
        for(int i=nby2;i<length1;i++){
            if(lower.charAt(i)=='a'||lower.charAt(i)=='e'||lower.charAt(i)=='i'||lower.charAt(i)=='o'||lower.charAt(i)=='u'){
                count2=count2+1;
            }
        }
        if(count1==count2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
        
    
    
    }
    
}
