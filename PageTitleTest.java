package smoketests;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class PageTitleJUnit {
	
	//Declare variables and objects at CLASS level to access them in all methods of program
	WebDriver driver;
	String webURL = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
	
	@Test
	public void pageTitleTest () {
		System.out.println("Running the test");		
		driver.get(webURL);
		String actualTitle = driver.getTitle();
		String expectedTitle = "SDET Training | Account Management";
		Assert.assertEquals(expectedTitle, actualTitle);
		//Assert.fail("We intentionally failed this test");
		System.out.println(actualTitle);
	}
	
	@Before
	public void setup() {
		System.out.println("Initializing the driver");
		driver = utilities.DriverFactory.open("chrome");
	}
	
	@After
	public void teardown() {
		System.out.println("Closing the test");
		driver.close();
	}
}