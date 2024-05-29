import java.util.*;
public class thelastlevels_codechef {
    public static void main(String args[]){
            //System.out.println("Hello World");   
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while(t>0){
                int levels=in.nextInt();
                
                int complete=in.nextInt();
                
                int breakmin=in.nextInt();
                
                if(levels<=3){System.out.println(levels*complete);}
                if(levels>3){
                    if(levels%3==0){
                        int divison=(int)(levels/3);
                        int ans=(levels*complete)+((divison-1)*breakmin);
                        System.out.println(ans); 
                    }
                    else{
                        int divison=(int)(levels/3);
                        int ans=(levels*complete)+((divison)*breakmin);
                        System.out.println(ans); 
                    }
                
                }

                t=t-1;
            } 
    }
}
