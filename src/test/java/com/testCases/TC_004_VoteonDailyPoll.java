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

import com.pageObjects.Votepoll;

public class TC_004_VoteonDailyPoll {
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
	public void vote() throws IOException, InterruptedException {
		 
		//Creating object of Votepoll page
		Votepoll vp=new Votepoll(driver);
		//click on Poll tab
		vp.ClickPoll();
		//click on first radio button to vote
		vp.VoteFor();
		
		/*WebElement radio=driver.findElement(By.name("aid"));
		
		String votedFor=driver.findElement(By.xpath("//section//div[contains(@class,'container')]//label[1]")).getText();
		radio.click();
	    System.out.println("voted for: "+votedFor);
		*/
		//click on Vote now button
		vp.ClickVotenow();
		}
		
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	 
}
