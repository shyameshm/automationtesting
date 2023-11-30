import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.tracing.Tracing.RequestMemoryDumpResponse;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Okay')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Okay')]")).click();
		WebElement dropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select Role = new Select(dropDown);
		Role.selectByIndex(2);
		driver.findElement(By.cssSelector(".text-white.termsText")).click();
		driver.findElement(By.id("signInBtn")).click();
		WebDriverWait sipg = new WebDriverWait(driver, Duration.ofSeconds(5));
		sipg.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add ')]")));
		List<WebElement> addToCart = driver.findElements(By.xpath("//button[contains(text(),'Add')]"));
		
		
		for (int i=0;i<addToCart.size(); i++)
			
		{
			addToCart.get(i).click();			
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
