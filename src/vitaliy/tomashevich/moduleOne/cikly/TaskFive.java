package vitaliy.tomashevich.moduleOne.cikly;

import java.util.Scanner;

// Даны  числовой  ряд  и  некоторое  число  е.
// Найти  сумму  тех  членов  ряда,  модуль  которых  больше  или  равен
// заданному е. Общий член ряда имеет вид:
//       1     1
// an = --- + ---
//       2n    3n -> n степень

public class TaskFive {

    public static void main(String[] args) {

        double i = 0d;
        double e;
        double a;
        double sum = 0d;

        String EnterNubmer = "Введите число больше нуля : ";

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print(EnterNubmer);
            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.print(EnterNubmer);
            }
            e = sc.nextDouble();

        } while (e <= 0);

        do {
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

            if (a >= e) {
                sum += a;
            }
            i++;

        } while (a >= e);

        System.out.println("Сумма членов ряда равна : " + Math.round(sum * 10000d) / 10000d);
    }
}
