package vitaliy.tomashevich.vetvlenija;

import java.util.Random;

//      Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
//      Определить, пройдет ли кирпич через отверстие.

public class TaskFour {

    public static void main(String[] args) {

        int a;
        int b;
        int x;
        int y;
        int z;

        Random rd = new Random();

        a = rd.nextInt(50) + 1;   // +1 если выпадает 0;
        b = rd.nextInt(50) + 1;
        x = rd.nextInt(50) + 1;
        y = rd.nextInt(50) + 1;
        z = rd.nextInt(50) + 1;
        System.out.println("A,B: (" + a + "," + b + ")  x,y,z: (" + x + "," + y + "," + z + ")");

        if ((a > x && b > y) || (a > y && b > z) || (a > z && b > x) || (a > x && b > z) || (a > z && b > y)) {

            System.out.println("\n" + "Кирпич пройдет через отверстие.");
        } else {

            System.out.println("\n" + "Кирпич не пройдет через отверстие.");
        }
    }
}
