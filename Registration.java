package basic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {
WebDriver driver;
	
	@Test
	public void open() {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.get("http://192.168.20.220:85");
    

    driver.findElement(By.linkText("Create New Account")).click();
    driver.findElement(By.name("email")).sendKeys("test@vendor111.com");
    driver.findElement(By.name("password")).sendKeys("Tech@123#");
    driver.findElement(By.name("confirmpassword")).sendKeys("Tech@123#");
    
    
    Select s= new Select(driver.findElement(By.name("usertype")));
  s.selectByVisibleText("vendor");
 //  s.selectByVisibleText("client");
    driver.findElement(By.cssSelector(".login_btn")).click();

	}                              

}
