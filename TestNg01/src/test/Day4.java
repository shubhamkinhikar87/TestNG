package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {
	
	
	@Test(dataProvider = "getData")
	public void testParamterization(String username, String password) {
		
		System.out.println("UserName : "+username+" Password : "+password);
	}
	
	
	@Test
	public void mobileLoginHomeLoan() {
		
		System.out.println("Mobile Login Home loan");
	}
	
	@Test(groups= {"Smoke"})
	public void webLoginHomeLoan() {
		
		System.out.println("Web Login Home loan");
	}
	@Test
	public void apiLoginHomeLoan() {
		
		System.out.println("API Login Home loan");
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="username01";
		data[0][1]="password01";
		
		data[1][0]="username02";
		data[1][1]="password02";
		
		data[2][0]="username03";
		data[2][1]="password03";
		
		return data;
		
		
	}
	

}
