/*import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class Square {

    public int squareTwoNumbers(int first) {
        return first*first;
    }
    @BeforeClass
    void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    void afterClass() {
        System.out.println("After class");
    }

    @DataProvider(name = "squareDataProvider")
    Object[][] squareDataProvider() {
        return new Object[][] {
                {2, 4},
                {1, 1},
                {-1, 1},
                {0, 0},
        };
    }


    @Test(dataProvider = "squareDataProvider")
    public void testSquare(int first, int expectedSquare) {
        int square = squareTwoNumbers(first);
        System.out.println(square);
        Assert.assertEquals(square, expectedSquare);
    }
}
*/

/*import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PersonTest {

    public static int sumNumbers(int arg1, int arg2){

        return arg1 + arg2;
    }


    public static void currentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
        currentTime();
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
        currentTime();
    }
    @DataProvider(name = "sumProvider")
    Object[][] dataProvider() {
        return new Object[][] {
                {10,30,40},
                {0,0,0},
                {-10,10,0}
        };
    }


    @Test(dataProvider = "sumProvider")
    public void testSum(int arg1, int arg2, int expected) {
        int sum = sumNumbers(arg1, arg2);
        System.out.println(sum);
        Assert.assertEquals(sum, expected);
    }

}
*/