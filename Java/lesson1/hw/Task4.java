package Java.lesson1.hw;

public class Task4 {
    public static float calculator(int a, int b, int operation) {
        if (operation == 1) {
            return a + b;
        } else if (operation == 2) {
            return a - b;
        } else if (operation == 3) {
            return a * b;
        } else if (operation == 4) {
            return a / b;
        } else {
            return -1;
        }
    }
}
