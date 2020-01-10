package vitaliy.tomashevich.moduleOne.branching;

import java.util.Random;

//    Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//    он прямоугольным.

public class TaskOne {

    public static void main(String[] args) {

        int angleOne;
        int angleTwo;
        int angleThree;
        int sumAngle;

        Random rd = new Random();

        angleOne = rd.nextInt(200);
        angleTwo = rd.nextInt(200);
        angleThree = 180 - angleOne - angleTwo;
        sumAngle = angleOne + angleTwo + angleThree;

        System.out.println("угол 1 = " + angleOne + ", угол 2 = " + angleTwo + ", угол 3 = " + angleThree);

        if (angleOne <= 0 || angleTwo <= 0 || angleThree <= 0 || sumAngle > 180) {

            System.out.println("треугольника не существует");
        } else if (angleOne == 90 || angleTwo == 90 || angleThree == 90) {

            System.out.println("треугольник существует и является прямоугольным");
        } else {

            System.out.println("треугольник существует и не является прямоугольным");
        }
    }
}
