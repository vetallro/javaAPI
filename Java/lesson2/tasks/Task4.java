package Java.lesson2.tasks;

import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    //    Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет
//    эту строку в простой текстовый файл, обработайте исключения.
    public static void writeToFile() {
        try (FileWriter in = new FileWriter("test.txt")) {
            in.append(createString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String createString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("TEST");
        }
        return builder.toString();
    }
}
