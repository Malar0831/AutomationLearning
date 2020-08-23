package com.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.maven.WrapperMethod;

public class flipKart {
	
	WrapperMethod wm;
	@BeforeTest
	public void LaunchApp()
	{
	  wm = new WrapperMethod();
	  wm.insertapp("https://www.flipkart.com/");
	}
	@Test
	public void search() {
		wm.enterbyxapth("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input","mobile");
		wm.enterkeyusingxpath("");
		}

}
