package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

    @Test
    public void checkTitle() {

        String actualTitle = "Google";
        String expectedTitle = "google";
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Test Passed");
        
    }
    
}