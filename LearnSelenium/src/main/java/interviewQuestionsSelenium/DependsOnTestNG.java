package interviewQuestionsSelenium;

import org.testng.annotations.Test;

public class DependsOnTestNG {
	
//	@Test(timeOut = 1000)
//	public void ParentPermission() throws InterruptedException {
//		Thread.sleep(3000);
//		System.out.println("Permission Granted");
//	}
//	
//	@Test(dependsOnMethods = "ParentPermission", alwaysRun = true)
//	public void Marriage() {
//		System.out.println("Succesfully 90's Kid Married");
//	}
	
	@Test(groups = "ParentsPermission")
	public void BoyParentPermission() throws InterruptedException {

		System.out.println(" Boy Parents Permission Granted");
	}
	
	@Test(groups = "ParentsPermission",timeOut = 1000)
	public void GirlParentPermission() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Girl Parents Permission Granted");
	}
	
	@Test(dependsOnGroups = "ParentsPermission",alwaysRun = true)
	public void Marriage() {
		System.out.println("Succesfully 90's Kid Married");
	
	}
	

}
