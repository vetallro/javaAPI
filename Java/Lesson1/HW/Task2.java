package Java.Lesson1.HW;

public class Task2 {
    public static int factorial(int number) {
        int factorialNumber = 1;
        for (int i = 1; i <= number; i++) {
            factorialNumber *= i;
        }
        return factorialNumber;
    }
}
