package testngtutorials;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {

    @BeforeMethod
    public void openBrowser() {
        System.out.println("Open Browser");
    }

    @Test
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test
    public void searchTest() {
        System.out.println("Search Test");
    }
}