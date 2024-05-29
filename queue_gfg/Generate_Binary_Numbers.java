
package queue_gfg;

import java.util.*;
public class Generate_Binary_Numbers {
    public static void main(String args[]){
        //Scanner in= new Scanner(System.in);
    //    int a=01;
    //    int b=01;
    //    int c=(a&b)^1;
        //String str1="";
        //System.out.println("");
        int N=5;
        ArrayList<String> res2=generate(N);
        System.out.println(res2);
        
        
        
    
    }
    static ArrayList<String> generate(int N)
    {
        ArrayList<String> res=new ArrayList<>();
        while(N>0){
            String str1="";
            //System.out.println(N);
            int num=N;
            while(num>0){
            
            Integer d=num%2;
            str1=d.toString()+str1;
            num=num/2;
            }
            //System.out.println(str1);
            res.add(num, str1);
            
            N=N-1;
    
        }
        return res;
        
    }
    
}
