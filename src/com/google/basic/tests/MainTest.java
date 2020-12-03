package com.google.basic.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Misc\\Selenium1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
		HomePage homepage = new HomePage();
		homepage.HomePageTitle(driver);	
		
		Images images = new Images();
		images.imagelink(driver);
		
		SearchBox searchbox = new SearchBox();
		searchbox.textBox(driver);
		
		driver.quit();
	}

}
