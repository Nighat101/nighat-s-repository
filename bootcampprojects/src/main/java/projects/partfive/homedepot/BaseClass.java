package projects.partfive.homedepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {

	public WebDriver driver;
	public PageObjects po;
	
	@Parameters({"url"})
	@BeforeTest
	public void initalize(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nighat Alam\\eclipse-workspace\\bootcampprojects\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		po = new PageObjects(driver);
	}
	
	@Parameters({"email", "pass", "zip", "phone"})
	@Test
	public void testRun(String em, String pass, String zip, String phone) throws Exception {
		po.preFormFunc();
		po.emFiller(em);
		po.passFiller(pass);
		po.zipFiller(zip);
		po.phoneFiller(phone);
		po.submitForm();
	}

	@AfterTest
	public void terminate() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
