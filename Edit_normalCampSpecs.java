package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit_normalCampSpecs {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void define()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");
		driver =new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://192.168.20.220:85");
	}
	@Test (priority=2)
	public void login() {

		driver.findElement(By.name("username")).sendKeys("kiran.bhalerao@trigesoft.com");
		driver.findElement(By.name("password")).sendKeys("Tech@123#");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/strong/strong/div[1]/form/div/div/div[4]/center/button")).click();
	}

	@Test(priority=3)
	public void edit()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id=\"campaign\"]/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"PendingCampaign\"]/a"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);
		
		driver.findElement(By.xpath("//*[@id=\"Client_live_campaign_table\"]/tbody/tr[1]/td[2]")).click();
	}
}
