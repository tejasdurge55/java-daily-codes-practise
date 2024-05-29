
package hashmap;
import java.util.*;

public class inserting_and_acessing_elements_in_Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1, "tejas");
        map.put(2, "sanket");
        map.put(4, "harsh");
        map.put(3, "vaibhav");
        System.out.println(map.get(2));
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.toString());
    }
}
