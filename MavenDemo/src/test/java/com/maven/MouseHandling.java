package com.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//click submit button
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	 WebElement admin = driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b"));
	 WebElement qualification = driver.findElement(By.xpath("//*[@id=\'menu_admin_Qualifications\']"));
	 WebElement lanuagaes = driver.findElement(By.xpath("//*[@id=\'menu_admin_viewLanguages\']"));
	 Actions action = new Actions(driver);
	 action.moveToElement(admin).perform();
	 Thread.sleep(3000);
	 action.moveToElement(qualification).perform();
	 action.moveToElement(lanuagaes).build().perform();
			 }

}
	
