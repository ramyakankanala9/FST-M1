package SeleniumProjectActivities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
public class JobBoard_Activity9 {
	
	WebDriver driver;
	
  @Test
  public void backendjoblisting() {
	  
	  driver.findElement(By.id("user_login")).sendKeys("root");
	  driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("wp-submit")).click();
	  
	  driver.findElement(By.xpath("(//div[@class='wp-menu-name'])[6]")).click();
	  driver.findElement(By.xpath("//a[@class = 'page-title-action']")).click();
	
	  
	  driver.findElement(By.xpath("//textarea")).sendKeys("Automation Test Engineer");
	  driver.findElement(By.id("_job_location")).sendKeys("Hyderabad");
	  driver.findElement(By.xpath("(//button[@type = 'button'])[9]")).click();
	  driver.findElement(By.xpath("//button[@class = 'components-button editor-post-publish-button editor-post-publish-button__button is-primary']")).click();
	  
	  driver.findElement(By.xpath("//a[@class = 'components-button edit-post-fullscreen-mode-close has-icon']")).click();
	  String newjobtitle = driver.findElement(By.xpath("(//div[@class = 'job_position'])[1]")).getText();
	  if("Automation Test Engineer" == newjobtitle)
	  {
		  System.out.println("The Job is successfully created");
	  }
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
