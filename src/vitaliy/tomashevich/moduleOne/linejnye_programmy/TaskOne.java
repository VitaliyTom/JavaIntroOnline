package vitaliy.tomashevich.moduleOne.linejnye_programmy;

import java.util.Scanner;

//      Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

public class TaskOne {

    public static void main(String[] args) {

        float a;
        float b;
        float c;
        float z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите a : ");
        a = sc.nextFloat();

        System.out.println("Введите b : ");
        b = sc.nextFloat();

        System.out.println("Введите c : ");
        c = sc.nextFloat();

        z = ((a - 3) * b / 2) + c;

        System.out.println("\n" + "z = " + z);


    }
}
