package vitaliy.tomashevich.moduleOne.branching;

import java.util.Random;

//      Найти max{min(a, b), min(c, d)}.

public class TaskTwo {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;
        int minAB;
        int minCD;
        int max;

        Random rd = new Random();

        a = rd.nextInt(100);        // для наглядности рандом ограничен.
        b = rd.nextInt(100);
        c = rd.nextInt(100);
        d = rd.nextInt(100);

        if (a < b) {                                            //  проверка min(a,b).
            minAB = a;
            System.out.println("min(a,b) " + a + " < " + b);
        } else if (a == b) {
            minAB = b;
            System.out.println("min(b,a) " + b + " = " + a);    //  если а = b.
        } else {
            minAB = b;
            System.out.println("min(b,a) " + b + " < " + a);
        }

        if (c < d) {                                           //  проверка min(c,d).
            minCD = c;
            System.out.println("min(c,d) " + c + " < " + d);
        } else if (c == d) {                                  //  если c = d.
            minCD = b;
            System.out.println("min(c,d) " + c + " = " + d);
        } else {
            minCD = d;
            System.out.println("min(d,c) " + d + " < " + c);
        }

        System.out.println(" ");
        if (minAB > minCD) {                                //  проверка max(min,min).
            max = minAB;
        } else {
            max = minCD;
        }
        System.out.println("max: " + max);
    }
}
