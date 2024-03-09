package Pages;

import org.openqa.selenium.By;

import Base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public CreateLeadPage clickcreateleadoption() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		return new CreateLeadPage();
	}

}
