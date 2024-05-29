import java.util.Scanner;

public class no_of_times_the_element_occurs {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int count=0;
        
        System.out.println("Enter a number :");
        String s=input.nextLine();
        int len=s.length();
        System.out.println("Enter the number to be found :");
        
        char find=input.nextLine().charAt(0);
        for(int i=0;i<len;i++){
            if(s.charAt(i)==find){
                count=count+1;
            
            }
        
        }
        System.out.println(count);
        
    
    }
    
}
