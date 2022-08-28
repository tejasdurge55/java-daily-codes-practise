//https://practice.geeksforgeeks.org/problems/java-arraylist5312/1
package arraylists_basics;
import java.util.ArrayList;

public class ArrayList_Part_1_gfg {
    public static void main(String[] args) {
        //System.out.println("");
         int N = 4;
         int Q = 2; 
            ArrayList<Integer> A = new ArrayList<>();
            ArrayList<Integer> Query = new ArrayList<>();
            A.add(1);
            A.add(9);
            A.add(2);
            A.add(4);
            //A.add(3);
            
            Query.add(4);
            //Query.add(6);
            
            System.out.println(A.toString());
            System.out.println(Query.toString());
            ArrayList<Integer> b=solve(N,A,Q,Query);
            System.out.println(b.toString());

    }
//    static ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) 
//    { 
//        ArrayList<Integer> lista =new ArrayList<>();
//        
//        if (Q==1) {
//            int p=Query.get(0);
//            int r=Query.get(1);
//            for (int i = 0; i < p; i++) {
//                lista.add(A.get(i));
//            }
//            lista.add(r);
//            for (int i = p; i < N; i++) {
//                lista.add(A.get(i));
//            }
//            return lista;
//        }
//        if (Q==2) {
//            int p2=Query.get(0);
//            int index=-1;
//            for (int i = 0; i < N; i++) {
//                if(p2==A.get(i)){
//                    index=i;
//                }
//            }
//            lista.add(index);
//            return lista;
//        }
//        
//        return lista;        
//        
//    }
    
    //alternate solution
    
    static ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) 
   { 
       // code here
       ArrayList<Integer> res= new ArrayList<>();
       if(Q==1)
       {
           int p=Query.get(0);
           int r=Query.get(1);
           A.add(p,r);
           return A;
       }
       if(Q==2){
           res.add(A.lastIndexOf(Query.get(0)));
           return res;
       }
       else 
       {
           res.add(-1);
           return res;
       }
      
   }
    
    
}
