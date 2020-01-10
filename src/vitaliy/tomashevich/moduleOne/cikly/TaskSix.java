package vitaliy.tomashevich.moduleOne.cikly;

//  Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class TaskSix {

    public static void main(String[] args) {

        int i = 0;

        do {

            System.out.println("символ: " + (char) i + " - код ASCII: " + i);
            i++;

        } while (i < 256);

    }

}
