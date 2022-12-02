package org.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {

	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	private void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test(priority =-4)
	private void test2() {
		System.out.println("Test 2");
	}
	
	@Test(enabled=false)
	private void test3() {
		System.out.println("Test 3");
	}
	
	@Test(priority =-4, invocationCount=0)
	private void test1() {
		System.out.println("Test 1");
	}
}
