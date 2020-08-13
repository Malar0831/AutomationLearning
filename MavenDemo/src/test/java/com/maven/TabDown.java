package com.maven;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TabDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//*[@id=\'src\']")).sendKeys("che");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).perform();
		TakesScreenshot ts =(TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source,new File(("src/test/resources/screen/redbusin.png")));
		
}
}
