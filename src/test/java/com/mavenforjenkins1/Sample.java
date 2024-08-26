package com.mavenforjenkins1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Sample {
	
	@Test
	public void startTesting() {
		
		System.out.println("Parameter value is : ");
		WebDriver driver;
	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		driver.get("https://www.google.com");
		System.out.println("-----");
		String Title = driver.getTitle();
		System.out.println("Title of the WebPage : " +Title);
		driver.quit();
	}
}