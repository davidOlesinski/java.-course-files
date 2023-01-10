package com.example.basics.data.programs;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double startCapital = 0;
        double yearlyInterest = 0;
        int numYears = 0;

        double finalCapital;

        System.out.println("Wpisz kapital poczatkowy: ");
        startCapital = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz roczne oprocentowanie: ");
        yearlyInterest = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("wpisz ilosc lat oszczedzania: ");
        numYears = in.nextInt();
        //numYears = Integer.valueOf(in.nextLine()).intValue();

        finalCapital = startCapital * Math.pow(1 + (yearlyInterest/ 100.0d), numYears);
        System.out.println("Efekt oszczedzania z procentem skladnym: " + Math.round(finalCapital) + "zl");
    }
}
