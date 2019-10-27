package vitaliy.tomashevich.moduleOne.linejnye_programmy;

import java.util.Scanner;

//      Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class TaskThree {

    public static void main(String[] args) {

        float x;
        float y;
        double z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите x : ");
        x = sc.nextFloat();

        System.out.println("Введите y : ");
        y = sc.nextFloat();

        z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

        System.out.println("\n" + "Значение выражения равно: " + z);

    }
}
