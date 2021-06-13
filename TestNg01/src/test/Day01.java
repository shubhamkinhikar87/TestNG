package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day01 {

	
	@AfterTest
	public void lastExecution() {
		
		System.out.println("I will execute Last in the current test");
	}
	
	
	@Test(groups= {"Smoke"})
	public void demo() {
		
		System.out.println("This is first demo of testNG");
	}
	
	@Test
	public void demo2() {
		
		System.out.println("Hi This is a Demo-2");
	}
	
	@BeforeTest
	public void prerequisite() {
		
		System.out.println("I will execute first in the current test");
	}
}
