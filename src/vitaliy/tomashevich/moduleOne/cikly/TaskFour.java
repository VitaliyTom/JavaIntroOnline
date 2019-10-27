package vitaliy.tomashevich.moduleOne.cikly;

import java.math.BigInteger;

//      Составить программу нахождения произведения квадратов первых двухсот чисел.

public class TaskFour {
    public static void main(String[] args) {

        BigInteger sumSquares = BigInteger.ONE;     //создаем bigInteger равный 1

        for (int number = 1; number <= 6; number++) {

            sumSquares = sumSquares.multiply(BigInteger.valueOf(number * number));

        }

        System.out.println("Произведения квадратов первых двухсот чисел: " + sumSquares);
    }
}
