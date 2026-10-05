package suite;

import org.testng.annotations.Test;

public class GroupsDemo {

    @Test(groups = "smoke")
    public void loginTest() {
    	
        System.out.println("Login Test - Smoke");
        
    }

    @Test(groups = "smoke")
    public void searchTest() {
    	
        System.out.println("Search Test - Smoke");
        
    }

    @Test(groups = "regression")
    public void paymentTest() {
    	
        System.out.println("Payment Test - Regression");
        
    }

    @Test(groups = "regression")
    public void logoutTest() {
    	
        System.out.println("Logout Test - Regression");
        
    }
    
}