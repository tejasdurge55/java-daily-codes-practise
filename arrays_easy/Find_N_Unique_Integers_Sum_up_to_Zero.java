//https://leetcode.com/submissions/detail/832095279/
package arrays_easy;

class Solution {
    public int[] sumZero(int n) {
        int[] arr1 = new int[n];
        int  j=0;
        if(n==1){
            arr1[0]=0;
            return arr1;
        
        }
        else if(n%2==0){
            int a=(-n/2);
            for(int i=a;i<=-1;i++){
                arr1[j]=i;
                j=j+1;
            }
            for(int i=1;i<=(-a);i++){
                arr1[j]=i;
                j=j+1;
            }
            return arr1;
        
        }
        else if(n%2==1){
            int a=(-n/2);
            for(int i=a;i<=-1;i++){
                arr1[j]=i;
                j=j+1;
            }
            arr1[j]=0;
            j=j+1;
            for(int i=1;i<=(-a);i++){
                arr1[j]=i;
                j=j+1;
            }
            return arr1;
        
        }
        return arr1;
    }
}
public class Find_N_Unique_Integers_Sum_up_to_Zero {
    
}
