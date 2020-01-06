package com.selenium.maven.MavenProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	
	@Test
	public void test1() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.facebook.com");
		Thread.sleep(3000);
		driver.quit();
	}
	

}
