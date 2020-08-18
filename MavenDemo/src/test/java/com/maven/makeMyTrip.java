package com.maven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/");
	//driver.findElement(By.id("fromCity")).click();
    //driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).sendKeys("P");
	Actions action = new Actions(driver);
	Thread.sleep(3000);
	action.sendKeys(Keys.ARROW_DOWN).perform();
	action.sendKeys(Keys.ENTER).perform();
	driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("BOM");
	Thread.sleep(3000);
	action.sendKeys(Keys.ARROW_DOWN).perform();
	action.sendKeys(Keys.ENTER).perform();
    driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[3]/div/p")).click();
    driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox')]/div/label/span[contains(@class,'lbl_input')]")).click();
	//moving to next month
	driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
	//select 11 oct 
	driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[1]/div/p")).click();
	//click on search
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	
    
    
    
    
    
    
	}
		
}


