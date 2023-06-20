package projects.partfour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowsers {
	public static void main(String[] args) {
		WebDriver driver = null;
		String driverSelect = "edge";
		
		if(driverSelect.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nighat Alam\\eclipse-workspace\\bootcampprojects\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();  // Opening chrome browser
		}
		
		else if (driverSelect.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nighat Alam\\eclipse-workspace\\bootcampprojects\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();  // Opening firefox browser
		}
		
		else if(driverSelect.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Nighat Alam\\eclipse-workspace\\bootcampprojects\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();  // Opening edge browser
		}

		driver.get("https://www.facebook.com");	
	}
}
