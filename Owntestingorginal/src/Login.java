import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testtgg.goodgrid.com");
		String PageName = driver.getTitle();
		System.out.println(PageName);
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Assert.assertEquals(PageName, "Good Grid – Accountability. Transparency. Collaboration.");
		System.out.println("URL LOADED SUCCESSFULLY");
		driver.findElement(By.cssSelector("div[class='top_bar_right_wrapper'] a[class='action_button']")).click();
		driver.findElement(By.xpath("//input[@id='loginForm:username']")).sendKeys("testfg51@gboxz.com");
		driver.findElement(By.xpath("//input[@id='loginForm:password']")).sendKeys("Protech@123");
		driver.findElement(By.xpath("//input[@id='loginForm:loginButton']")).click();
		String homepage = driver.getTitle();
		System.out.println(homepage);
		System.out.println("Login Passed");
		driver.quit();

	}

}
