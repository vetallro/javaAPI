package Java.lesson2.hw;

import Java.lesson2.tasks.Log;
import Java.lesson2.tasks.Task5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class Task1 {
    private static final Logger LOG = Log.log(Task1.class.getName());

    public static void run() {
        int[] array = {15, 42, 9, 11, 25, 61};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        try (FileWriter in = new FileWriter("hwTask1.txt")) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                in.write("Итерация " + (i + 1) + ": ");
                for (int num : arr) {
                    in.write(num + " ");
                }
                in.write('\n');
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}