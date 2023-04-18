package testgroup.testproj;

import java.io.IOException;

import org.testng.annotations.Test;
public class NewTest extends baseclass {
	
	  
	  @Test (priority=1)
	  public void signin_facebook() throws InterruptedException, IOException {
		  
		 
		  System.out.println("This is test1");
		  Thread.sleep(5000);
		  shotsv2("1");
		  
		  Home1 ob = new Home1(driver);
		  ob.email_field_function("abc@yahoo.com");
		  Thread.sleep(5000);
		  ob.pass_field_function("aaaaqqqwwweee");
		  Thread.sleep(5000);
		  shotsv2("2");
	  }
}
