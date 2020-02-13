package com.testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_003_UniqueiconsInRed {
	
	WebDriver driver;
	
	// Selenium WebDriver version used 3.141.59
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//Launch browser
		driver.get("https://slashdot.org");
		//maximize window size
		 driver.manage().window().maximize();
	}
	@Test
	public void CountRedArticle() throws IOException, InterruptedException {
		
		List<WebElement> l=driver.findElements(By.xpath("//span[@class='topic']/a/img"));
		//count no of unique icons from page
		int count=l.size();
		System.out.println("No of unique icons: "+count);
		//printing all unique icons from page
		for(WebElement el:l)
		{
			
			String t=el.getAttribute("title");
			System.out.println("Title: "+t);
		}
		
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	 
}
