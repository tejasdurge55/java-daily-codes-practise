
package hashmap;
import java.util.*;
//only for finding max freq in the string
public class frequency_of_letters_using_hashmap {
    public static void main(String[] args) {
        String a="abeaicaidaoaaaabbbbbbbbbbbbbbbbbbbbbbbbbb";
        String str1=a;
        HashMap<String,Integer> map=new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            
            if(!map.containsKey(str1.substring(i, i+1))){
                map.put(str1.substring(i, i+1), 1);
            }
            else{
                map.put(str1.substring(i, i+1), map.get(str1.substring(i, i+1))+1);
            }
        }
        
    
       
        System.out.println(map);
        
            String maxKey="";
    int maxValue = 0;
        for(String i : map.keySet())
        {
            if(map.get(i) > maxValue)
            {
                maxKey = i;
                maxValue = map.get(i);
            }
        }
        System.out.println(maxKey);
    }
           
}
