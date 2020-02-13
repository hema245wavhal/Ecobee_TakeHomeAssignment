package com.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_005_PeopleVoted {
	WebDriver driver;
	
	// Selenium WebDriver version used is 3.141.59
	
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
		WebElement poll=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
		poll.click();
		WebElement radio=driver.findElement(By.name("aid"));
		String votedFor=driver.findElement(By.xpath("//section//div[contains(@class,'container')]//label[1]")).getText();
		radio.click();
		System.out.println("voted for: "+votedFor);
		WebElement votenow=driver.findElement(By.xpath("//button[@class='btn-polls']"));
		votenow.click();
		WebElement votecount=driver.findElement(By.xpath("//div[@class='poll-bar-text']"));
		String getcount=votecount.getText();
		System.out.println("Total no of people voted: "+getcount);
		}
		
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
