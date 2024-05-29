import java.util.*;
public class Richest_Customer_Wealth_1672 {
    public static void main(String[] args){
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        int max1=maximumWealth(accounts);
        System.out.println(max1);

    }
    static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int row=0;row<accounts.length;row++){
            int sum=0;
            for(int col=0;col<accounts[row].length;col++){
                sum=sum+accounts[row][col];
                
            
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
        
    }
    
}
