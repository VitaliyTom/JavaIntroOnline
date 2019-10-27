package vitaliy.tomashevich.moduleOne.cikly;

import java.util.Random;

//      Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class TaskEight {

    public static void main(String[] args) {

        int a = 636;
        int b = 635;
        int c = -1;

        int[] numberOne = new int[3];
        int[] numberTwo = new int[3];
        int[] obshchee = new int[3];

        Boolean flag = true;

        Random rnd = new Random();
        if (a < 0) {
            a *= -1;
        }
        if (b < 0) {
            b *= -1;
        }
        numberOne[0] = a % 10;
        numberOne[1] = ((a - numberOne[0]) / 10) % 10;
        numberOne[2] = ((a - numberOne[1]) / 100) % 10;

        numberTwo[0] = b % 10;
        numberTwo[1] = ((b - numberOne[0]) / 10) % 10;
        numberTwo[2] = ((b - numberOne[1]) / 100) % 10;

        System.out.print("В двух числах общиие цифры: ");

        for (int i = 0; i < numberOne.length; i++) {

            for (int j = 0; j < numberTwo.length; j++) {

                if (numberOne[i] == numberTwo[j]) {

                    for (int k = 0; k < obshchee.length; k++) {
                        obshchee[k] = numberOne[i];
                        flag = false;

                    }
                }
            }
        }

        if (flag) {
            System.out.println(" общих цифр нет :( ");
        }

        for (int i = 0; i < obshchee.length; i++) {

            System.out.print(numberOne[i]);

        }


    }

}
