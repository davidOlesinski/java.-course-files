package com.example.basics.data.control_flow_statements;

public class IfStatement {
    public static void main(String[] args) {


        int a = 1;
        if (a > 5) {
            System.out.println("a jest wieksze od 5");
        } else if (a == 2) {
            System.out.println("a jest mniejsze od 5");
        } else
        {
            System.out.println("wartosc a jest rowna: " + a);
        }

        if (9 < 20)
        {
            System.out.println("9 < 20");
        }
        else
        {
            System.out.println("nie spelniony warunek");
        }
    }
}