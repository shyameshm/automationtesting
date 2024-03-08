import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("unit");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Actions mselection = new Actions(driver);
		WebElement country = driver.findElement(By.xpath("//div[text()='United States (USA)']"));
		mselection.moveToElement(country).click().perform();
		driver.quit();
		

	}

}
