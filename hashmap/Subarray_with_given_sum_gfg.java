//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
//Input:
//N = 5, S = 12
//A[] = {1,2,3,7,5}
//Output: 2 4
package hashmap;
import java.util.*;
public class Subarray_with_given_sum_gfg {
    public static void main(String[] args) {
        int n=10,s=15;
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(subarraySum( arr,  n,  s) );
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        HashMap<Integer,Integer> map=new HashMap<> ();
        ArrayList<Integer> lista =new ArrayList<> ();
        int cursum=0,start=0,end=-1;
        
        for (int i = 0; i < n; i++) {
            cursum+=arr[i];
            if (cursum-s==0) {
                start=0;
                end=i;break;
            }
            if(!map.isEmpty()){
                if(map.containsKey(cursum-s)){
                    start=map.get(cursum-s)+1;
                    end=i;
                    break;
                }
            }
            map.put(cursum, i);
        }
        if(end==-1){
            lista.add(-1);
        }
        else{
            lista.add(start+1);
            lista.add(end+1);
        }
        return lista;
    }
}
