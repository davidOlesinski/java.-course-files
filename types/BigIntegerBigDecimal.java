package com.example.basics.data.types;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        
        
        BigInteger bigInt = new BigInteger(  "94563437835673456");
        bigInt = bigInt.add(new BigInteger( "3453456435634"));
        System.out.println("Wynik: " + bigInt);

        BigDecimal decimal = new BigDecimal("6456377564.6345634563");
        decimal = decimal.pow(3);
        decimal = decimal.subtract(new BigDecimal("123433564.634563"));
        System.out.println("Wynik: " + decimal.toString());

    }
}
