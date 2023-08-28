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
        System.out.println();
        System.out.println("-----Display title of first course-----");
        String zaibal = jsonPath.getString("courses[0].title");
        System.out.println(zaibal);

        //Display all courses
        System.out.println();
        System.out.println("-----Display all courses-----");
        for (int i = 0; i < count; i++) {
            String coursesTitle = jsonPath.getJsonObject("courses[" + i + "].title");
            System.out.println(coursesTitle);
        }

        //Display price for RPA course
        System.out.println();
        System.out.println("-----Display price for RPA course-----");
        for (int i = 0; i < count; i++) {
            String coursesTitle = jsonPath.get("courses[" + i + "].title");
            if (coursesTitle.equalsIgnoreCase("RPA")) {
                int copies = jsonPath.get("courses[" + i + "].copies");
                System.out.println(copies);
                break;
            }
        }

    }
}