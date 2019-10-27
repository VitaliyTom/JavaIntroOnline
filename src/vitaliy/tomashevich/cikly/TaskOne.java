package vitaliy.tomashevich.cikly;

import java.util.Scanner;

//      Напишите программу, где пользователь вводит любое целое положительное число.
//      А программа суммирует все числа от 1 до введенного пользователем числа.

public class TaskOne {

    public static void main(String[] args) {

        int number;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Введите любое целое положительное число: ");

            while (!sc.hasNextInt()) {  //проврка на целое число
                sc.next();
                System.out.print("Введите любое целое положительное число: ");
            }

            number = sc.nextInt();
        } while (number < 0);           //проверка на отрицательное число и 0

        for (int i = 1; i < number; i++) {
            sum = i + sum;
        }

        System.out.println(sum);
    }
}
