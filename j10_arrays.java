package com.example.basics.data;

public class j10_arrays {
    public static void main(String[] args) {
        int numArr [] = new int[10];
        numArr[1] = 7;
        System.out.println("numArr[1]: " + numArr[1] + "numArr.lenght: " + numArr.length);

        float floatArr[] = {10.1f, 123.78f, 78.3f, -99.9f };
        floatArr[0] = 1.0f;

        System.out.println("floatsArr[1]: " + floatArr[1] + " floatArr.length: " + floatArr.length);

        String strArr[] = new String[7];
        System.out.println("strArr[1]: " + strArr[1]);

        String namesArr[] = {"Ola", "Ania", "Karol"};
        System.out.println("namesArr[1]" + namesArr[1]);


    }
}
