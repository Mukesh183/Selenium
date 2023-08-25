package testNGLearning;

import org.testng.annotations.Test;

public class SkipTestCaseExample {
	
	@Test(priority = 0)
	public void startACar() {
		System.out.println("Start the Car");		
	}
	@Test(priority = 1)
	public void putFirstGear() {
		System.out.println("Move to First Gear");
	}
	@Test(priority = 2)
	public void putSecondGear() {
		System.out.println("Move to Second Gear");
	}
	@Test(priority = 3)
	public void putThirdGear() {
		System.out.println("Move to Third Gear");
	}
	@Test(priority = 5,enabled = false)
	public void startMusic() {
		System.out.println("Start the Music");
	}
	@Test(priority = 4)
	public void putFourthGear() {
		System.out.println("Move to Fourth Gear");
	}
}
