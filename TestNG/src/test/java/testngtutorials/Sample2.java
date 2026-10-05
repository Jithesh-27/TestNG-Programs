package testngtutorials;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample2 {

    @BeforeClass
    public void setup() {
        System.out.println("Setup");
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