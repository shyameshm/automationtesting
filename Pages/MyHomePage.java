package Pages;

import org.openqa.selenium.By;

import Base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyLeadsPage clicklleadstab() {
		
		driver.findElement(By.linkText("Leads")).click();
		
		return new MyLeadsPage();
		
	}

}
