package com.pageObjects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Votepoll {

	 WebDriver driver;
	
	//Constructor 
	public Votepoll(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")
	WebElement poll;
	
	public void ClickPoll()
	{
		poll.click();
	}
	
	
	@FindBy(xpath="//div[contains(@class,'container')]//label[1]//input[1]")
	WebElement radio;
	
	public void ClickRadioButton()
	{
		radio.click();
	}
	
	@FindBy(xpath="//section//div[contains(@class,'container')]//label[1]")
	WebElement votefor;
	
	public void VoteFor()
	{
		votefor.click();
	}
			
			
	@FindBy(xpath="//button[@class='btn-polls']")
	WebElement vote;
	
	public void ClickVotenow()
	{
		vote.click();
	}	
	
	//WebElement poll=driver.findElement(By.);
	//poll.click();
	//WebElement radio=driver.findElement(By.name("aid"));
	//String votedFor=driver.findElement(By.xpath("//section//div[contains(@class,'container')]//label[1]")).getText();
	//radio.click();
	//System.out.println("voted for: "+votedFor);
	//WebElement votenow=driver.findElement(By.xpath("//button[@class='btn-polls']"));
	//votenow.click();
	
@FindBy(xpath="//span[@class='story-title']")
@CacheLookup
WebElement greenarticle;

public int countGreenArticle()
{
	//WebDriverWait wait=new WebDriverWait(driver,10);
	List<WebElement> l=driver.findElements(By.xpath("//span[@class='story-title']"));
	//wait.until(ExpectedConditions.visibilityOfAllElements(l));
	
	int count=l.size();
	return count;
	
}

	
	
}
