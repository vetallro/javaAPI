package Java.lesson1.tasks;

import java.util.Random;

public class Task2 {
    public static int run(int size) {
        //int[] binaryArray = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] binaryArray = generateBinaryArray(size);
        System.out.println("Исходный массив: ");
        printArray(binaryArray);
        return findMaxConsecutiveOnes(binaryArray);
    }

    public static int[] generateBinaryArray(int size) {
        int[] binaryArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            binaryArray[i] = random.nextInt(2); // Генерируем случайное число 0 или 1
        }
        return binaryArray;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int findMaxConsecutiveOnes(int[] array) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;
        for (int j : array) {
            if (j == 1) {
                currentConsecutiveOnes++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
            } else {
                currentConsecutiveOnes = 0;
            }
        }
        return maxConsecutiveOnes;
    }
}
