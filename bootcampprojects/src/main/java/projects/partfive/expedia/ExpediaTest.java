package projects.partfive.expedia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExpediaTest {
	public static WebDriver driver;
	
	@Parameters({"url"})
	@BeforeTest
	public void initalize(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nighat Alam\\eclipse-workspace\\bootcampprojects\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Parameters({"origin", "destination", "firstname", "middlename", "lastname", "phonenumber", "monthDOB", "dayDOB", "yearDOB", "cardholdername", "cardnumber", "cardexpmo", "cardexpyr", "cardseccode", "address", "city", "state", "zip", "email"})
	@Test
	public void test(String origin, String destination, String firstname, String middlename, String lastname, String phonenumber, String monthDOB, String dayDOB, String yearDOB, String cardholderName, String cardNumber, String cardExpMo, String cardExpYr, String securityCode, String streetAddress, String city, String state, String zipCode, String email) throws InterruptedException {
		WebElement flightsButton = driver.findElement(By.xpath("(//*[@aria-controls='wizard-flight-pwa'])"));
		flightsButton.click();
		Thread.sleep(500);
		WebElement roundTripButton = driver.findElement(By.xpath("(//*[@aria-controls='wizard-flight-tab-roundtrip'])"));
		roundTripButton.click();
		WebElement departureBox = driver.findElement(By.xpath("(//*[@aria-label='Leaving from'])"));
		departureBox.click();
		WebElement departureField = driver.findElement(By.xpath("(//*[@id='location-field-leg1-origin'])"));
		departureField.sendKeys(origin);
		departureField.sendKeys(Keys.RETURN);
		WebElement arrivalBox = driver.findElement(By.xpath("(//*[@aria-label='Going to'])"));
		arrivalBox.click();
		WebElement arrivalField = driver.findElement(By.xpath("(//*[@id='location-field-leg1-destination'])"));
		arrivalField.sendKeys(destination);
		arrivalField.sendKeys(Keys.RETURN);
		WebElement returnDateMenu = driver.findElement(By.xpath("(//*[@id='d2-btn'])"));
		returnDateMenu.click();
		WebElement nextDateRange = driver.findElement(By.xpath("(//*[@data-stid='date-picker-paging'])[2]"));
		nextDateRange.click();
		WebElement selectedDate = driver.findElement(By.xpath("(//*[@aria-label='Jul 20, 2023'])"));
		selectedDate.click();
		WebElement dateDone = driver.findElement(By.xpath("(//*[@data-stid='apply-date-picker'])"));
		dateDone.click();
		Thread.sleep(500);
		WebElement submitButton = driver.findElement(By.xpath("(//*[@data-testid='submit-button'])"));
		submitButton.click();
		Thread.sleep(45000);
		WebElement selectFirstFlight = driver.findElement(By.xpath("(//*[@data-test-id='select-link'])[1]"));
		selectFirstFlight.click();
		Thread.sleep(500);
		WebElement firstSelect = driver.findElement(By.xpath("(//*[@data-stid='select-button'])"));
		firstSelect.click();
		Thread.sleep(5000);
		WebElement selectSecondFlight = driver.findElement(By.xpath("(//*[@data-test-id='select-link'])[1]"));
		selectSecondFlight.click();
		Thread.sleep(500);
		WebElement secondSelect = driver.findElement(By.xpath("(//*[@data-stid='select-button'])"));
		secondSelect.click();
		Thread.sleep(2000);
		WebElement noThanksDialouge = driver.findElement(By.xpath("(//*[@data-test-id='forcedChoiceNoThanks'])"));
		noThanksDialouge.click();
		Thread.sleep(30000);
		WebElement checkout = driver.findElement(By.xpath("(//*[@id='app-layer-base']/div/div/div[2]/div/main/section[2]/div[1]/div[2]/button)"));
		checkout.click();
		Thread.sleep(10000);
		WebElement firstName = driver.findElement(By.xpath("(//*[@id='firstname[0]'])"));
		firstName.sendKeys(firstname);
		WebElement middleName = driver.findElement(By.xpath("(//*[@data-tealeaf-name='middleName'])"));
		middleName.sendKeys(middlename);
		WebElement lastName = driver.findElement(By.xpath("(//*[@id='lastname[0]'])"));
		lastName.sendKeys(lastname);
		WebElement phoneNumber = driver.findElement(By.xpath("(//*[@id='phone-number[0]'])"));
		phoneNumber.sendKeys(phonenumber);
		WebElement gender = driver.findElement(By.xpath("(//*[@id='gender_male[0]'])"));
		gender.click();
		WebElement month = driver.findElement(By.xpath("//*[@data-tealeaf-name='date_of_birth_month[0]']"));
    	Select monthSelector = new Select(month);
    	monthSelector.selectByVisibleText(monthDOB);
    	WebElement day = driver.findElement(By.xpath("//*[@data-tealeaf-name='date_of_birth_day[0]']"));
    	Select daySelector = new Select(day);
    	daySelector.selectByVisibleText(dayDOB);
    	WebElement year = driver.findElement(By.xpath("//*[@data-tealeaf-name='date_of_birth_year[0]']"));
    	Select yearSelector = new Select(year);
    	yearSelector.selectByVisibleText(yearDOB);
    	WebElement insuranceSelect = driver.findElement(By.xpath("//*[@id='no_insurance']"));
    	insuranceSelect.click();
    	WebElement cardholderNameField = driver.findElement(By.xpath("//*[@name='creditCards[0].cardholder_name']"));
    	cardholderNameField.sendKeys(cardholderName);
    	WebElement cardNumberField = driver.findElement(By.xpath("//*[@name='creditCards[0].card_number']"));
    	cardNumberField.sendKeys(cardNumber);
    	WebElement monthExpiration = driver.findElement(By.xpath("//*[@name='creditCards[0].expiration_month']"));
    	Select monthExpirationSelect = new Select(monthExpiration);
    	monthExpirationSelect.selectByVisibleText(cardExpMo);
    	WebElement yearExpiration = driver.findElement(By.xpath("//*[@name='creditCards[0].expiration_year']"));
    	Select yearExpirationSelect = new Select(yearExpiration);
    	yearExpirationSelect.selectByVisibleText(cardExpYr);
    	WebElement securityCodeField = driver.findElement(By.xpath("//*[@class='text cko-field cvv']"));
    	securityCodeField.sendKeys(securityCode);
    	WebElement addressField = driver.findElement(By.xpath("//*[@name='creditCards[0].street']"));
    	addressField.sendKeys(streetAddress);
    	WebElement cityField = driver.findElement(By.xpath("//*[name='creditCards[0].city']"));
    	cityField.sendKeys(city);
    	WebElement stateField = driver.findElement(By.xpath("//*[@name='creditCards[0].expiration_month']"));
    	Select stateSelector = new Select(stateField);
    	stateSelector.selectByVisibleText(state);
    	WebElement zipCodeField = driver.findElement(By.xpath("//*[@name='creditCards[0].zipcode']"));
    	zipCodeField.sendKeys(zipCode);
    	WebElement emailField = driver.findElement(By.xpath("//*[@name='email']"));
    	emailField.sendKeys(email);
	}

	@AfterTest
	public void terminate() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
