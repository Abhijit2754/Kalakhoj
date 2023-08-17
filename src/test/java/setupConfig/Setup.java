package setupConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Setup {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void init() 
	{
		driver = new ChromeDriver();
		
		driver.get("https://kalakhoj.in/");
		
		driver.manage().window().maximize();
	}	
}
