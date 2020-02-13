package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.Votepoll;

public class TC_001_LuanchBrowser {
	WebDriver driver;
	@Test
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://slashdot.org");
		 driver.manage().window().maximize();
		 driver.close();
	}

	
	
}
