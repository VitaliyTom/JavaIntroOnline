package vitaliy.tomashevich.linejnye_programmy;

import java.util.Scanner;

//      Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class TaskTwo {

    public static void main(String[] args) {

        float a;
        float b;
        float c;
        double z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите a : ");
        a = sc.nextFloat();

        System.out.println("Введите b : ");
        b = sc.nextFloat();

        System.out.println("Введите c : ");
        c = sc.nextFloat();

        z = ((b + Math.sqrt((b * b) + (4 * a * c))) / (2 * a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2);

        System.out.println(z);

    }
}
