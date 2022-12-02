package org.grouppping;

import org.testng.annotations.Test;

public class A {

	@Test(groups= {"smoke","sanity"})
	public void testA1() {
		System.out.println("Test A1");
	}
	
	@Test(groups= {"smoke","regression"})
	public void testA2() {
		System.out.println("Test A2");
	}
	
	@Test(groups= {"retest","sanity"})
	public void testA3() {
		System.out.println("Test A3");
	}
	
	@Test(groups="smoke")
	public void testA4() {
		System.out.println("Test A4");
	}
	
	@Test(groups= {"smoke","retest"})
	public void testA5() {
		System.out.println("Test A5");
	}
	
	@Test(groups="sanity")
	public void testA6() {
		System.out.println("Test A6");
	}
	
	@Test(groups="regression")
	public void testA7() {
		System.out.println("Test A7");
	}
	
	@Test(groups="retest")
	public void testA8() {
		System.out.println("Test A8");
	}
	
	@Test
	public void testA9() {
		System.out.println("Test A9");
	}
}
