package Java.lesson2.hw;


public class Task2 {

    public static String parseJson (String json) {
        StringBuilder builder = new StringBuilder();
         jsonArray = new (json);


        builder.append("Студент ").append(фамилия).append(" получил ").append(оценка)
                .append(" по предмету ").append(предмет).append(".\n");


        return builder.toString();
    }


    public static void start() {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        String result = parseJson(json);
        System.out.println(result);
    }
}
