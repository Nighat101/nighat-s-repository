package projects.partfive.homedepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	public static WebDriver objDriver;
	
	@FindBy(xpath="//*[@class='MyAccount__button']") WebElement myAccountButton;
	@FindBy(xpath="//*[@class='bttn-outline']") WebElement createAccountButton;
	
	public PageObjects(WebDriver sharedDriver) {
		this.objDriver = sharedDriver;
		PageFactory.initElements(objDriver, this);
	}
	
	public void preFormFunc() throws InterruptedException {
		myAccountButton.click();
		Thread.sleep(500);
		createAccountButton.click();
		Thread.sleep(500);
		WebElement personalAccSelect = objDriver.findElement(By.xpath("(//*[@class='bttn--primary'])[1]"));
		personalAccSelect.click();
		Thread.sleep(500);
	}
	
	public void emFiller(String emailInput) throws InterruptedException {
		Thread.sleep(250);
		WebElement email = objDriver.findElement(By.xpath("(//*[@id='email'])"));
		email.sendKeys(emailInput);
	}
	
	public void passFiller(String passwordInput) throws InterruptedException {
		Thread.sleep(250);
		WebElement password = objDriver.findElement(By.xpath("(//*[@type='password'])"));
		password.sendKeys(passwordInput);
	}
	
	public void zipFiller(String zipCodeInput) throws InterruptedException {
		Thread.sleep(250);
		WebElement zipCode = objDriver.findElement(By.xpath("(//*[@name='zipcode'])"));
		zipCode.sendKeys(zipCodeInput);
	}
	
	public void phoneFiller(String phoneNumberInput) throws InterruptedException {
		Thread.sleep(250);
		WebElement phoneNumber = objDriver.findElement(By.xpath("(//*[@id='phone'])"));
		phoneNumber.sendKeys(phoneNumberInput);
	}
	
	public void submitForm() throws InterruptedException {
		Thread.sleep(1000);
		WebElement submitButton = objDriver.findElement(By.xpath("(//*[@class='bttn--primary'])[1]"));
		submitButton.click();
	}
}
