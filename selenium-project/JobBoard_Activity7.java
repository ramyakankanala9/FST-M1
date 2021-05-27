package SeleniumProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class JobBoard_Activity7 {
	
	WebDriver driver;
	
  @Test
  public void CreateJobTest() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[@href ='https://alchemy.hguy.co/jobs/post-a-job/']")).click();
	  driver.findElement(By.xpath("//a[@class = 'button']")).click();
	  driver.findElement(By.id("user_login")).sendKeys("root");
	  driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("wp-submit")).click();
	  Thread.sleep(1000);
	 
	  
	  driver.findElement(By.id("job_title")).sendKeys("Automation Test Specialist");
	  driver.findElement(By.id("job_location")).sendKeys("Hyderabad");
	  driver.switchTo().frame("job_description_ifr");
	  driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Job Application for Automation Test Specialist");
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//input[@class = 'button']")).click();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("job_preview_submit_button")).click();
	  
      driver.findElement(By.xpath("//a[@href ='https://alchemy.hguy.co/jobs/jobs/']")).click();
      
      Thread.sleep(1000);
	  
	  String jobtitle = driver.findElement(By.xpath("(//h3)[1]")).getText();
	  System.out.println("Created Job Title is: "+jobtitle);
	  Assert.assertEquals("Automation Test Specialist", jobtitle);
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();									
	  driver.get("https://alchemy.hguy.co/jobs/");
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}