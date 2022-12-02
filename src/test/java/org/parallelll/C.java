package org.parallelll;

import org.testng.annotations.Test;

public class C {

	@Test(groups= {"smoke","sanity"})
	public void testC1() {
		System.out.println("Test C1");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups= {"retest","sanity"})
	public void testC2() {
		System.out.println("Test C2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups= {"regression","smoke"})
	public void testC3() {
		System.out.println("Test C3");
		System.out.println(Thread.currentThread().getId());
	}
	
}
