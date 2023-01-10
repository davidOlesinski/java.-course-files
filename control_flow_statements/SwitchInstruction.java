package com.example.basics.data.control_flow_statements;

public class SwitchInstruction {

            enum carVariant {SEDAN, COMBI, SPORT}

    public static void main(String[] args) {

        int num = 10;

        switch (num)
        {
            case 1:
                System.out.println(1);
                System.out.println("ok");
                break;
            case 3:
                System.out.println(3);
                break;
            case 10:
                System.out.println(10);
                break;
            case 11:
                System.out.println(11);
                break;
            default:
                System.out.println("defult: " + num);
        }
        String str = "Ania2";

        switch(str)
        {
            case "Ola":
                System.out.println("Ola");
                break;
            case "Ania":
                System.out.println("Ania");
            default:
                System.out.println("defoult: " + str);
        }

        carVariant car = carVariant.COMBI;

        switch (car)
        {
            case COMBI:
                System.out.println(carVariant.COMBI);
                break;
            case SEDAN:
                System.out.println(carVariant.SEDAN);
                break;
            default:
                System.out.println("defoult: " + car);

        }


    }
}
