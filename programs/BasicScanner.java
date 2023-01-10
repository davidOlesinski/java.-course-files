package com.example.basics.data.programs;

import java.util.*;

public class BasicScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("podaj swoje imie: ");
        String name = in.nextLine();

        System.out.println("twoje imie to: " + name);
    }
}
