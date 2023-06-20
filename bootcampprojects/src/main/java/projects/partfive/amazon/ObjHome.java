package projects.partfive.amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjHome {

	public WebDriver wd;
	
	@FindBy(xpath="//*[@class='nav-search-field ']") WebElement searchBoxClickable;
	@FindBy(xpath="//*[@aria-label='Search Amazon']") WebElement searchBoxField;
	@FindBy(xpath="(//*[@id='nav-search-submit-button'])") WebElement searchButton;
	
	public ObjHome(WebDriver inputDriver) {
		this.wd = inputDriver;
		PageFactory.initElements(wd, this);
	}
	
	public void pageInit() {
		searchBoxClickable.click();
	}
	
	public void search(String entry) throws InterruptedException {
		searchBoxField.sendKeys(entry);
		Thread.sleep(250);
		searchButton.click();
		Thread.sleep(5000);
	}
	
	public void selectProduct(String productName) throws InterruptedException {
		WebElement product = wd.findElement(By.linkText(productName));
		product.click();
		Thread.sleep(5000);
		WebElement addToCart = wd.findElement(By.xpath("//*[@id='add-to-cart-button']"));
		addToCart.click();
		Thread.sleep(5000);
	}
	
	public void screenshot(String fileName) throws IOException {
		File ss = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("C:\\Users\\Nighat Alam\\eclipse-workspace\\bootcampprojects\\screenshots\\shot-"+ fileName +".png"));
	}
}
