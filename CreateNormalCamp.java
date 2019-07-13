package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateNormalCamp {
	
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
	@Test (priority=3)
	public void normal_camp()
	{
		WebElement element = driver.findElement(By.xpath("//*[@id=\"bt\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		Select dropdown =new Select(driver.findElement(By.id("my-dropdown")));
		dropdown.selectByVisibleText("Campaign Set-up");
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"centertext\"]/a/button"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);
		
		driver.findElement(By.id("id_io_number")).sendKeys("111");
		driver.findElement(By.id("id_name")).sendKeys("Normal Script Demo");
		driver.findElement(By.id("id_description")).sendKeys("Demo Purpose");
		
		Select s2=new Select(driver.findElement(By.id("id_type")));
		s2.selectByValue("2");
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[2]/a/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/button")).click();
		
		driver.findElement(By.id("currency-field1")).sendKeys("55");
		
		driver.findElement(By.id("currency-field2")).sendKeys("200");
		
		driver.findElement(By.id("currency-field3")).sendKeys("100");
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[10]/div/div/div/div/input[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/span[9]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[11]/div/div/div/div/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[27]")).click();
		
		driver.findElement(By.id("id_tc_vendor")).click();
		driver.findElement(By.id("id_internal_vendor")).click();
		driver.findElement(By.id("id_external_vendor")).click();
		//Reset Campaign
		//driver.findElement(By.xpath("//*[@id=\"btn_reset\"]")).click();
		
		//driver.findElement(By.xpath("//*[@class=\"form-horizontal\"]/fieldset[1]/div/div[13]/div/div/div[1]/button/span")).click();
		
		WebElement element3 = driver.findElement(By.xpath("//*[@class=\"form-horizontal\"]/fieldset[1]/div/div[13]/div/div/div[1]/button/span"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", element3);
		
	}	

}
