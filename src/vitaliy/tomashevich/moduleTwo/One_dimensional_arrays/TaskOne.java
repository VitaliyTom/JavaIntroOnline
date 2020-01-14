package vitaliy.tomashevich.moduleTwo.One_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

//      В массив A [N] занесены натуральные числа.
//      Найти сумму тех элементов, которые кратны данному К.

public class TaskOne {
    public static void main(String[] args) {

        int n;
        int k;
        int sum = 0;
        int[] mass;

        Scanner scr = new Scanner(System.in);
        Random rnd = new Random();

        do {
            System.out.println("Введите натуральное число n : ");
            while (!scr.hasNextInt()) {
                scr.next();
                System.out.println("Введите натуральное число n : ");
            }
            n = scr.nextInt();
        } while (n < 0 || n > 100);

        do {
            System.out.println("Введите натуральное число k : ");
            while (!scr.hasNextInt()) {
                scr.next();
                System.out.println("Введите натуральное число k : ");
            }
            k = scr.nextInt();
        } while (k < 0 || k > 100);

        mass = new int[n];

        for (int i = 0; i < mass.length; i++) {

            mass[i] = rnd.nextInt(100);
            System.out.println("mass[" + i + "] = " + mass[i]);
            if (mass[i] % k == 0) {
                sum = sum + mass[i];
            }
        }
        System.out.println("\n" + "Сумма элементов кратных " + k + " = " + sum);
    }
}
