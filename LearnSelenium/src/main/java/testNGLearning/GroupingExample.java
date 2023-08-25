package testNGLearning;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups = {"Apple"})
	public void Apple1() {
		System.out.println("Apple");
		
	}
	@Test(groups = {"Apple"})
	public void Apple2() {
		System.out.println("Apple");
		
	}
	@Test(groups = {"Realme"})
	public void Realme1() {
		System.out.println("Realme");
		
	}
	@Test(groups = {"Realme"})
	public void Realme2() {
		System.out.println("Realme");
		
	}
	@Test(groups = {"Oppo"})
	public void Oppo1() {
		System.out.println("Oppo");
		
	}
	@Test(groups = {"Oppo"})
	public void Oppo2() {
		System.out.println("Oppo");
		
	}
	@Test(groups = {"Samsung"})
	public void Samsung1() {
		System.out.println("Samsung");
		
	}
	@Test(groups = {"Samsung"})
	public void Samsung2() {
		System.out.println("Samsung");
		
	}



}
