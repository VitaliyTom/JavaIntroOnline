package vitaliy.tomashevich.moduleOne.cycles;

//          Найти сумму квадратов первых ста чисел.

public class TaskThree {

    public static void main(String[] args) {

        int sumSquares = 0;

        for (int number = 1; number <= 100; number++) {

            sumSquares += number * number;
        }
        System.out.println("Сумма квадратов первых ста чисел: " + sumSquares);
    }
}
