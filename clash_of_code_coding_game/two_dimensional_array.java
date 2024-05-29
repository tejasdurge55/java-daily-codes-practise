/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clash_of_code_coding_game;

import java.util.*;
import java.io.*;
import java.math.*;
public class two_dimensional_array {
    

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        char [][] arr=new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j]='.';
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
       
        for (int i = 0; i < M; i++) {
            String coord = in.next();
            
            int m=Integer.parseInt(coord.substring(1,2));
            int n=Integer.parseInt(coord.substring(3,4));
            arr[n][m]='X';
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
    
    
    

