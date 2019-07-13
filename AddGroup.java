package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddGroup {

	WebDriver driver;
	
	@Test
	public void define()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");
		driver =new ChromeDriver();
	    driver.manage().window().maximize();
		//driver.get("http://192.168.20.220:85");
		driver.get("http://18.222.10.190/");
	}
	
	@Test (priority=2)
	public void login()
	{

		//driver.findElement(By.name("username")).sendKeys("kiran.bhalerao@trigesoft.com");
		driver.findElement(By.name("username")).sendKeys("test@client.com");
		//driver.findElement(By.name("password")).sendKeys("Tech@123#");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/strong/strong/div[1]/form/div/div/div[4]/center/button")).click();
	}
	
	@Test (priority=3)
	public void accesscontrol() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"AccessControl\"]/a")).click();
		
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ManageUsers\"]/a"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);
		
	
		
		WebElement element2 = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[1]/div[2]/span/button[2]"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", element2);
		
	
		
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"add_group\"]"));
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();", element4);
		
		
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.name("group"))).sendKeys("Demo Group").perform();
		
		
	
//		Actions builder1 = new Actions(driver);
//		builder1.moveToElement(driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/div/button"))).perform();
		
		//driver.switchTo().activeElement();
		driver.findElement(By.xpath("//*[@class=\"swal-overlay swal-overlay--show-modal\"]/div[1]/div[4]/div[1]/button")).click();

	}
	
	
	
}
