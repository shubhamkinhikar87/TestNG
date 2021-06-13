package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Parameters({"URL","API_token"})
	@Test
	public void mobileLoginCarLoan(String urlName, String apiToken) {
		
		System.out.println("Mobile Login Car loan");
		System.out.println(urlName);
		System.out.println(apiToken);
	}
	
	@Test
	public void mobileSigninCarLoan() {
		
		System.out.println("Mobile Sign-in Car loan");
	}
	
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("I am the no 1");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("I am the no 1 from last");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileSignoutCarLoan() {
		
		System.out.println("Mobile Sign-out Car loan");
	}
	
	@Test
	public void webLoginCarLoan() {
		
		System.out.println("Web Login Car loan");
	}
	@Test
	public void apiLoginCarLoan() {
		
		System.out.println("API Login Car loan");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("I will execute before every test in Day3 Classs");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("I will execute after every test in Day3 Classs");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Execute after all test execution is done in the class");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Execute before any of the test will execute in the class");
	}
	

}
