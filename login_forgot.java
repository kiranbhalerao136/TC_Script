package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login_forgot {
	
	WebDriver driver;
	@Test (priority=1)
	public void open_tc()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.20.220:85");
	}
	@Test (priority=2)
	public void login() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("test@client26.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/strong/strong/div[1]/form/div/div/div[4]/center/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"navbar-mobile\"]/div/ul[3]/li/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-mobile\"]/div/ul[3]/li/ul/li[2]/a")).click();
	}
	@Test (priority=3)
	public void forgot() throws InterruptedException
	{
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.name("username")).sendKeys("kiran.bhalerao@trigensoft.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/strong/strong/div[1]/form/div/div[2]/div[2]/center/button")).click();
		Thread.sleep(8000);
		
		driver.close();
	
	}
	
}
