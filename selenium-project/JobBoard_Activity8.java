package SeleniumProjectActivities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class JobBoard_Activity8 {
	
	WebDriver driver;
	
  @Test
  public void BackendLoginTest() {
	  
	  driver.findElement(By.id("user_login")).sendKeys("root");
	  driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("wp-submit")).click();
	  
	  String pagetitle = driver.getTitle();
	  System.out.println("Title of the page is:" +pagetitle);
	  Assert.assertEquals("Dashboard ‹ Alchemy Jobs — WordPress", pagetitle);
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/jobs/wp-admin");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}