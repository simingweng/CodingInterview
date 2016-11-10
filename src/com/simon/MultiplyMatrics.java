package com.simon;

/**
 * Created by wen55527 on 11/10/16.
 */
public class MultiplyMatrics {

    public static int[][] multiply(int[][] a, int[][] b){
        int[][] result = new int[a.length][b[0].length];
        for(int row = 0; row < result.length; row++){
            for(int col = 0; col < result[0].length; col++){
                for(int i=0; i< a[0].length; i++){
                    result[row][col]+=a[row][i]*b[i][col];
                }
            }
        }
        return result;
    }

}
