package SeleniumProjectActivities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobBoard_Activity6 {
	
	WebDriver driver;
	
  @Test
  public void VerifyApplyJobTest() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[@href ='https://alchemy.hguy.co/jobs/jobs/']")).click();
	  driver.findElement(By.id("search_keywords")).sendKeys("Tester");
	  driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("(//h3)[1]")).click();
	  driver.findElement(By.xpath("//input[@value = 'Apply for job']")).click();
	  String emailid = driver.findElement(By.xpath("//a[@class = 'job_application_email']")).getText();
	  System.out.println("Email ID for Job Application is: "+emailid);
	  
	  
	  
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