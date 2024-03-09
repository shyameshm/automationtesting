package Testcases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethods;
import Pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods {
	
	@Test
	public void verifylogin() {
		
		//enterusername --> it is available in login page
		
		LoginPage lp = new LoginPage();
		
		lp.enterusername()
		.enterPassword()
		.clickloginbutton()
		.clickcrmsfalink()
		.clicklleadstab()
		.clickcreateleadoption()
		.entercompanyname()
		.enterfirstname()
		.enterlastname()
		.clickcreateleadbutton().verifyViewLeadPage();
		
		
		
		
		
		
	}

}
