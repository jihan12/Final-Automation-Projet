package blazeDemoFinal;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Blazedemo_BookFlight {
	
	WebDriver driver;
	
  @Test
  public void flight_booking() throws Exception 
  {
	  driver.get("https://blazedemo.com/");
	  Thread.sleep(1000);
	  Select s;
	  	//departure city dropdown
		s = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"))); 
		s.selectByIndex(3);
		Thread.sleep(1400);
		//destination city dropdown
		s = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"))); 
		s.selectByVisibleText("Cairo");
		Thread.sleep(2000);
		
		//Find Flights button
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(2000);
		
		//choose this flight button
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();
		Thread.sleep(2000);
		
		/*
		 * Script to fill the form 
		 */
		driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("Jihan");
		Thread.sleep(700);
		
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("8th floor, D wing, opp. 90 degree cafee");
		Thread.sleep(700);
		
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Mumbai");
		Thread.sleep(700);
		
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Maharashtra");
		Thread.sleep(700);
		
		driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("400078");
		Thread.sleep(700);
		
		s = new Select(driver.findElement(By.xpath("//*[@id=\"cardType\"]")));
		s.selectByIndex(1);
		Thread.sleep(700);
		
		driver.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).sendKeys("152465 195948 154268");
		Thread.sleep(700);
		
		//Script to Clear Month Textbox
		driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).sendKeys("01");
		Thread.sleep(700);
		
		//Script to clear Year Textbox
		driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).sendKeys("2024");
		Thread.sleep(700);
		
		driver.findElement(By.xpath("//*[@id=\"nameOnCard\"]")).sendKeys("jihan Punia");
		Thread.sleep(700);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/label")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() throws Exception 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\jihan\\Documents\\Automation testing\\Browser Entension\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.close();
  }
}