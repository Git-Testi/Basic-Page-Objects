package com.google.basic.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SearchBox {
public void textBox(WebDriver driver){
	driver.findElement(By.name("q")).sendKeys("Selenium");
	
	WebElement title = driver.findElement(By.name("btnK"));
	Actions action = new Actions(driver);
	action.moveToElement(title).build().perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	title.click();
	String searchtitle = driver.getTitle();
	Assert.assertEquals("Selenium - Google Search", searchtitle);
	
}
}
