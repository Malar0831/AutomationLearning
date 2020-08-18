package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethods {
	    private static final boolean False = false;
		private static final boolean True = false;
		@Test(description="Login OrangeHRM")
		public void login()
		{
	    	System.out.println("Test Case login");
		}
		@Test(dependsOnMethods="login")
		public void search()
		{
			System.out.println("Test Case search");
			Assert.assertEquals("abc", "xyz");
		}
		@Test(dependsOnMethods="search",alwaysRun=False)
		public void logout()
		{
			System.out.println("Test Case logout");
		}
		}
