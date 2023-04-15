package Java.lesson1.hw;

public class Task1 {
    public static int triangularNumber(int number) {
        int triangularNumber = 0;
        for (int i = 0; i <= number; i++) {
            triangularNumber += i;
        }
        return triangularNumber;
    }
}
