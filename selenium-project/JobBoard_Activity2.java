package SeleniumProjectActivities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class JobBoard_Activity2 {
    WebDriver driver;
    String exph="Welcome to Alchemy Jobs";
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void exampleTestCase() {
        // Check the hedding of the page
        String text = driver.findElement(By.className("entry-title")).getText();
 
        //Print title of new page
        System.out.println("The page heading is: " +text);
     assertEquals(text,exph);
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}