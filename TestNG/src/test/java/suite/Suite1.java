package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Suite1 {

    @Test
    public void loginTest() {
        System.out.println("Login Test");
    }

    @AfterSuite
    public void endSuite() {
        System.out.println("End Suite");
    }
}