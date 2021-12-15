package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.VoluntarySignUp;
import baseClass.BaseClass;

public class TC_01_Signup extends BaseClass {
	
	@Test
	public void signUp()
	{

		TC_01_Signup su=new TC_01_Signup();
		VoluntarySignUp vsu = new VoluntarySignUp(driver);
		su.invokeBrowser();
		vsu.enterFirstName();
		su.closeBrowser();
		

	}
}


