package com.example.basics.data.string_class;

public class Functions_isEmpty_isBlank {
    public static void main(String[] args) {

        String emptyStr = "";
        String blankStr = "     \n    ";

        if (emptyStr.isEmpty())
        {
            //true
            System.out.println("emptyStr jest pusty - isEmpty()");
        }

        if (blankStr.isEmpty())
        {
            //true
            System.out.println("blankStr isEmpty()");
        }
        else
        {
            //false
            System.out.println("blankStr nie jest pusty - isEmpty()");
        }

        if(blankStr.isBlank())
        {
            System.out.println("blankStr 0 znakow lub same biale znaki - isBlank()");
        }
    }
}
