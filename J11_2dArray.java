package com.example.basics.data;

public class J11_2dArray {
    public static void main(String[] args) {
        String strArr[][] = {
                {"1", "2", "3", "a"},
                {"4", "5", "6",}
        };

        System.out.println(strArr[0][3]);
        System.out.println(strArr[1][2]);

        int numArr[][] = new int[3][4];
        numArr[1][2] = 100;

        int numRows = 10;
        int numCols = 15;
        int arr[][] = new int[numRows][numCols];
    }
}
