//https://practice.geeksforgeeks.org/problems/earthquake-and-the-paint-shop4518/1?page=1&category[]=Map&sortBy=accuracy
package hashmap;
import java.util.*;
public class Earthquake_and_the_Paint_Shop {
    public static void main(String[] args) {
        int N = 5;
        
        String A[] =
        {"2234597891 zmxvvxbcij 8800654113 jihgfedcba",
        "1234567891 zxyabcvapo 0123434908 padmadngaa",
        "1234567891 abcdefghij 9876543219 jihgfedcba",
        "2234597891 zmxvvxbcij 8800654113 jihgfedcba",
        "9120121291 zmxvvxbcij 0912114113 mnvxbedcba"};
        //System.out.println(Arrays.toString(sortedStrings( N,  A) ));
        alphanumeric[] ans=sortedStrings( N,  A);
        
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i].name+" "+ans[i].count);
        }
    }
    static alphanumeric[] sortedStrings(int N, String A[]) {
        //HashMap<String,Integer> map=new HashMap<> ();
        Map<String,Integer> map = new TreeMap<>();
        Arrays.sort(A);
        for (String ele : A) {
            if(!map.containsKey(ele)){
                map.put(ele, 1);
                
            }
            else{
                map.put(ele, map.get(ele)+1);
                
            }
            
            //alphaarr[i]=new alphanumeric(ele,map.get(ele));
            //i=i+1;
        }
        int sz=map.size();
        alphanumeric[] alphaarr=new alphanumeric[sz];
//        map.keySet();
//        for (int i = 0; i < sz; i++) {
//            alphaarr[i].name=map.get
//        }
        int i=0;
        for (Map.Entry<String,Integer> entry : map.entrySet()){ 
            alphaarr[i]=new alphanumeric(entry.getKey(),entry.getValue());
            i=i+1;
        }
        return alphaarr;
    }
}
class alphanumeric {
    public String name;
    public int count;
    alphanumeric(String name, int count) {
        this.name = name;
        this.count = count;
    }
};