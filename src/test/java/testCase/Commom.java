package testCase;

import org.testng.annotations.*;

import junit.framework.Assert;
import setupConfig.Setup;
import testCasePOM.POM_Common;

public class Commom extends Setup {

	@Test
	public void isImageDisplayed() 
	{
		POM_Common common = new POM_Common(driver);
		
		int res = common.checkLogVisiblity();
		
		System.out.println("the response is "+res);
		
		if(res == 1)
		{
			Assert.assertTrue(true);
		}	
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void checkMouseHoverOnBrowsArtist() 
	{
		POM_Common common = new POM_Common(driver);
		
		common.checkMouseHover();
		
		String url = driver.getCurrentUrl();
		
		if(url.equals("https://www.kalakhoj.in/artist/graphic-designer/all"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void checkSocialIcon()
	{	
		POM_Common common = new POM_Common(driver);
		
		if(common.socialIcon())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void contactForm()
	{
		POM_Common common = new POM_Common(driver);
		
		common.contactFrm("Umesh Jha", "umeshjha@gmail.com", "0123456978", "Delhi", "Hello I need help to do registration");
	}
}
