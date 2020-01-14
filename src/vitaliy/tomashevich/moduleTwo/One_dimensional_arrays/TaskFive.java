package vitaliy.tomashevich.moduleTwo.One_dimensional_arrays;

//       Даны целые числа а1 ,а2 ,..., аn .
//       Вывести на печать только те числа, для которых аi > i

import java.util.Random;

public class TaskFive {

    public static void main(String[] args) {

        int n;
        int[] mass;

        Random rnd = new Random();

        n = rnd.nextInt(20);
        mass = new int[n];

        for (int i = 0; i < mass.length; i++) {

            mass[i] = rnd.nextInt(20);

            if (mass[i] > i) {
                System.out.print("mass[" + i + "]" + " = " + mass[i] + ", ");
            }
        }
    }
}
