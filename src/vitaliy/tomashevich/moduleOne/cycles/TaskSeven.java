package vitaliy.tomashevich.moduleOne.cycles;

import java.util.Scanner;

//      Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//      m и n вводятся с клавиатуры.

public class TaskSeven {

    public static void main(String[] args) {

        int m;
        int n;

        Scanner sc = new Scanner(System.in);

//--------------------------------      блок валидаций      --------------------------------
        do {

            System.out.print("Введите натуральное число m: ");

            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("Введите натуральное число m: ");
            }

            m = sc.nextInt();

        } while (m < 0 || m > 65456 );          //проверка на отрицательное число и ограничение на положительное.

        do {

            System.out.print("Введите натуральное число n, большее числа m: ");

            while (!sc.hasNextInt()) {

                sc.next();
                System.out.print("Введите натуральное число n, большее числа m: ");
            }

            n = sc.nextInt();

        } while (n < 0 || n < m || n>65456);

//--------------------------------      блок валидаций конец        --------------------------------

        System.out.println(" ");

        if (m == n) {                           //если числа одинаковые - то делителей нет

            System.out.println("Делителей нет, по условию задачи!");

        } else {

            for (m = 2; m <= n; m++) {

                System.out.print("Делители числа " + m + " = ");

                boolean flag = true;            // на каждом проходе цикла считать что делителей нет, флаг=тру.

                for (int i = 2; i < m; i++) {

                    if (m % i == 0) {

                        flag = false;                   // как только есть делитель, меняем флаг на фолс и
                        System.out.print(i + ", ");     // выводим на экран делитель.

                    }
                }
                if (flag) {

                    System.out.print("делителей нет");
                }
                System.out.println(" ");
            }
        }
    }
}
