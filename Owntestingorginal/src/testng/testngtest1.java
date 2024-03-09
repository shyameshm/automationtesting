package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngtest1 {

	WebDriver driver = new ChromeDriver();

	@Test

	public void webApp() {
		System.out.println("This is a test in first project");
	}

	@BeforeTest
	public void webApp1 () {

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		System.out.println(driver.getTitle());
	}
	@AfterTest
	public void WebApp2 () {
	driver.close();

	}
}
