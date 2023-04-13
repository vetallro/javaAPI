package Java;

import Java.Lesson1.HW.Task1;
import Java.Lesson1.Tasks.Task2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task1.run();
        //int sizeArray = 20;
        //System.out.println(Task2.run(sizeArray));
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();
        System.out.print("Triangular number: ");
        System.out.print(Task1.triangularNumber(number));

    }


}
