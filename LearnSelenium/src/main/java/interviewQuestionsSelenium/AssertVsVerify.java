package interviewQuestionsSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {
	
	/*
	 * @Test public void TestAssert() { System.out.println("Before Assertion");
	 * //Hard Assertion Assert.fail();//Assert.assertEquals(true, false); both are
	 * same System.out.println("After Assertion"); }
	 */
	
	@Test
	public void testVerify() {
		System.out.println("Before Assertion");
		SoftAssert softAssert = new SoftAssert();
		softAssert.fail();
		System.out.println("After Assertion");
	}
}
