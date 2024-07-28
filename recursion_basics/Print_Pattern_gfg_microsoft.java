import java.util.ArrayList;
import java.util.List;

public class Print_Pattern_gfg_microsoft {
    public static void main(String[] args) {
        int n=16;
        System.out.println(pattern(n));
    }
    public static List<Integer> pattern(int N){
        List<Integer> lista=new ArrayList<Integer>();
        helper(N,lista);
        return lista; 
    }
    public static void helper(int n,List<Integer> listb){
        if(n<=0){
            listb.add(n);
            return;
        }
        listb.add(n);
        helper(n-5,listb);
        listb.add(n);
    }
}
