package com.example.basics.data.string_class;

public class Function_lastIndexOf {
    public static void main(String[] args) {

        String str = "Raz dwa trzy cztery. Raz dwa.";

        int index = str.lastIndexOf("Raz");
        System.out.println("Ostatnie wystapienie 'raz': " + index);
        String fragment = str.substring(index);
        System.out.println("fragment: " + fragment);

        index = str.indexOf("Raz");
        System.out.println("pierwsze wystapienie 'raz': " + index);
    }
}
