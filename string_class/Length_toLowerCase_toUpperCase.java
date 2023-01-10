package com.example.basics.data.string_class;

import java.util.Locale;

public class Length_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Ola ma kota";
        System.out.println("ilosc znakow: " + str.length());

        char sign = str.charAt(1);
        System.out.println("znak pod indeksem 1: " + sign);

        String strUp = str.toUpperCase();
        System.out.println(strUp);

        String strLowerCase = str.toLowerCase();
        System.out.println(strLowerCase);
    }
}
