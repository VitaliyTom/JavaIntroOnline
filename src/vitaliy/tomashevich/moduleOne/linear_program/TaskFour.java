package vitaliy.tomashevich.moduleOne.linear_program;

import java.util.Scanner;

//      Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//        дробную и целую части числа и вывести полученное значение числа.

public class TaskFour {

    public static void main(String[] args) {

        int n;
        double d;
        double r = 0.0;

        String insertNumber = "Введите число вида nnn.ddd: ";

        Scanner sc = new Scanner(System.in);

        System.out.print(insertNumber);

        //---блок валидаций---
        for (int i = 0; i < 1; i--) {

            while (!sc.hasNextDouble()) {           // проверка, если пришла строка
                sc.next();
                System.out.print(insertNumber);
            }

            r = sc.nextDouble();

            if (r >= 100 && r < 1000) {             // проверка целого числа [100-1000)
                i = 2;
                break;
            }

            System.out.print(insertNumber);
        }
        //---конец---

        n = (int) r;
        d = (int) ((r - n) * 1000d);   // оставляем дробную часть до тысячной и получаем целое число

        System.out.println(d + ((double) n / 1000));
    }
}



