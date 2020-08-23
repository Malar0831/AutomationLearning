package com.TestNG;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.maven.WrapperMethod;

public class callWrapper {
	WrapperMethod wm = new WrapperMethod();
		@BeforeMethod
		public void launchApp() {
			  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		}
		 @Test
		 public void login() {
		 wm.enterbyid("txtUsername", "Admin");
		  wm.enterbyid("txtPassword", "admin123");
		  wm.clickbyxpath("//*[@id=\'btnLogin\']");
		 }
		 @AfterMethod
		 public void closeApp() {
		 wm.closeapp();
	}

}
