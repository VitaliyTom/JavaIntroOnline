package vitaliy.tomashevich.moduleOne.cycles;

import java.util.Random;

//      Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class TaskEight {
    public static void main(String[] args) {

        int[] numberOne = new int[3];
        int[] numberTwo = new int[3];
        int[] general = new int[3];


        boolean flagNoIdenticalDigits = true;             //  флаг если нету одинаковых цифр
        boolean flagDuplicateDigits = true;               //  флаг если дубликат цифр

        Random rnd = new Random();

        int a = rnd.nextInt(999);       //  число a
        System.out.print("a = " + a + ", ");

        int b = rnd.nextInt(999);       //  число b
        System.out.println("b = " + b);

        numberOne[0] = a % 10;
        numberOne[1] = ((a - numberOne[0]) / 10) % 10;
        numberOne[2] = ((a - numberOne[1]) / 100) % 10;

        numberTwo[0] = b % 10;
        numberTwo[1] = ((b - numberTwo[0]) / 10) % 10;
        numberTwo[2] = ((b - numberTwo[1]) / 100) % 10;

        System.out.print("В двух числах общие цифры: ");

        for (int i = 0; i < numberOne.length; i++) {

            for (int j = 0; j < numberTwo.length; j++) {

                if (numberOne[i] == numberTwo[j]) {         //  если цифры одинаковые

                    for (int k = 0; k < general.length; k++) {

                        flagDuplicateDigits = true;

                        if (general[k] == numberOne[i] && numberOne[i] != 0) {  // проверка на дубликат цифры...
                            // ...в общем массиве.
                            flagDuplicateDigits = false;                        // если цифра уже есть в массиве...
                            break;
                        }
                    }

                    if (flagDuplicateDigits) {                                    //  ...то пропускаем
                        general[i] = numberOne[i];
                        System.out.print(general[i] + ", ");
                        flagNoIdenticalDigits = false;
                        break;
                    }
                }
            }
        }

        if (flagNoIdenticalDigits) {
            System.out.println(" общих цифр нет :( ");
        }
    }
}

