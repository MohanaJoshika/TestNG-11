package org.dataproviderss;

import org.testng.annotations.DataProvider;

public class Datas {

	@DataProvider(name="login")
	private Object[][] data() {
		Object[][] obj= new Object[][] {
			{"mohana","1234565"},
			{"kayal","568987"}
		};
		return obj;

}
	
	@DataProvider(name="reg")
	private Object[][] data1() {
		Object[][] obj= new Object[][] {
			{"Joshika","Karthi"},
			{"Moni","Karthi"}
		};
		return obj;

}
}