package SeleniumProjectActivities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class JobBoard_Activity5 {
    WebDriver driver;
    String exph="Jobs – Alchemy Jobs";
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void exampleTestCase() {
        // Check the title of the page
        driver.findElement(By.linkText("Jobs")).click();
        String text =driver.getTitle();
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