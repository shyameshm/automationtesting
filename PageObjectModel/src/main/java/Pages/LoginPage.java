package Pages;

import org.openqa.selenium.By;

import Base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	//enter username
	
	public LoginPage enterusername() {
		
		driver.findElement(By.id("//input[@id='username']")).sendKeys("DemosalesManager");
		
		return this; //this keyword represents the object of the same page (same class)
		
	}
	
	//enter password
	
	public LoginPage enterPassword() {
		
		driver.findElement(By.id("//input[@id='password']")).sendKeys("Crmsfa");
		
		return this;
		
		
	}
	
	//click login button
	
	public HomePage clickloginbutton() {
	
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//we have to return object of home page.
	
	
	return new HomePage();
	
	
}
	

}
