package org.parallelll;

import org.testng.annotations.Test;

public class B {

	@Test(groups= {"smoke","sanity"})
	public void testB1() {
		System.out.println("Test B1");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups= {"retest","sanity"})
	public void testB2() {
		System.out.println("Test B2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups= {"regression","smoke"})
	public void testB3() {
		System.out.println("Test B3");
		System.out.println(Thread.currentThread().getId());
	}
	
}
