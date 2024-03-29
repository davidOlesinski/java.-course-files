package com.example.basics.data.string_class;

public class StringBasicExample {
    public static void main(String[] args) {

        String s1 = "hello world!";
        String s2 = new String("String passed to constructor");

        String s3 = "TEST".repeat(5);
        System.out.println(s3);

        String s4 = String.join("/", "1", "222", "3", "4", "5");
        System.out.println(s4);

        char arr[]= {'O', 'L', 'A'};
        String s5 = new String(arr);
        System.out.println(s5);
    }
}
