import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Shyamesh");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shyameshm@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password!23");
		driver.findElement(By.xpath("//label[normalize-space()='Check me out if you Love IceCreams!']")).click();
		driver.findElement(By.cssSelector("#exampleFormControlSelect1 option")).click();
		driver.findElement(By.xpath("//option[normalize-space()='Male']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Student']")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("21071993");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		String alertText = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		String[] splitted = alertText.split(" ");
		String finalAlert = " ";

		for (int i = 0; i < splitted.length; i++)

		{
			finalAlert = finalAlert + " " + splitted[i];

		}

		System.out.println(finalAlert.trim());
		Assert.assertEquals(finalAlert.trim(), alertText);
		driver.quit();

	}

}
