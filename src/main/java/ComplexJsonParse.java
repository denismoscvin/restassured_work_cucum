import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
    public static void main(String[] args) {
        JsonPath jsonPath = new JsonPath(payload.CoursePrice());

        //Number of courses
        int count = jsonPath.getInt("courses.size()");
        System.out.println(count);

        //Summ of courses
        float summ = jsonPath.getFloat("dashboard.purchaseAmount");
        System.out.println(summ);

        //Display title of first course
        String zaibal = jsonPath.getString("courses[0].title");
        System.out.println(zaibal);

        //Display all courses and price
        for (int i = 0; i < count; i++) {
            String coursesTitle = jsonPath.getJsonObject("courses[" + i + "].title");
            System.out.println(jsonPath.get("courses[" + i + "].price").toString());
            System.out.println(coursesTitle);
        }
        //Print no of copies sold by RPA courses

    }
}