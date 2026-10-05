package suite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suite {

    @BeforeSuite
    public void startSuite() {
        System.out.println("Start Suite");
    }

    @Test
    public void loginTest() {
        System.out.println("Login Test");
    }
}