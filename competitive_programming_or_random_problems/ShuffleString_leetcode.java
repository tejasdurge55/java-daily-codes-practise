import java.util.*;
public class ShuffleString_leetcode {
    public static void main(String args[]){
//        System.out.println("Hello World");
//        Scanner in=new Scanner(System.in);
//        int t=in.nextInt();
//        while(t>0){
//            
//            
//            t=t-1;
//        }
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        int length1=indices.length;
        char[] ans=new char[length1];
//        String str2="";
//        String str1="";
//        for (int i=0;i<length1;i++){
//            for (int j=0;j<length1;j++){
//                if(indices[j]==i){
//                    str1=str1+s.charAt(j);
//                    break;
//                
//                }
//                
//            }
//            
//        }
//        System.out.println(str1);
        int a;
        for (int i=0;i<length1;i++){
            a=indices[i];
            ans[a]=s.charAt(i);
        }
//        System.out.println(Arrays.toString(ans));
         String str3=new String(ans);
         System.out.println(str3);
        
        
        
        
        
    }
    
    
}
