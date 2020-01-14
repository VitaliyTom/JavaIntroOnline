package vitaliy.tomashevich.moduleTwo.One_dimensional_arrays;

import java.util.Random;

//      Даны действительные числа а1 ,а2 ,..., аn .
//      Поменять местами наибольший и наименьший элементы.

public class TaskFour {

    public static void main(String[] args) {

        int n;
        int minIndex = 0;
        int maxIndex = 0;
        double min = 888;
        double max = -888;
        double[] mass;

        Random rnd = new Random();
        n = rnd.nextInt(10);
        mass = new double[n];

        for (int i = 0; i < mass.length; i++) {

            mass[i] = Math.round((rnd.nextDouble() * 50 - 25) * 100) / 100d;
            System.out.print(i + " = " + mass[i] + ", ");
        }

        for (int i = 0; i < mass.length; i++) {

            if (mass[i] > max) {
                max = mass[i];
                maxIndex = i;
            }
            if (mass[i] < min) {
                min = mass[i];
                minIndex = i;
            }
        }
        mass[minIndex] = max;
        mass[maxIndex] = min;
        System.out.println(" ");

        for (int i = 0; i < mass.length; i++) {
            System.out.print(i + " = " + mass[i] + ",  ");
        }
        System.out.println("\n" + "max = " + max + ", min = " + min);
    }
}

