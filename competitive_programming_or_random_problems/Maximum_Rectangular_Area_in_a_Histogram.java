//https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1
package stacks_gfg;
import java.util.*;
public class Maximum_Rectangular_Area_in_a_Histogram {
    public static void main(String[] args) {
        long hist[] = {6,2,5,4,5,1,6};
        long n=7;
        System.out.println(getMaxArea( hist,  n));
    }
    
    static long getMaxArea(long hist[], long n) 
    {
        long left[];
        left=new long[(int)(n)];
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty()){
                int top=(int)hist[stack.peek()];
                int current=(int) hist[i];
                
                if(top<current){
                    left[i]=stack.peek();
                    stack.push(i);
                    break;
                }
                else{
                    stack.pop();
                    
                    
                }
            }
            if(stack.isEmpty()){
                left[i]=-1;
                stack.push(i);
            }
        }
        System.out.println(Arrays.toString(left));
        
        
        long[] right=new long[(int)(n)];
        
        ArrayDeque<Integer> stackr=new ArrayDeque<>();
        for (int i =(int) n-1; i >= 0; i--) {
            while(!stackr.isEmpty()){
                int top=(int)hist[stackr.peek()];
                int current=(int) hist[i];
                
                if(top<current){
                    right[i]=stackr.peek();
                    stackr.push(i);
                    break;
                }
                else{
                    stackr.pop();
                    
                    
                }
            }
            if(stackr.isEmpty()){
                right[i]=n;
                stackr.push(i);
            }
        }
        System.out.println(Arrays.toString(right));
        long maxarea=0L;
        for (int i = 0; i < n; i++) {
            int area=(int)((right[i]-left[i])-1)*(int)hist[i];
            if(area>maxarea){
                maxarea=area;
            }
        }
        
        return maxarea;
    }
}
