package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(xpath="//td[contains(text(),'User: Satyaranjan Muduli')]")
	//@CacheLookup //if this annotation is written, code will be looking in the cache memory instead of going to html dump.
	//but in case the page gets refreshed, then cache memory gets corrupted and code will give stale element exception
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newcontactlink;
	
	public HomePage() throws IOException {
		//super();
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePagetitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName()
	{
		return userNameLabel.isDisplayed();
	}

	public void clickOnNewContactLink()
	{
		Actions action = new Actions(driver);
		action.moveToElement(contactLink).build().perform();
		newcontactlink.click();;
	}	
	

}
