package com.tms.lesson9_hw.task2.utils;

public class Util {
    public static void showMatrix(int[][] m){
        for (int[] ints : m){
            for (int aints : ints)
                System.out.print(aints + " ");
            System.out.println();
        }
    }

    public static int[][] multiMatrix(int[][] a, int[][] b){
        int[][] c = new int[a.length][b[0].length];

        for (int i = 0; i< c.length; i++){
            for (int j = 0; j < c[0].length; j++){
                c[i][j]=0;
                for (int k = 0; k < a[0].length; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
}
