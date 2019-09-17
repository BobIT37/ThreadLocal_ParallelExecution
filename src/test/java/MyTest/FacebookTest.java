package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Factory.TLDriverFactory;

public class FacebookTest extends TestBase{
	
	
	@Test
	public void facebookTitleTest_1(){
		TLDriverFactory.getTLDriver().get("http://www.facebook.com");
		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
	
	}
	@Test
	public void facebookTitleTest_2(){
		TLDriverFactory.getTLDriver().get("http://www.facebook.com");
		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
	
	}

}
