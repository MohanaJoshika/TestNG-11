package org.dataproviderss;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {

	@Test(dataProvider="login")
	public void testA1(String user,String pass) {
		System.out.println("Test A1");
		System.out.println(user);
		System.out.println(pass);
	}
	
	
	@Test
	public void testA2() {
		System.out.println("Test A2");
		

	}
	
	@Test
	public void testA3() {
		System.out.println("Test A3");

	}

	@DataProvider(name="login")
	private Object[][] data() {
		Object[][] obj= new Object[][] {
			{"mohana","1234565"},
			{"kayal","568987"}
		};
		return obj;

}
}