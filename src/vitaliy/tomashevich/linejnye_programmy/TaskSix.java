package VitaliyTom.linejnye_programmy;

import java.util.Scanner;

//      Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//      принадлежит закрашенной области, и false — в противном случае:
//      x = [-4,4] y = [-3,4]

public class TaskSix {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x : ");

        while (!sc.hasNextInt()) {          //  валидация x
            sc.next();
            System.out.println("Введите x : ");
        }

        x = sc.nextInt();
        System.out.println("Введите y : ");

        while (!sc.hasNextInt()) {          //  валидация y
            sc.next();
            System.out.println("Введите y : ");
        }

        y = sc.nextInt();

        if ((x > (-5) && x < 5) && ((y > (-4)) && y < 5)) {     // условие, точки координат принадлежащие
            System.out.println("true");                         // закрашенной области
        } else {
            System.out.println("false");
        }
    }
}
