package com.tms.lesson9_hw.task2.run;

import com.tms.lesson9_hw.task2.utils.Util;

public class Run {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,0,0,0}, {0,1,0,0}, {0,0,0,0}};
        int[][] b = new int[][]{{1,2,3}, {1,1,1}, {0,0,0}, {2,1,0}};

        System.out.println("First matrix: ");
        Util.showMatrix(a);
        System.out.println("Second matrix: ");
        Util.showMatrix(b);

        System.out.println("Multiplication matrix: ");
        Util.showMatrix(Util.multiMatrix(a,b));


    }


}
