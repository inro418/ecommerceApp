package tests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestMagentoApp{

	WebDriver driver;
	
	@Test
	public void LaunchBrowser(){  
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://live.demoguru99.com/index.php/");
	 }
	
	  @Test
	  public void VerifyPageTitle(){
		  
		  System.out.println(driver.getTitle());
		  Assert.assertTrue(true);   
		  
		  driver.findElement(By.xpath("//a[@href='http://live.demoguru99.com/index.php/mobile.html']")).click();
		 
		  System.out.println(driver.getTitle());
		  Assert.assertTrue(true);   
		  
		  WebElement dropdown = driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div/div[1]/div/select"));  
		  
		  Select select = new Select(dropdown);
		
		  select.selectByVisibleText("Name");
		  
		  driver.quit();
	   }
}
