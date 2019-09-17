package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Factory.TLDriverFactory;

public class GoogleTest extends TestBase{
	
	@Test
	public void googleTitleTest_1(){
		TLDriverFactory.getTLDriver().get("http://www.google.com");
		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	
	}
	@Test(enabled=true)
	public void googleTitleTest_2(){
		TLDriverFactory.getTLDriver().get("http://www.google.com");
		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	
	}
	@Test
	public void googleTitleTest_3(){
		TLDriverFactory.getTLDriver().get("http://www.google.com");
		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	
	}
	@Test
	public void googleTitleTest_4(){
		TLDriverFactory.getTLDriver().get("http://www.google.com");
		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	
	}
	
	
	 

}
