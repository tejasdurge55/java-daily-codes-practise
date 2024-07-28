//https://www.geeksforgeeks.org/problems/gf-series3535/1?page=1&category=Recursion&sortBy=difficulty


public class g_f_series_gfg {
    public static void main(String[] args) {
        int n=6;
        gfSeries(n);
    }


    public static void gfSeries(int N){
        int [] arr=new int[N];
        int b=recursive(N,arr);
        for (int i=0;i<(arr.length-1);i++) {
            System.out.print(arr[i]+ " ");
        } 
        System.out.println();   
    }
    public static int recursive(int n,int[] arr){
        if(n==1){
            arr[0]=0;
            return 0;
        }
        if(n==2){
            arr[1]=1;
            return 1;
        }
        int ans=(int)(Math.pow(recursive(n-2,arr),2)-recursive(n-1,arr));
        arr[n-1]=ans;
        return ans;
    }


}
