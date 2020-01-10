package vitaliy.tomashevich.moduleOne.linear_program;

import java.util.Scanner;

//      Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//      данное значение длительности в часах, минутах и секундах в следующей форме:
//      ННч ММмин SSc.

public class TaskFive {
    public static void main(String[] args) {

        long t;
        int hour;
        int minute;
        int second;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Введите натуральное число : ");
            while (!sc.hasNextLong()) {     // валидация на строку
                sc.next();
                System.out.println("Введите натуральное число : ");
            }

            t = sc.nextLong();

        } while (t < 0 || t > 922337203);   //  валидация на отрицательное число (для 24h добавить || t > 86400)

        hour = (int) t / 3600;
        minute = (int) ((t - (hour * 3600)) / 60);
        second = (int) t - (hour * 3600) - (minute * 60);

        System.out.println(hour + "ч " + minute + "мин " + second + "с ");
    }
}
