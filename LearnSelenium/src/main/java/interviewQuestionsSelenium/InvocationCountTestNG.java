package interviewQuestionsSelenium;

import org.testng.annotations.Test;

public class InvocationCountTestNG {
	
	@Test(invocationCount = 3)
	public void PrintThreeTime() {
		System.out.println("Im Mukesh");
	}

}
