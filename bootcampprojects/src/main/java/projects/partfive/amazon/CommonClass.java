package projects.partfive.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CommonClass {

	public WebDriver driver;
	public ObjHome ob;
	
	@Parameters({"url"})
	@BeforeTest
	public void openTest(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nighat Alam\\eclipse-workspace\\bootcampprojects\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		ob = new ObjHome(driver);
	}
	
	@Parameters({"search-entry", "item", "file-name"})
	@Test
	public void amazonTest(String searchEntry, String item, String name) throws Exception {
		ob.pageInit();
		ob.search(searchEntry);
		ob.selectProduct(item);
		ob.screenshot(name);
	}

	@AfterTest
	public void closeTest() throws InterruptedException {
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}
}
