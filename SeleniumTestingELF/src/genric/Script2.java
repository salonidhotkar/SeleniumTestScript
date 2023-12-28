package genric;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script2 extends BaseScript {
	
	@Test
	public void method2() {
		Reporter.log("From method2",true);
	}

}
