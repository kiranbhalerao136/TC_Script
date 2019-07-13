package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Vendor_OnBoarding {

WebDriver driver;
	
	@Test (priority=1)
	public void define()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");
		driver =new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://192.168.20.220:85");
	}
	@Test (priority=2)
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("test@vendor111.com");
		driver.findElement(By.name("password")).sendKeys("Tech@123#");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/strong/strong/div[1]/form/div/div/div[4]/center/button")).click();
	}
	@Test (priority=3)
	public void onboard()
	{
		driver.navigate().refresh();
		driver.findElement(By.id("company_name")).sendKeys("Coditas");
		driver.findElement(By.id("website")).sendKeys("wwww.coditas.com");
		driver.findElement(By.id("address_line1")).sendKeys("Pune");
		driver.findElement(By.id("select2-country-container")).click();
			
		
	
//		driver.findElement(By.xpath("\"//span[@class=\\\"select2-dropdown select2-dropdown--above\\\"]/span[2]/ul/li[3]\"")).click();
		driver.findElement(By.xpath("//span[@class=\"select2-dropdown select2-dropdown--above\"]/span[2]/ul/li[3]")).click();
		
		//Select State
		driver.findElement(By.id("select2-state-container")).click();
		
		driver.findElement(By.xpath("//span[@class=\"select2-dropdown select2-dropdown--above\"]/span[2]/ul/li[3]")).click();
		
		//Select City
		driver.findElement(By.id("select2-cities-container")).click();
		//driver.findElement(By.xpath("//*[@id=\"onboradingform-p-0\"]/div/div[1]/div[5]/div/div/ul/li[2]/span/label/span")).click();
		driver.findElement(By.xpath("//*[@class=\"select2-dropdown select2-dropdown--above\"]/span[2]/ul/li[2]")).click();
		
		
		//Phone 
		driver.findElement(By.id("phone")).sendKeys("4545");
		
		//Alternate no
		driver.findElement(By.id("alternate_number")).sendKeys("87877");
		
		//Addredd 2
		
		driver.findElement(By.id("address_line2")).sendKeys("addresscdcd");
		
		//Zip code
		driver.findElement(By.id("zip_code")).sendKeys("123");
		
		//Select Industry
		driver.findElement(By.xpath("//*[@id=\"industry_error\"]/div/span/span[1]/span/ul/li/input")).click();
		driver.findElement(By.xpath("//span[@class=\"select2-results\"]/ul/li[3]")).click();
		
	
		
		//Select Vendor Type	
		driver.findElement(By.xpath("//*[@id=\"vendor_error\"]/div/span/span[1]/span/ul")).click();
		driver.findElement(By.xpath("//span[@class=\"select2-dropdown select2-dropdown--above\"]/span/ul/li[2]")).click();	
		
		//Select Speciality
		driver.findElement(By.xpath("//*[@id=\"speciality_error\"]/div/span/span[1]/span/ul/li/input")).click();
		driver.findElement(By.xpath("//span[@class=\"select2-dropdown select2-dropdown--above\"]/span/ul/li[2]")).click();
		
		//Next 
	 	driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[2]/a")).click();
	   
		//Bussiness Card info
		/*driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.name("primary_name")).sendKeys("Ram");
		driver.findElement(By.name("primary_designation")).sendKeys("CEO,Manager");
		driver.findElement(By.name("primary_directdial")).sendKeys("56565");
		driver.findElement(By.name("primary_email")).sendKeys("Sham@ram.com");
		
		driver.findElement(By.name("secondary_name")).sendKeys("Virat Kohli");
		driver.findElement(By.name("secondary_designation")).sendKeys("Manager,Director");
		driver.findElement(By.name("secondary_directdial")).sendKeys("7776576");
		driver.findElement(By.name("secondary_email")).sendKeys("virat@kohli.com");*/
		
	 	driver.findElement(By.name("primary_name")).sendKeys("demo");
		driver.findElement(By.name("primary_directdial")).sendKeys("12345");
		driver.findElement(By.name("primary_designation")).sendKeys("CEO");
		driver.findElement(By.name("primary_email")).sendKeys("demo@test.com");
		
		driver.findElement(By.name("secondary_name")).sendKeys("example");
		driver.findElement(By.name("secondary_directdial")).sendKeys("123456");
		driver.findElement(By.name("secondary_designation")).sendKeys("Manager");
		driver.findElement(By.name("secondary_email")).sendKeys("example@test.com"); 

		driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[2]/a")).click();
		
		//Data Assessment
		driver.findElement(By.id("comp_overview")).sendKeys("No Data");
		driver.findElement(By.id("unique_value_prop")).sendKeys("Value Prop");
		//Sweet spot Geo
		driver.findElement(By.xpath("//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[3]/input[2]")).click();
		driver.findElement(By.xpath("//div[@class=\"dropdown-menu sweet_spot_toggle\"]/div/div/label[1]/input")).click();
		
		//Select Database Size
		driver.findElement(By.id("size_us")).sendKeys("101");

		driver.findElement(By.id("overall_size")).sendKeys("200");
		
		driver.findElement(By.id("size_us")).sendKeys("120");
		
		driver.findElement(By.xpath("//*[@class=\"steps-validation wizard clearfix\"]/div[2]/fieldset[3]/div/div[2]/div[7]/div[1]/label/input")).click();
		
		driver.findElement(By.xpath("//*[@class=\"content clearfix\"]/fieldset[3]/div/div[2]/div[11]/label")).click();
		
		//Network and Publisher
		driver.findElement(By.xpath("//div[@class=\"content clearfix\"]/fieldset[3]/div/div[2]/div[11]/div[1]/label/span")).click();
		
		//Select HQ Location
		
		Select s1 =new Select(driver.findElement(By.name("hq_location")));
		s1.selectByVisibleText("United Kingdom");
		
		Select s2=new Select(driver.findElement(By.name("call_center_location")));
		s2.selectByValue("237");
		
		Select s3=new Select(driver.findElement(By.name("data_processing_location")));
		s3.selectByVisibleText("Albania");
		
		Select s4=new Select(driver.findElement(By.name("year_incorporated")));
		s4.selectByValue("2018");
		
		driver.findElement(By.id("complex_program_text_values7")).sendKeys("29");
		
		//Next
		driver.findElement(By.xpath("//*[@class=\"steps-validation wizard clearfix\"]/div[3]/ul/li[2]/a")).click();
		
		//Agreement Next
		
		driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[2]/a")).click();
		
		//Browse logo
		
		driver.findElement(By.xpath("//*[@id=\"company_logo\"]")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		
		//Finish
		
		driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[3]/a")).click();
		
		
		

		}
		
	}

