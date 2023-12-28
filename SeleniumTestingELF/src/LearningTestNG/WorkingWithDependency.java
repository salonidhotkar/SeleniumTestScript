package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithDependency {

	
        @Test(priority=1,dependsOnMethods = "Registration")
		public void Signin()
		{
			Reporter.log("SigIn to An Apllication",true);
		}
        @Test(priority=2)
        public void Registration()
        {
        	Reporter.log("Registration page is display",true);
	    }
        @Test(priority=3)
        public void FirstName()
        {
        	Reporter.log("Enter First name",true);
        }
        @Test(priority=4)
        public void LastName()
        {
        	Reporter.log("Enter Last Name",true);
        }
        
        @Test(priority=5)
        public void Password()
        {
        	Reporter.log("Enter password",true);
        }
        @Test(priority=6,dependsOnMethods = "Password")
        public void Confirmedpassword()
        {
        	Reporter.log("Enter ConfirmedPassword",true);
        }
        
        

}
