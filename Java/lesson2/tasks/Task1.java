package Java.lesson2.tasks;

public class Task1 {
    public static void writeString(int num, char a, char b) {
        //Дано четное число N (>0) и символы c1 и c2.
        //Написать метод, который вернет строку длины N, которая состоит из
        // чередующихся символов c1 и c2, начиная с c1.

        System.out.println(printStr(num, a, b));
    }

    public static String printStr(int number, char a, char b) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < number / 2; i++) {
            str.append(a);
            str.append(b);
        }
        if (number % 2 != 0) {
            str.append(a);
        }
        return str.toString();
    }

}

