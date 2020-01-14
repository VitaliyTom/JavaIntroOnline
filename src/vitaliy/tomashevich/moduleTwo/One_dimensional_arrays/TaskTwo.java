package vitaliy.tomashevich.moduleTwo.One_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

//      Дана последовательность действительных чисел а1 ,а2 ,..., аn.
//      Заменить все ее члены, большие данного Z, этим
//      числом. Подсчитать количество замен.

public class TaskTwo {

    public static void main(String[] args) {

        int z;
        int n;
        int replacement = 0;
        int[] mass;

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        n = rnd.nextInt(25);

        do {
            System.out.println("Введите число Z : ");

            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Введите число Z : ");
            }

            z = sc.nextInt();

        } while (z < 0 || z > 25);

        mass = new int[n];
        System.out.println("N = " + n);

        for (int i = 0; i < mass.length; i++) {

            mass[i] = rnd.nextInt(25);
            System.out.print(mass[i] + ". ");

            if (mass[i] > z) {
                mass[i] = z;
                replacement++;
            }
        }
        System.out.println(" ");

        for (int i = 0; i < mass.length; i++) {

            System.out.print(mass[i] + ". ");
        }
        System.out.println("\n" + "Количество замен = " + replacement);
    }
}
