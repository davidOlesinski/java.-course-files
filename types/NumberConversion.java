package com.example.basics.data.types;

public class NumberConversion {
    public static void main(String[] args) {


        //jawna
        int i = 5;
        double d = 20.0d / (double)i;
        System.out.println(d);

        //niejawna
        int a = 4;
        double b = 10d * a;
        System.out.println(b);

        //casting
        double d2 = 5.0;
        int num = (int) (10 * d2);
        System.out.println(num);

        byte small =(byte)200;
        System.out.println("small: " + small);


    }
}
