package com.example.basics.data.string_class;

public class Functions_replaceAll_replaceFirst {
    public static void main(String[] args) {

        String names = "Jan kowalski Kasia Kowalska";
        String str = names.replaceAll("Kowalska", "Zawadzka");
        System.out.println(str);

        String str2 = str.replaceFirst(" ", " Junior ");
        System.out.println(str2);
    }
}
