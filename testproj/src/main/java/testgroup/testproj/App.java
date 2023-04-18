package testgroup.testproj;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class App 
{
	
	public static WebDriver driver;
	
	
    public static void main( String[] args ) throws InterruptedException
    
    {	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nighat Alam\\eclipse-workspace\\testproj\\drivers\\chromedriver.exe");
    	driver= new ChromeDriver();  // Opening chrome browser
    	driver.get("https://www.dominos.com/");
    	driver.manage().window().maximize();
    	/*
    	WebElement createAccount = driver.findElement(By.xpath("(//*[@role='button'])[2]"));
    	createAccount.click();
    	Thread.sleep(2500);
    	WebElement firstName = driver.findElement(By.xpath("//*[@name='firstname']"));
    	firstName.sendKeys("Smith");
    	WebElement lastNmae = driver.findElement(By.xpath("//*[@name='lastname']"));
    	lastNmae.sendKeys("John");
    	WebElement email = driver.findElement(By.xpath("//*[@name='reg_email__']"));
    	email.sendKeys("abcd@gmail.com");
    	Thread.sleep(1500);
    	WebElement emailConfirmation = driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']"));
    	emailConfirmation.sendKeys("abcd@gmail.com");
    	WebElement password = driver.findElement(By.xpath("(//*[@type='password'])[2]"));
    	password.sendKeys("abcdefg123!");
    	WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
    	Select monthSelector = new Select(month);
    	monthSelector.selectByVisibleText("Jun");
    	WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
    	Select daySelector = new Select(day);
    	daySelector.selectByVisibleText("15");
    	WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
    	Select yearSelector = new Select(year);
    	yearSelector.selectByVisibleText("1979");
    	WebElement gender = driver.findElement(By.xpath("//*[@type='radio']"));
    	gender.click();
    	
    	WebElement signIn = driver.findElement(By.xpath("//*[@data-nav-role='signin']"));
    	Actions cursor = new Actions(driver);
    	cursor.moveToElement(signIn).build().perform();
    	Thread.sleep(12000);
    	
    	driver.close();
    	
    	WebElement alertButton = driver.findElement(By.xpath("//*[@id='alertButton']"));
    	alertButton.click();
    	Thread.sleep(10000);
    	WebElement dragabale = driver.findElement(By.xpath("//*[@id='dragable']"));
    	WebElement dropable = driver.findElement(By.xpath("//*[@id=='dropable']"));
    	Actions ob =new Actions(driver);*/
    	//WebElement picture = driver.findElement(By.xpath());
    	/*WebElement myAccount = driver.findElement(By.xpath("//*[@class='MyAccount__button']"));
    	myAccount.click();
    	WebElement signIn = driver.findElement(By.xpath("(//*[@class='bttn bttn--primary'])[2]"));
    	signIn.click();
    	WebElement createAccount = driver.findElement(By.xpath("(//*[@type='button'])[3]"));
    	createAccount.click();
    	Thread.sleep(2500);
    	WebElement select = driver.findElement(By.xpath("(//*[@type='button'])[3]"));
    	select.click();
    	Thread.sleep(2500);
    	WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
    	email.sendKeys("abcd@gmail.com");
    	WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
    	password.sendKeys("Ten10102102");
    	Thread.sleep(2500);
    	WebElement zipCode = driver.findElement(By.xpath("//*[@name='zipcode']"));
    	zipCode.sendKeys("22191");
    	WebElement phoneNumber =driver.findElement(By.xpath("//*[@name='phone']"));
    	phoneNumber.sendKeys("7036521595");
    	WebElement Submit = driver.findElement(By.xpath("//*[@class='bttn--primary']"));
    	Submit.click();
        WebElement search_field = driver.findElement(By.xpath("//*[@type='text']"));
        search_field.sendKeys("Pens");
        Actions ob = new Actions (driver);
        ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(2500);
        ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        search_field.clear();
        search_field.click();
        ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        driver.close();*/
    	WebElement close = driver.findElement(By.xpath("(//*[@type='button'])[6]"));
    	close.click();
    	WebElement order =driver.findElement(By.xpath("//*[@id='__next']"));
    	order.click();
    	WebElement delivery = driver.findElement(By.xpath("//*[@id='Delivery']"));
    	delivery.click();
    	WebElement house = driver.findElement(By.xpath("//*[@name='Type']"));
    	house.sendKeys("house");
    	WebElement streetAddress = driver.findElement(By.xpath("//*[@name='Street']"));
    	streetAddress.sendKeys("Wolfgarden st");
    	WebElement houseNo = driver.findElement(By.xpath("//*[@id='UnitNumber']"));
    	houseNo.sendKeys("2020");
    	WebElement zipCode =driver.findElement(By.xpath("//*[@id='PostalCode']"));
    	zipCode.sendKeys("22191");
    	WebElement city = driver.findElement(By.xpath("//*[@id='City']"));
    	city.sendKeys("Woodbridge");
    	WebElement state = driver.findElement(By.xpath("//*[@id='Region']"));
    	Select region = new Select(state);
    	region.selectByVisibleText("MD");
    	WebElement submit = driver.findElement(By.xpath("//*[@ type='submit']"));
    	submit.click();
    	
    	
    }
}
