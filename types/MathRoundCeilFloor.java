package com.example.basics.data.types;

public class MathRoundCeilFloor {
    public static void main(String[] args) {

        //zaokraglanie do liczby calkowitej
        System.out.println(Math.round(5.53));
        System.out.println(Math.round(5.43));

        //rzutowanie, utrata czesci ulamkowej
        System.out.println((int) 5.45d);

        //Math.celi() najwieksza mozliwa liczba calkowita
        System.out.println(Math.ceil(6.11));

        System.out.println(Math.floor(6.11));
    }
}
