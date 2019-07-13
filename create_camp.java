package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class create_camp {
	
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
		driver.findElement(By.name("username")).sendKeys("test@client26.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/strong/strong/div[1]/form/div/div/div[4]/center/button")).click();
	}
	@Test (priority=3)
	public void create() throws InterruptedException
	{

		WebElement element = driver.findElement(By.xpath("//*[@id=\"bt\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		
		Select dropdown=new Select(driver.findElement(By.id("my-dropdown")));
		dropdown.selectByIndex(1);
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"centertext\"]/a/button"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element1);
		
		driver.findElement(By.id("id_io_number")).sendKeys("101");
		
		driver.findElement(By.id("id_name")).sendKeys("RFQ 3rd July");
		
		driver.findElement(By.id("id_description")).sendKeys("Demo Purpose Campaign");
		
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[4]/div/div/div/div/div/div/button"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element2);
		
		
		
	    driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[4]/div/div/div/div/div/div/ul/li[3]/a/label/input")).click();
	    
	    WebElement element3 = driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[4]/div/div/div/div/div/div/button"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element3);
		
		
		
		
		
		//Select Geo
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[5]/div/div/div[1]/input[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"5\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[5]/div/div/div[2]/div[2]/button[2]")).click();
		
		//Select Industry
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[6]/div/div/div/div/div/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[6]/div/div/div/div/div/div/ul/li[3]/a/label/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[6]/div/div/div/div/div/div/button")).click();
		
		
		//Add job title
		
		driver.findElement(By.id("id_job_title_function")).sendKeys("MAnager");
		
		//Emp Size
	    WebElement element4 = driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[8]/div/div/div/div/div[1]/div/button/span"));
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element4);
		
//		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[8]/div/div/div/div/div[1]/div/button/span")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[8]/div/div/div/div/div[1]/div/ul/li[3]/a/label/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[8]/div/div/div/div/div[1]/div/button/span")).click();
		
		
		//ABM
		
		driver.findElement(By.xpath("//*[@id=\"id_abm_status\"]")).click();
		
		//Suppression
		
		driver.findElement(By.xpath("//*[@id=\"id_suppression_status\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[11]/div/div/div[1]/div/label/div/span/input")).click();
		
		
		//TQ
		driver.findElement(By.xpath("//*[@id=\"currency-field\"]")).sendKeys("120");
		
		
		//Select Start Date
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[13]/div/div/div/div/input[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[9]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[14]/div/div/div/div/input[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/span[27]")).click();
		
		
		//Quotation Exp
		
		driver.findElement(By.xpath("//*[@id=\"id_rfq_timer\"]")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[5]/div")).click();
		
		
		//Special Instruction
		
		driver.findElement(By.id("id_special_instructions")).sendKeys("NO Data");
		
		//Select Vendor
		driver.findElement(By.id("id_tc_vendor")).click();
		
		driver.findElement(By.id("id_internal_vendor")).click();
		
		driver.findElement(By.id("id_external_vendor")).click();
		
		//Save Campaign 
		
		driver.findElement(By.xpath("//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[18]/div/div/div[1]/button")).click();
		
		//Reset Campaign
		
		//driver.findElement(By.xpath("//*[@id=\"btn_reset\"]")).click();
		

			
		
		

	}

}
