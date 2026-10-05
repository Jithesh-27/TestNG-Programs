package testngtutorials;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Sample1 {

    @Test
    public void loginTest() {
        System.out.println("Login Test");
    }

    @AfterMethod
    public void closeBrowser() {
        System.out.println("Close Browser");
    }
}