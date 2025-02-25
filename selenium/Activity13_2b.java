package SeleniumActivites;
import java.util.List;		
import org.openqa.selenium.Alert;	
import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity13_2b {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/radhab/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.training-support.net/selenium/simple-form");
	
        String filePath = "src/SeleniumActivities/sample.xlsx";

        Activity14_2b srcExcel = new Activity14_2b();

        List<List<String>> data = srcExcel.readExcel(filePath);
	
        List<String> row;

        driver.get("https://www.training-support.net/selenium/simple-form");

        String pageTitle = driver.getTitle();
	
        System.out.println("Page title is: " + pageTitle);

        row = data.get(2);
	
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
	
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
	
        firstName.sendKeys(row.get(1));
	
        lastName.sendKeys(row.get(2));
	
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(row.get(3));

        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys(row.get(4));

        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
	
        Alert message = driver.switchTo().alert();
	
        System.out.println("Alert message: " + message.getText());
	
        message.accept();

        driver.close();
	
    }  

}