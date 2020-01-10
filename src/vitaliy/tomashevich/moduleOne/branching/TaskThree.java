package vitaliy.tomashevich.moduleOne.branching;

import java.util.Random;

//      Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class TaskThree {

    public static void main(String[] args) {

        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;
        int s;

        Random rd = new Random();
        x1 = rd.nextInt(5); // random ограничен для более частого выпадения точек на одной прямой.
        y1 = rd.nextInt(5);
        x2 = rd.nextInt(5);
        y2 = rd.nextInt(5);
        x3 = rd.nextInt(5);
        y3 = rd.nextInt(5);
        s = ((x1 - x3) * (y2 - y3)) - ((x2 - x3) * (y1 - y3));  // считаем площадь треугольника по формуле.

        System.out.println("A(" + x1 + "," + y1 + ")  B(" + x2 + "," + y2 + ")  C(" + x3 + "," + y3 + ")");
        System.out.println("\n" + "(x1-x3)(y2-y3) - (x2-x3)(y1-y3) = " + s);

        if (s == 0) {       // если площадь = 0, то это не трегольник и все точки лежат на одной прямой.

            System.out.println("\n" + "Точки расположены на одной прямой");
        } else {
            System.out.println("\n" + "Точки не расположены на одной прямой");
        }
    }
}
