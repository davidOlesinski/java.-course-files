package com.example.basics.data.operators;

import java.sql.SQLOutput;

public class Op2_incrementation_decrementation {
    public static void main(String[] args) {

        int a = 10;
       // a++;
        a--;
        System.out.println(a);

        int b = 5;
        int c = 10 + b++;
        System.out.println(c);
        System.out.println(b);

        int d = 5;
        int e = 10 + ++d;
        System.out.println("e:" + e);
        System.out.println("d:" + d);
    }
}
