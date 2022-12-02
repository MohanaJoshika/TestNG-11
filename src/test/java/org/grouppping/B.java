package org.grouppping;

import org.testng.annotations.Test;

public class B {

	@Test(groups= {"smoke","sanity"})
	public void testB1() {
		System.out.println("Test B1");
	}
	
	@Test(groups= {"retest","sanity"})
	public void testB2() {
		System.out.println("Test B2");
	}
	
	@Test(groups= {"regression","smoke"})
	public void testB3() {
		System.out.println("Test B3");
	}
	
}
