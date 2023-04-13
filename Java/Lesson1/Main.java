package Java.Lesson1;

import Java.Lesson1.HW.Task1;
import Java.Lesson1.HW.Task2;
import Java.Lesson1.HW.Task3;
import Java.Lesson1.HW.Task4;

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
        System.out.println(Task1.triangularNumber(number));
        System.out.print("Input another number: ");
        int numberForFactorial = in.nextInt();
        System.out.print("Factorial number: ");
        System.out.println(Task2.factorial(numberForFactorial));
        Task3.writePrimeNumbers();
        System.out.println();
        System.out.print("Input operation: 1. Summ, 2. Diff, 3. Multi 4. Divi ");
        int operation = in.nextInt();
        System.out.print("Input A number: ");
        int aNumber = in.nextInt();
        System.out.print("Input B number: ");
        int bNumber = in.nextInt();
        System.out.println("Answer: " + Task4.calculator(aNumber, bNumber, operation));
    }


}
