package com.example.basics.data.string_class;

public class StringComparison {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello";

        if(s2.equals(s1)); {
        System.out.println("s2 jest rowne s1 ");
        }
        if(s3.equals(s1));
        {
            System.out.println("s3 rowne jest s1");
        }
        if(s1.equalsIgnoreCase(s3));
        System.out.println("s1 rowne jest s3 - wielkosc znakow ingorowana ");
    }
}
