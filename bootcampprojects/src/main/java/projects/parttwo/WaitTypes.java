package projects.parttwo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nighat Alam\\eclipse-workspace\\bootcampprojects\\drivers\\chromedriver.exe");
   	 
    	driver.get("https://www.facebook.com");
    	driver.manage().window().maximize();
    	
    	
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicit Wait
    	
    	
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); //Explicit Wait
    	WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login"))); //Explicit Wait
    	
    	
    	
    	driver.quit();
	}
}
