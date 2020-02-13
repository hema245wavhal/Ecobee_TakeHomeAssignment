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

import com.base.BaseClass;
import com.pageObjects.Votepoll;



public class TC_002_ArticleInGreen
{
	WebDriver driver;
	
	// Selenium WebDriver version used 3.141.59
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://slashdot.org");
		driver.manage().window().maximize();
	}
	@Test
	public void CountGreenArticle() throws IOException, InterruptedException {
		
		List<WebElement> l=driver.findElements(By.xpath("//span[@class='story-title']"));
		//count no of Articles from page
		int count=l.size();
		System.out.println("No of green article: "+count);
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	 
}
