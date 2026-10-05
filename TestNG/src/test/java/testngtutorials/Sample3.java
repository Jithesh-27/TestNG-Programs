package testngtutorials;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Sample3 {

    @Test
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test
    public void searchTest() {
        System.out.println("Search Test");
    }

    @AfterClass
    public void close() {
        System.out.println("Close");
    }
}