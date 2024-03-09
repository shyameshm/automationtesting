package Pages;

import org.openqa.selenium.By;

import Base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage entercompanyname() {
		
		driver.findElement(By.id("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
		
		return this;
		
	}
	
	public CreateLeadPage enterfirstname() {
		
		driver.findElement(By.id("//input[@id='createLeadForm_firstName']")).sendKeys("James");
		
		return this;
		
	}
	
	public CreateLeadPage enterlastname() {
		
		driver.findElement(By.id("//input[@id='createLeadForm_lastName']")).sendKeys("Hope");
		
		return this;
	}

public ViewLeadPage clickcreateleadbutton() {
		
		driver.findElement(By.name("submitButton")).click();
		
		return new ViewLeadPage();
	}
}
