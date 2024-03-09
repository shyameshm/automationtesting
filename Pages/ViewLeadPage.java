package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	public ViewLeadPage verifyViewLeadPage() {
		
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(text.equals("Hari")) {
			System.out.println("Firstname is verified");
		}else {
			System.out.println("Firstname is not verified");
		}
		return this;
		
	}
}