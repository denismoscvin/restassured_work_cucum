import files.payload;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumValidation {

    @Test
    public void sumOfCourses() {
        JsonPath jsonPath = new JsonPath(payload.CoursePrice());
        int count = jsonPath.getInt("courses.size()");
        System.out.println("We have " + count + " courses:");
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int price = jsonPath.get("courses[" + i + "].price");
            int copies = jsonPath.get("courses[" + i + "].copies");
            String title = jsonPath.get("courses[" + i + "].title");
            int amount = price * copies;
            System.out.println(i + ") " + "For " + title + " must be pay ->" + " " + amount);

            sum = sum + amount;
        }
        System.out.println("Summ for all courses is " + sum);

        int purchased = jsonPath.getInt("dashboard.purchaseAmount");

        Assert.assertEquals(purchased, sum);
    }

}
