package testng;

import java.time.Duration;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngtest1 {

	WebDriver driver = new ChromeDriver();

	@Parameters({"URL"})
	@Test
	public void webApp(String urlname) {

		System.out.println("This is a test in first project");
		System.out.println(urlname);
		driver.get(urlname);
	}

	@BeforeTest
	public void webApp1() {

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		System.out.println(driver.getTitle());
	}

	@AfterTest
	public void WebApp2() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.close();

	}
}
