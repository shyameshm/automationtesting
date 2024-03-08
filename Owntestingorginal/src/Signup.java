import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://preprodtgg.goodgrid.com");
		String PageName = driver.getTitle();
		System.out.println(PageName);
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Assert.assertEquals(PageName, "Good Grid – Accountability. Transparency. Collaboration.");
		System.out.println("URL LOADED SUCCESSFULLY");
		driver.findElement(By.cssSelector("div[class='top_bar_right_wrapper'] a[class='action_button']")).click();
		driver.findElement(By.xpath("//div[@class='container-sub']//div[2]//p[1]//a[1]")).click();
		driver.findElement(By.xpath("//input[@id='fName']")).sendKeys("Caren");
		driver.findElement(By.id("lName")).sendKeys("Kelvin");

		WebElement DOBMonth = driver.findElement(By.id("month"));
		WebElement DOBDate = driver.findElement(By.id("date"));
		WebElement DOBYear = driver.findElement(By.id("year"));
		WebElement Gender = driver.findElement(By.id("gender"));

		Select Month = new Select(DOBMonth);
		Month.selectByIndex(6);

		Select Date = new Select(DOBDate);
		Date.selectByVisibleText("21");

		Select Year = new Select(DOBYear);
		Year.selectByValue("1993");

		Select usergender = new Select(Gender);
		usergender.selectByIndex(3);

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		String Email = sdf.format(date);
		driver.findElement(By.id("regEmail")).sendKeys(Email + "fg@mailinator.com");

		driver.findElement(By.cssSelector(
				".ng-tns-c44-1.ui-dropdown-label.ui-inputtext.ui-corner-all.ui-placeholder.ng-star-inserted")).click();
		driver.findElement(By
				.cssSelector(".ui-dropdown-filter.ui-inputtext.ui-widget.ui-state-default.ui-corner-all.ng-tns-c44-1"))
				.sendKeys("ark");
		driver.findElement(By.xpath("//span[contains(text(),'Arkansas')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ng-tns-c44-2.ui-dropdown.ui-widget.ui-state-default.ui-corner-all"))
				.click();
		driver.findElement(By
				.cssSelector(".ui-dropdown-filter.ui-inputtext.ui-widget.ui-state-default.ui-corner-all.ng-tns-c44-2"))
				.sendKeys("Little");
		driver.findElement(By.cssSelector("li[aria-label='Little Rock'] span[class='ng-star-inserted']")).click();
		driver.findElement(By.id("zipcode")).sendKeys("72201");
		System.out.println("new test");

	}

}
