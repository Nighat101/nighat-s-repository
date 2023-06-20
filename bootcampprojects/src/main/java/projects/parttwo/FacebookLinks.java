package projects.parttwo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLinks 
{
    public static void main( String[] args ) {
    	WebDriver driver = new ChromeDriver();
    	 
    	driver.get("https://www.facebook.com");
    	driver.manage().window().maximize();
    	 
    	List<WebElement> links = driver.findElements(By.tagName("a"));
    	 
    	for(WebElement output:links) {
    		System.out.println(output.getAttribute("href"));
    	}
    	 
    	driver.quit();
    }
}
