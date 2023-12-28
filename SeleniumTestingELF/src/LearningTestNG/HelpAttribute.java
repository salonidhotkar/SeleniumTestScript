package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelpAttribute {//TestNG class
	@Test(priority=1)
	public void test() //Test case
	{
		Reporter.log("lets start TestNg",true);
	}
	@Test(priority=0)
	public void learn()
	{
		Reporter.log("End",true);
	}
	@Test(priority=2)
	public void pause()
	{
		Reporter.log("pause Method",true);
	}

}
