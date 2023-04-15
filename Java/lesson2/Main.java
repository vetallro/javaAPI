package Java.lesson2;

import Java.lesson2.tasks.Task1;
import Java.lesson2.tasks.Task2;
import Java.lesson2.tasks.Task4;
import Java.lesson2.tasks.Task5;

public class Main {
    public static void main(String[] args) {
        Task1.writeString(120, '-', '^');
//        Task2.compressString("aaaaabbcccccddd");
        System.out.println(Task4.createString());
        Task4.writeToFile();
        Task5.write(".");
    }
}
