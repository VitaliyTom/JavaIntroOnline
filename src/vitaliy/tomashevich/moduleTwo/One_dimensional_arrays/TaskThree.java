package vitaliy.tomashevich.moduleTwo.One_dimensional_arrays;


//      Дан  массив  действительных  чисел,  размерность  которого  N.
//      Подсчитать,  сколько  в  нем  отрицательных,
//      положительных и нулевых элементов.

import java.util.Random;

public class TaskThree {

    public static void main(String[] args) {

        int n;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        double[] mass;

        Random rnd = new Random();
        n = rnd.nextInt(15);
        System.out.println("N = " + n);
        mass = new double[n];

        for (int i = 0; i < mass.length; i++) {

            mass[i] = Math.round((rnd.nextDouble() * 20 - 10) * 10000) / 1000d;

            System.out.print(i + " = " + mass[i] + ", ");

            if (mass[i] > 0) {

                positive++;

            } else if (mass[i] < 0) {

                negative++;

            } else {
                zero++;
            }
        }
        System.out.println("\n" + "В массиве положительных чисел: " + positive + ", отрицательных: " + negative + ", нулевых: " + zero + ".");
    }
}
