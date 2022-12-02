package org.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {

	@Parameters({"username", "password"})
	@Test
	public void testA1(String user,String pass) {
		System.out.println("Test A1");
		System.out.println(user);
		System.out.println(pass);
	}
	
	@Parameters({"password"})
	@Test
	public void testA2(String pass) {
		System.out.println("Test A2");
		System.out.println(pass);

	}
	
	@Test
	public void testA3() {
		System.out.println("Test A3");

	}

}
