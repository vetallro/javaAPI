package Java.lesson2.hw;


import org.json.JSONArray;
import org.json.JSONObject;

public class Task2 {

    public static String parseJson (String json) {
        StringBuilder builder = new StringBuilder();
        JSONArray jsonArray = new JSONArray(json);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String soname = jsonObject.getString("фамилия");
            String grade = jsonObject.getString("оценка");
            String lesson = jsonObject.getString("предмет");

            builder.append("Студент ").append(soname).append(" получил ").append(grade)
                    .append(" по предмету ").append(lesson).append(".\n");
        }
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
