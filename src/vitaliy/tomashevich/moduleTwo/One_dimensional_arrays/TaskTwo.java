package vitaliy.tomashevich.moduleTwo.One_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

//      Дана последовательность действительных чисел а1 ,а2 ,..., аn.
//      Заменить все ее члены, большие данного Z, этим
//      числом. Подсчитать количество замен.

public class TaskTwo {

    public static void main(String[] args) {

        double z;
        int n;
        int replacement = 0;
        double[] mass;

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        n = rnd.nextInt(25);

        do {
            System.out.println("Введите число Z : ");

            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.println("Введите число Z : ");
            }

            z = sc.nextDouble();

        } while (z < -25 || z > 25);

        mass = new double[n];
        System.out.println("N = " + n);

        for (int i = 0; i < mass.length; i++) {

            mass[i] =  Math.round((rnd.nextDouble()*50-25) * 10000d) / 10000d;  // берем диапазон от [-25;25)
                                                                                // и оставляем 4 нуля после запятой
            System.out.print(mass[i] + ", ");

            if (mass[i] > z) {
                mass[i] = z;
                replacement++;
            }
        }
        System.out.println(" ");

        for (int i = 0; i < mass.length; i++) {

            System.out.print(mass[i] + ", ");
        }
        System.out.println("\n" + "Количество замен = " + replacement);
    }
}
