package testCasePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Common {

	public WebDriver driver;
	
	@FindBy (xpath="//a[normalize-space()='']//img[@alt='Kala Khoj']")
	public WebElement data;
	
	@FindBy (xpath="//a[@class='mega-menu-link']")
	public WebElement menuMouseHover;
	
	@FindBy (xpath = "//a[normalize-space()='Graphic Designer']")
	public WebElement mouseHoverMenuData;
	
	// Social Icon	
	
	@FindBy (xpath = "//a[@title='Facebook']")
	public WebElement facebooIcon;
	
	@FindBy (xpath = "//a[@title='Instagram']")
	public WebElement instgram;
	
	@FindBy (xpath = "//a[@title='Twitter']")
	public WebElement twitter;
	
	@FindBy (xpath = "//a[@title='Youtube']")
	public WebElement youtube;
	
	// Contact Form Element	
	
	@FindBy (xpath = "//div[@class='card-body']//input[@id='contact-name']")
	public WebElement fullname;
	
	@FindBy (xpath = "//div[@class='card-body']//input[@id='contact-email']")
	public WebElement eemail;
	
	@FindBy (xpath = "//div[@class='card-body']//input[@id='contact-phone']")
	public WebElement econtact;
	
	@FindBy (xpath = "//div[@class='card-body']//input[@id='contact-location']")
	public WebElement elocation;
	
	@FindBy (xpath = "//div[@class='card-body']//textarea[@id='contact-message']")
	public WebElement emessage;
	
	@FindBy (xpath = "//div[@class='text-center']//button[@name='btn_submit'][normalize-space()='Send Message']")
	public WebElement sendMessegeButton;
		
	public POM_Common(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public int checkLogVisiblity()
	{	
		if(data.isDisplayed())
		{
			return 1;
		}		
		else
		{
			return 0;
		}
	}
	
	public void checkMouseHover()
	{
		Actions action = new Actions(driver);
		
		action.moveToElement(menuMouseHover).perform();
		
		mouseHoverMenuData.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public boolean socialIcon()
	{	
		if(facebooIcon.getAttribute("href").equals("https://www.facebook.com/kalakhoj.in") && instgram.getAttribute("href").equals("https://www.instagram.com/kalakhoj.in") && twitter.getAttribute("href").equals("https://www.twitter.com/") && youtube.getAttribute("href").equals("https://www.youtube.com/channel/UCPp-bq5jLqfVjJzrGVl3wGA") )
			return true;		
		else		
			return false;			
	}
	
	public void contactFrm(String name, String email, String contact, String location, String messege)
	{	
		fullname.sendKeys(name);
		eemail.sendKeys(email);
		econtact.sendKeys(contact);
		elocation.sendKeys(location);
		emessage.sendKeys(messege);
		sendMessegeButton.click();
	}	
}
