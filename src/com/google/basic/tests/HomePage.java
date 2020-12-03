package com.google.basic.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {

	public void HomePageTitle(WebDriver driver){
		Assert.assertEquals("Google", driver.getTitle());
		System.out.println(driver.getTitle());
		
		WebElement image = driver.findElement(By.tagName("img"));
		Boolean imageTest = image.isDisplayed();
		Assert.assertTrue(imageTest);
		System.out.println("Image is Present");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+links.size());
		for (WebElement currentlink:links){
			System.out.println(currentlink.getText().trim());
		}
	}
}
