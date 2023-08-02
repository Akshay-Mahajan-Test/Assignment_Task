package Basic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	WebDriver driver;
	
	@BeforeTest
	public WebDriver launch() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("URL");
		driver.manage().window().maximize();;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}
}
