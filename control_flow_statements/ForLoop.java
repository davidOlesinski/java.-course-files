package com.example.basics.data.control_flow_statements;

public class ForLoop {
    public static void main(String[] args) {

        int arr[] = { 1, 5, 10, 15, 20 };

        for (int i = 0; i < arr.length; i += 2)
        {
            int value = arr[i];
            System.out.println("arr: " + value);
        }

        String names [] = {"Ala", "Ola", "Adam", "Iza"};

        for(int i = names.length - 1; i >= 0; i--)
        {
            String str = names[i];
            System.out.println("imie: " + str);
        }
    }
}
