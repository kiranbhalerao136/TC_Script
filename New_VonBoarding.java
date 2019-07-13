package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class New_VonBoarding {
	WebDriver driver;
	
	
	@Test
	public void open() {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.get("http://192.168.20.220:85/");
 
    
    driver.findElement(By.name("username")).sendKeys("test@vendor111.com");
	driver.findElement(By.name("password")).sendKeys("Tech@123#");
	
	driver.findElement(By.cssSelector(".login_btn")).click();
 
	//company info
	driver.findElement(By.name("user_name")).sendKeys("vendor@2nd July");
	driver.findElement(By.name("contact")).sendKeys("42153214");
	driver.findElement(By.name("website")).sendKeys("www.test.com");
	//driver.findElement(By.id("alternate_number")).sendKeys("123654");
	driver.findElement(By.name("address_line1")).sendKeys("pune");
	driver.findElement(By.name("address_line2")).sendKeys("pune");
                                	
	driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]")).click();
	driver.findElement(By.xpath("//span[@class=\"select2-dropdown select2-dropdown--above\"]/span[2]/ul/li[3]")).click();

	driver.findElement(By.xpath("//*[@id=\"select2-state-container\"]")).click();
	driver.findElement(By.xpath("//span[@class=\"select2-dropdown select2-dropdown--above\"]/span[2]/ul/li[3]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"select2-cities-container\"]")).click();
	driver.findElement(By.xpath("//span[@class=\"select2-dropdown select2-dropdown--above\"]/span[2]/ul/li[2]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"vendor_error\"]/div/span/span[1]/span/ul")).click();
	driver.findElement(By.xpath("//*[@class=\"select2-dropdown select2-dropdown--above\"]/span/ul/li[2]")).click();
	
	driver.findElement(By.id("zip_code")).sendKeys("123abc");
	
    driver.findElement(By.xpath("//*[@id=\"industry_error\"]/div/span/span[1]/span/ul/li/input")).click();
	driver.findElement(By.xpath("//*[@class=\"select2-dropdown select2-dropdown--above\"]/span/ul/li[2]")).click();
	
	
	driver.findElement(By.xpath("//*[@id=\"speciality_error\"]/div/span/span[1]/span/ul/li/input")).click();
	driver.findElement(By.xpath("//*[@class=\"select2-dropdown select2-dropdown--above\"]/span/ul/li[2]")).click();
	                              
	driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[2]/a")).click();
	
	//business card info
	driver.findElement(By.name("primary_name")).sendKeys("demo");
	driver.findElement(By.name("primary_directdial")).sendKeys("12345");
	driver.findElement(By.name("primary_designation")).sendKeys("CEO");
	driver.findElement(By.name("primary_email")).sendKeys("demo@test.com");
	
	driver.findElement(By.name("secondary_name")).sendKeys("example");
	driver.findElement(By.name("secondary_directdial")).sendKeys("123456");
	driver.findElement(By.name("secondary_designation")).sendKeys("Manager");
	driver.findElement(By.name("secondary_email")).sendKeys("example@test.com");
	
	driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[2]/a")).click();
	
	
	driver.findElement(By.name("comp_overview")).sendKeys("demo");
	driver.findElement(By.name("unique_value_prop")).sendKeys("CEO");
	
	Select ss = new Select(driver.findElement(By.name("hq_location")));
	ss.selectByVisibleText("United Kingdom");
	
	
	Select s1 = new Select(driver.findElement(By.name("call_center_location")));
	s1.selectByVisibleText("United Kingdom");
	

    Select s2= new Select(driver.findElement(By.xpath("//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[3]/select")));
    s2.selectByVisibleText("United States");
    
    Select s3= new Select(driver.findElement(By.name("year_incorporated")));
    s3.selectByVisibleText("2018");
    
    driver.findElement(By.name("size_us")).sendKeys("50");
    driver.findElement(By.name("overall_size")).sendKeys("100");
    driver.findElement(By.name("optin")).sendKeys("50");
    
    driver.findElement(By.xpath("//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[5]/div[1]/label/span")).click();
    driver.findElement(By.xpath("//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[7]/div[1]/label/span")).click();
    
    
    driver.findElement(By.xpath("//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[7]/div[2]/div[1]/label/span")).click();
    driver.findElement(By.xpath("//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[10]/div[2]/label/span")).click();
    driver.findElement(By.xpath("//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[11]/div[2]/label/span")).click();
    driver.findElement(By.xpath("//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[8]/div[4]/div[1]/label/span")).click();
    
    driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[2]/a")).click();
    
    driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[2]/a")).click();
    
   
  //  driver.findElement(By.xpath("//*[@id=\"onboradingform-p-4\"]/div/div/div[2]/div/input")).sendKeys("C:\\Users\\Trigen\\Desktop\\images.png");
	driver.findElement(By.xpath("//*[@class=\"form-group file-field2\"]/div/input")).sendKeys("C:\\Users\\Trigen\\Desktop\\images");
	driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[3]/a")).click();
	
}
}