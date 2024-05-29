import java.util.*;
public class yetanotherpalindromemakingproblem_codechef {
    public static void main(String args[]){
        //System.out.println("Hello World");   
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int ans=0;
            int length1=in.nextInt();
            String str1=in.next();
            char[] arr1=new char[length1];
            for (int i=0;i<length1;i++){
                arr1[i]=str1.charAt(i);
            }
//           char[] arr5=arr1;
//            System.out.println(arr5==arr1);
//            System.out.println(Arrays.toString(arr1));
            char[] arr4=reverse1(arr1,length1);
//            System.out.println(Arrays.toString(arr4));
            for (int i=0;i<length1-2;i++){
                if(arr1[i+2]==arr4[i]){
                    
                    char temp=arr1[i];
                    arr1[i]=arr1[i+2];
                    arr1[i+2]=temp; 
                }
                arr4=reverse1(arr1,length1);
                if(Arrays.equals(arr1, arr4)){
//                    System.out.println("is palindrome");
                    ans=1;
//                    System.out.println(Arrays.toString(arr1));
//                    System.out.println(Arrays.toString(arr4));
                    break;
                }
//                System.out.println(Arrays.toString(arr1));
//                System.out.println(Arrays.toString(arr4));
                
            }
            if(ans==1){System.out.println("YES");}
            if(ans==0){System.out.println("NO");}
            
            
            
            
                        
            
       
            t=t-1;
        }
    }
    static char[] reverse1(char[] arr2,int n){
        char[] arr3=new char[n];
        int j=-1;
        for(int i=0;i<n;i++){
            arr3[i]=arr2[n-i-1];
            j=j-1;
    
        }
        return arr3;
    
    }
    
}
