package com.TestNG;

import org.testng.annotations.Test;
public class DependsUponGroups {
	@Test(groups= {"smoke","Regression Testing"})
	public void testCase1()
	{
		System.out.println("Test Case 1");
	}
	@Test(groups= {"smoke","Sanity Testing"})
	public void testCase2()
	{
		System.out.println("Test Case 2");
	}
	@Test(groups= {"Functional Testing","Retesting Testing"})
	public void testCase3()
	{
		System.out.println("Test Case 3");
	}
	
}
