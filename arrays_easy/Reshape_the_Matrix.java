//https://leetcode.com/problems/reshape-the-matrix/

//Example 1:
//
//
//Input: mat = [[1,2],[3,4]], r = 1, c = 4
//Output: [[1,2,3,4]]
//Example 2:
//
//
//Input: mat = [[1,2],[3,4]], r = 2, c = 4
//Output: [[1,2],[3,4]]

package arrays_easy;
import java.util.*;


public class Reshape_the_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}}; 
        int r = 2;
        int c = 2;
       
        int[][] ans2=(matrixReshape( mat,  r,  c) );
        for(int i=0;i<ans2.length;i++){
                for(int j=0;j<ans2[0].length;j++){
                    System.out.print(ans2[i][j]);
                }
                System.out.println();
        }
        
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        //if(r==1){
            int n = mat.length, m = mat[0].length;
            if (r*c != n*m) return mat;
            int k=0;
            c=(mat.length*mat[0].length)/r;
            
            int [] arr1=new int[mat.length*mat[0].length];
            int[][] ans=new int[r][c];
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    arr1[k++]=mat[i][j];
                }
            }
            k=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    ans[i][j]=arr1[k++];
                }
            }
            return ans;
        //}
    }
}
