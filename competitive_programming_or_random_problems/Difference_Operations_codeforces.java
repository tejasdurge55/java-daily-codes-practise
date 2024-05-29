import java.util.*;

public class Difference_Operations_codeforces {
    public static void main(String args[]){
//        System.out.println("Hello world");
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int n=in.nextInt();
            int[] arr1=new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=in.nextInt();
            }
            //System.out.println(Arrays.toString(arr1));
            while(true){
                int reqindex=maxindex1(arr1,n);
                if(arr1[reqindex]==0){
                    //System.out.println(Arrays.toString(arr1));
                    System.out.println("YES");
                    
                    break;
                
                }    
                //System.out.println(arr1[reqindex]);
                int indexminus1=reqindex-1;
                
                arr1[reqindex]=(arr1[reqindex]-arr1[indexminus1]);
                if(arr1[indexminus1]==0){
                    System.out.println("NO");
                    break;
                
                }
                //System.out.println(Arrays.toString(arr1));
             
            }
            
            
            
            t=t-1;
        }
        
    
    }
    static int maxindex1(int[] arr2,int size1){
        int maxnumindex=size1-1;
        int maxnum=arr2[size1-1];
        for(int i=size1-1;i>0;i--){
                if(arr2[i]>maxnum){
                    maxnumindex=i;
                    maxnum=arr2[i];
                }
            }
        return maxnumindex;
    
    
    } 
}
