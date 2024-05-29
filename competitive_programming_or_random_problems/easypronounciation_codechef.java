import java.util.*;
public class easypronounciation_codechef {
    public static void main(String args[]){
        //System.out.println("Hello World");   
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            
            char[] ch1={'a','e','i','o','u'};
            
            int length1=in.nextInt();
            
            String str1=in.next();
            int count=0;
            int truthvalue=1; 
            for(int i=0;i<length1;i++){
                count=count+1;
                for(int j=0;j<5;j++){
                    char a=str1.charAt(i);
                    char b=ch1[j];
                    //System.out.println(a);
                    //System.out.println(b);
                    
                    if(b==a){
                        //.out.println("in 1");
                        truthvalue=1;
                        count=0;
                        break;
                    }
                   
                }
            if(count>=4){
                //System.out.println("in 0");
                truthvalue=0;
                break;
                }
            
            }
            if(truthvalue==1){
                System.out.println("YES");
            }
            if(truthvalue==0){
                System.out.println("NO");
            }

            t=t-1;
        }
    }
    
}
    


