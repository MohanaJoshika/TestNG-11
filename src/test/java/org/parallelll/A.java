package org.parallelll;

import org.testng.annotations.Test;

public class A {

	@Test(groups= {"smoke","sanity"})
	public void testA1() {
		System.out.println("Test A1");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups= {"smoke","regression"})
	public void testA2() {
		System.out.println("Test A2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups= {"retest","sanity"})
	public void testA3() {
		System.out.println("Test A3");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups="smoke")
	public void testA4() {
		System.out.println("Test A4");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups= {"smoke","retest"})
	public void testA5() {
		System.out.println("Test A5");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups="sanity")
	public void testA6() {
		System.out.println("Test A6");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups="regression")
	public void testA7() {
		System.out.println("Test A7");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups="retest")
	public void testA8() {
		System.out.println("Test A8");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	public void testA9() {
		System.out.println("Test A9");
		System.out.println(Thread.currentThread().getId());
	}
	
}
