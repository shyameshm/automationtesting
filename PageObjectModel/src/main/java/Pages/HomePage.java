package Pages;

import org.openqa.selenium.By;

import Base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public MyHomePage clickcrmsfalink() {
		
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		return new MyHomePage();
	}

}
