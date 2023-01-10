package com.example.basics.data.control_flow_statements;

public class CodeBlock {
    public static void main(String[] args) {

        if (5<10)
        {
            int a = 5;
            System.out.println("a: " + a);
        }

        int b = 12;
        int num = 100;
        {
            int a = 5;
            System.out.println(a);
            System.out.println(b);
        }
        {
            int value = 9;
            {
                int test = 8;
                {
                    System.out.println(value);
                    System.out.println(test);
                    System.out.println(b);
                }
            }
        }

    }
}
