package MyTest;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 * @author ilhanturkmen
 */

import Factory.TLDriverFactory;

public class TestBase {
	
	public WebDriverWait wait;
	
	@BeforeMethod
	@Parameters(value={"browser"})
	public void setUp(String browser){
		TLDriverFactory.setTLDriver(browser);
		wait = new WebDriverWait(TLDriverFactory.getTLDriver(), 15);
		
	}
	
	
	@AfterMethod
	public synchronized void tearDown(){
		TLDriverFactory.getTLDriver().quit();
	}

}
