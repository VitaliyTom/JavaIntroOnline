package vitaliy.tomashevich.moduleOne.branching;

import java.util.Random;

//      Вычислить значение функции:
//      (x*x)-3x+9, если x<=3
//      1/( (x*x*x) + 6), если x>3

public class TaskFive {

    public static void main(String[] args) {

        int x;

        Random rd = new Random();

        x = rd.nextInt(15) - 7;      // от рандомного числа отнимаем 7. для получения отрицательных рандомных чисел

        System.out.println("x = " + x);

        if (x <= 3) {

            x = (x * x) - (3 * x) + 9;
            System.out.println("(x*x)-3x+9 = " + x);
        } else {

            x = 1 / ((x * x * x) + 6);
            System.out.println("1/((x*x*x) + 6) = " + x);
        }
    }
}
