package VitaliyTom.cikly;

import java.util.Random;

//Вычислить значения функции на отрезке [а,b] c шагом h:
//         / x,x>2
//    y = <
//         \(-x),x<=2

public class TaskTwo {

    public static void main(String[] args) {
        int a;
        int b;
        int h;

        Random rnd = new Random();

        a = rnd.nextInt(6);         // ограничение от 0 до 6, в таком случае 50/50 что число будет X или (-X)
        b = rnd.nextInt(6) + a;     // всегда b >= a
        h = rnd.nextInt(3) + 1;     // h != 0

        System.out.println("a=" + a + ", b=" + b + ", h=" + h);
        System.out.print("y = ");

        for (int i = a; i <= b; i = i + h) {

            if (i > 2) {

                System.out.print(i + ", ");
            } else {

                System.out.print((i * (-1)) + ", ");
            }
        }
    }
}
