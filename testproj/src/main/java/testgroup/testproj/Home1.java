package testgroup.testproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Home1 {
		
		public static WebDriver driver;

		@FindBy(xpath="//*[@id='email']") WebElement email_field;
		@FindBy(xpath="//*[@id='pass']") WebElement pass_field;
		@FindBy(xpath="//*[@name='login']") WebElement login_button;
		@FindBy(xpath="//*[@cotains(text( ),'Connect with)']")WebElement fb_text;
		


		public Home1(WebDriver driver) {
			Home1.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void email_field_function(String email) {
			email_field.sendKeys(email);
		}
		
		public void pass_field_function(String pass) {
			pass_field.sendKeys(pass);
		}
		
		public void login_button_function() {
			login_button.click();
		}	
		
		public void text_extract_function() throws InterruptedException {
			String actual_text=	fb_text.getText();
			System.out.println("Text copied from website is = " + actual_text);
			Thread.sleep(5000);
			Assert.assertEquals(actual_text,( "Connect with friends and the world around you on Facebook."));
		}
}




