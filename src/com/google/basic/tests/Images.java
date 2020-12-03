package com.google.basic.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Images {
public void imagelink(WebDriver driver){
	WebElement image = driver.findElement(By.xpath("//a[text()='Images']"));
	Assert.assertTrue(image.isDisplayed());
	
	image.click();	
	Assert.assertEquals("Google Images", driver.getTitle());
	
	driver.findElement(By.xpath("//div[@id='hplogo']")).getText();	
	
}
}
